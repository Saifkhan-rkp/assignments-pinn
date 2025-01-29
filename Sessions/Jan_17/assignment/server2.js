const http = require("http");
const mysql = require("mysql2");
const url = require("url");
const querystring = require("querystring");

// Create connection to MySQL
const sqlServer = {
  con:undefined,
  host:"localhost",
  user:"root",
  password:"dark@123",
  database:"",
} 
const routes = {
  createDBRoute: "GET/createdb",
  createTableRoute: "GET/create-table",
  home:"GET/",
  search:"POST/search",
  connectToDB:"GET/connect",
  seed:"GET/seed"
}

/**
 * !NOTE: Retrive task 4 - 5
 */
const home = (req, res) =>{
  sqlServer.con.query("SELECT * FROM customers", (err, result) => {
    if (err) {
      res.writeHead(500, { "Content-Type": "text/html" });
      res.end("<h1>Error fetching customers from database!</h1>");
      return;
    }

    // Render the HTML page with the table of all customers
    let tableRows = result
      .map(
        (customer) =>
          `<tr><td>${customer.id}</td><td>${customer.name}</td><td>${customer.address}</td></tr>`
      )
      .join("");

    res.writeHead(200, { "Content-Type": "text/html" });
    res.end(`
      <h1>Customer List</h1>
      <form method="POST" action="/search">
        <label for="address">Search by Address:</label>
        <input type="text" id="address" name="address" required>
        <button type="submit">Search</button>
      </form>
      <table border="1">
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Address</th>
        </tr>
        ${tableRows}
      </table>
    `);
  });
}

/**
 * !NOTE: Create DB 'mydatabase' task 1
 */
const createDB = (req, res)=>{
  try {
    const con = mysql.createConnection({
      host: sqlServer.host,
      user: sqlServer.user,
      password: sqlServer.password,
    });
    con.connect(function(err) {
      if (err) throw err;
      console.log("Connected!");
      con.query("CREATE DATABASE mydatabase", function (err, result) {
        if (err) throw err;
        console.log("Database created -> ", result);
      });
    });
    con.destroy();
    res.writeHead(201, { "Content-Type": "text/html" });
    res.end("<h1>Database created successfully!</h1>");
  } catch (error) {
    console.log(error);
    res.writeHead(500, { "Content-Type": "text/html" });
    res.end("<h1>Internal Server Error</h1>");
  } 
}

/**
 * !NOTE: Search by query task 5
 */

const search = (req, res) => {
  try {

    if(typeof sqlServer.con === "undefined") throw new Error("SQL Server is not connected");

    let body = "";

    req.on("data", (chunk) => {
      body += chunk.toString();
    });

    req.on("end", () => {
      const formData = querystring.parse(body);
      const address = formData.address;

      // Query the database with the user-provided address
      sqlServer.con.query(
        "SELECT * FROM customers WHERE address = ?",
        [address],
        (err, result) => {
          if (err) {
            res.writeHead(500, { "Content-Type": "text/html" });
            res.end("<h1>Error fetching customers from database!</h1>");
            return;
          }

          // Render the filtered table
          let tableRows = result
            .map(
              (customer) =>
                `<tr><td>${customer.id}</td><td>${customer.name}</td><td>${customer.address}</td></tr>`
            )
            .join("");

          // If no results found, add a row indicating no customers
          if (result.length === 0) {
            tableRows = `<tr><td colspan="3">No customers found for the given address.</td></tr>`;
          }

          res.writeHead(200, { "Content-Type": "text/html" });
          res.end(`
            <h1>Customer List</h1>
            <form method="POST" action="/search">
              <label for="address">Search by Address:</label>
              <input type="text" id="address" name="address" required>
              <button type="submit">Search</button>
            </form>
            <table border="1">
              <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Address</th>
              </tr>
              ${tableRows}
            </table>
            <a href="/">View All Customers</a>
          `);
        }
      );
    });  
  } catch (error) {
    console.log(error);
    res.writeHead(500, { "Content-Type": "text/html" });
    res.end(`<h1>Internal Server Error : ${error?.message}</h1>`);
  }
  
}

const connect = (req, res)=>{
  try {
    const database = querystring.parse(req.url.split('?')[1])?.db || "mydatabase";
    if(typeof sqlServer.con === "undefined"){
      sqlServer.database = database;
      sqlServer.con = mysql.createConnection({
        host: sqlServer.host,
        user: sqlServer.user,
        password: sqlServer.password,
        database: database
      })
      res.writeHead(200, { "Content-Type": "text/html" });
      res.end(`<h1>Connected to SQL server with database-> ${database}</h1>`);
    } else {
      res.writeHead(200, { "Content-Type": "text/html" });
      res.end(`<h1>Connected to SQL server with database-> ${sqlServer.database}</h1>`);
    }
  } catch (error) {
    console.log(error);
    res.writeHead(500, { "Content-Type": "text/html" });
    res.end("<h1>Internal Server Error</h1>");
  }
}

const seed = async (req, res)=>{
  try {
    if (typeof sqlServer.con === 'undefined') {
      throw new Error('Connection not established');
    }
    let rows = 0;
    await sqlServer.con.connect(async function(err) {
      if (err) throw err;
      console.log("Connected!");
      var sql = "INSERT INTO customers (name, address) VALUES ?";
      var values = [
        ['Makemytrip', 'Mumbai'],
        ['Xerox', 'Pune'],
        ['Accenture', 'Gurgaon'],
        ['Wipro', 'Chennai'],
        ['Tata Consultancy', 'Bangalore'],
        ['Principal', 'Noida'],
        ['Cognizant', 'Hyderabad'],
        ['Infosys', 'Mysore'],
        ['HCL Technologies', 'Noida'],
    ];
      await sqlServer.con.query(sql, [values], function (err, result) {
        if (err) throw err;
        console.log("Number of records inserted: " + result.affectedRows);
        rows = result.affectedRows;
      });
    });
    
    res.writeHead(201, { "Content-Type": "text/html" });
    res.end(`<h1>Records inserted successfully</h1>`);
  } catch (error) {
    res.writeHead(500, { "Content-Type": "text/html" });
    res.end(`<h1>Internal Server Error : ${error?.message}</h1> <br/> <p>try to connect to database first /connect?db=dbname</p>`);
  }
}

/**
 * !NOTE: Create Table 'customers' task 2
 */

const createTable =(req, res) =>{
  try {
    if (typeof sqlServer.con === 'undefined') {
      throw new Error('Connection not established');
    }
    console.log("im here");
    sqlServer.con.connect(function(err) {
      if (err) throw err;
      console.log("Connected!");
      var sql = "CREATE TABLE customers (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), address VARCHAR(255))";
      sqlServer.con.query(sql, function (err, result) {
        if (err) throw err;
        console.log("Table created");
      });
    });
    res.writeHead(201, { "Content-Type": "text/html" });
    res.end(`<h1>${"customers"} Table created successfully</h1>`);
  } catch (error) {
    res.writeHead(500, { "Content-Type": "text/html" });
    res.end(`<h1>Internal Server Error : ${error?.message}</h1> <br/> <p>try to connect to database first /connect?db=dbname</p>`);
  }
}

// Create HTTP server
const server = http.createServer(async (req, res) => {
  const parsedUrl = url.parse(req.url);
  const path = req.method+parsedUrl.pathname;
  switch (path) {
    case routes.home:
      home(req, res);
      break;
    
    case routes.search:
        search(req, res);
      break;
    
    case routes.createDBRoute:
      createDB(req, res);
      break;
    case routes.createTableRoute:
      createTable(req, res);
      break;
    case routes.connectToDB:
      connect(req, res);
      break;
    case routes.seed:
      await seed(req, res);
      break;
    default:
      res.writeHead(404, { "Content-Type": "text/html" });
      res.end("<h1>404 Not Found</h1>");
      break;
  }

});

// Start the server on port 3000
server.listen(3000, () => {
  console.log("Server running at http://localhost:3000");
});

