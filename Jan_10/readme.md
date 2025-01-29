# PHP

##

for the processing logic 
1. get method
Information of the form send in the url itself using the key value combination and multiple values join by using `&` but this method has the drawback as the information is visible in the url and also the length of the url is increased, and url has limitation of number of character hence limited information can be passed.
2. POST method 
where the information is encrypted and passed to the webserver in a single packet and not visible in the url and can contain any number of characters
while defining the html file we specify the form action that is the php file on the webserver that should handle the form data we also pass the method of information transaction GET or POST. On the server side the php file will usr the option of `$_GET` or `$_POST` to get the information from the form the clients browser html file and specify the name of variables to access the information
we can check and validate thr information before processing it in the php file.

## Database accessing in PHP

information can be stored and retrieved using a database through php for this it provides three options

1. **mysqli** - object oriented
 - in mysqli is stands for improved version the earlier version is still 2010. recent version supports mysqli
2. **mysqli** - procedural
3. **PDO** - (object oriented)
 - it can used to connect with multiple database like mysql, oracle, postgresql etc, where mysqli only connect with mysql

to use my sql we need to first create the connection with the database and then perform operations using the connection 
this can be implemented using procedure method as well as using object oriented method, once the connection is set we can use the query function to execute any sql query the `SELECT` statement returns a list of information also termed as result which can be processed sequentially row wise using `fetch_assoc` which returns each row whose columns can be individually access using the key of the column in row variable.
information from an html file must be retrieved by php file and store it 
another operation is retrieving information db and processing it and delivering an output in clients browser.
