var mysql = require('mysql2');

var con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "password",
  database: "mydatabase"
});

/**
 * !NOTE: Insert into table 'customers' task 1
 */

con.connect(function(err) {
  if (err) throw err;
  console.log("Connected!");
  var sql = "INSERT INTO customers (name, address) VALUES ?";
  var values = [
    ['Xerox', 'Pune'],
    ['Principal', 'Noida'],
    ['Infosys', 'Mysore'],
    ['Makemytrip', 'Mumbai'],
    ['Tata Consultancy', 'Bangalore'],
    ['Wipro', 'Chennai'],
    ['Cognizant', 'Hyderabad'],
    ['HCL Technologies', 'Noida'],
    ['Accenture', 'Gurgaon']
];

  con.query(sql, [values], function (err, result) {
    if (err) throw err;
    console.log("Number of records inserted: " + result.affectedRows);
  });
});
