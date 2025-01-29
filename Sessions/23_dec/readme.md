
## Priority Queue

but deletion of elements takeplace in terms of their priority that is at the top of the priority queue you will always have the smallest element when deletion takes place the smallest element is deleted and again the smallest out of the remaining element is placed on the top the priority queue for deletion we can change this by applying a new method of commparision for this we define a class which extends the predefined `Comparator` Class and override the `compareTo()` method which recieves two objects and definds the comparision logic it must return 1, -1 or 0 depending upon first object greater tha second oobject, first object smaller than second object or both objects are equal respectively.

> using the compare function of the comparator interface, define a priority queue which inserts a list of emp objects (consisting of name, age , bs) and the priority queue must remove the employee with lagest bs 

> difference between `offer()` and `add()`? can you function `offer()` on list based classes?   
>

## Map (Dictionary)

> ? define a list of classes and interfaces in the collections framework?
> ? what are the two methods adding elements to a map?
> ? can `TreeMap` elements get added in `LinkedHashMap`


# JDBC

Information storage when done in variable or objects is temporary in nature because when the progeram execution ends all variable and objects are physically deleted and hence information stored in them is lost to store it permanently we can use two methods 
1. Files
2. Database
file handling as well as reading and writing of information is very complex if line or data is the file is coruupted the entire logic is fail
seconly bidirectional traversing in a file is difficult information storage i   n tabular format is the most esiest and efficient way to store information and retrival 

A collection of tables is called as a Database a table itself is infomation in terms of rows and columns. each row contains the complete information of an entity
To perform operations on table and Database we take the help of SQL(Structured Query LAnguage) these language define of each DB operation like creating or deleting DBs, Creating or deleting a Table, Inserting, Updating or deleting records or Retriving a Data using the `SELECT` command;
INSERT, UPDATE, DELETE modifies the content of datavbase or table wereas SELECT command is used to retrieve data from database or table not to modify.

The JAVA programming language does not create or hold a database for this there are many softwares like oracle , mySQL, SQL server, MS Access, MongoDB etc which are used to create and hold a database. store and operate upon database. the business logic will be defined in java whereas storage information will be in another S/W. to communicate between two unrelated software there is an API layer which allows us to operate individually in one S/W witrhout botheriing about the complexities another S/W.

JAVA supportes the JDBC API which act as a bridge between java and database. JDBC API can onteract with or database S/W.  databases are present in local machine or online server.
java.sql; package containes which can be used to communicate with different database S/Ws. to set a connection between java and database we need to use the `Driver Programs` with respect to that database each S/W has set of driver programs the DriverManager Class uses the method `getConnection()` to establish a connection between java and database. it is returned in terms of an Object of the Class Connection. Once a connection is we create a statement for that connection using an object of the class Statement for this Statement we use a method either `executeUpdate();` or `executeQuery()` to execute a SQL query on the database. the result of the query is returned

`executeUpdate();` is used for insert update and delete whereas 
`executeQuery();` is used for select statment 

after using executeUpdate() we usualy use a method `commit()` which saves the changes in the table. we can also set auto commit to true and ignore commit
executeQuery may erturn a single record(row) or a ccollection of records hence its returned value is an accepted an object of class ResultSet the contents of this object can be iterated upon by traversing on each row one by one 

After all the oprations it is advisable to manually flows each statement and connection in ace of any error in DB transaction java raises SQLExecption hence the whole logic within the try block which catches the SQLException.

> ? write down a list of minimum 25 names predefined java classes you know? class methods.

##### order by

SELECT Personid, firstName, lastName, Age FROM Person ORDER BY age, firstName DESC

selsected information in result set with this query will be sorted in terms of age (asending order by ddefault) and for matching records woth same age in desecidng order of first name
name being a string internally alphabatic sorting is implemented   
A statement can be prepared statically or dinamically if it is prepared statically, we use the `createStatement();` for specific query whereas if the statement is dynamic the column names must be substituted at run time this is dome by using the `prepareStatement()` method the query in the prepare statement can substitute the column name value at run time using the `?` symbol whose values caan be substituted after the creation of the sratement using state int `setInt()` `setString()` etc methods. while seting the statement two options are given, the question mark number followed by the value.


when the resultSet is associated with CONCUR_UPDATABLE while traversing the resulset we can simultaneously update the contents of the table taht is the selected rows or specific colunm/s can be set to a new value and udapteRow can update the specific row in teh table, can we update the whole table or is it only possible row wise?

we can fire each SQL statement individually or  create a batch of SQL statements and execute the whole batch of statements using statement.executeBatch() it returns an integer array what does this array contain? In all database related program try to close resultSet, statement and connection in the end of the program in finally block before closing first check if the objects are created only then perform the close.