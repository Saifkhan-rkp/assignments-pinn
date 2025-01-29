
in the program the default application contained a java file and an XML file. this XML file contains all configurational details of the spring boot project
it contains the basic information of the project, the dependencies that is the package it uses in the project and also the plugins used 
IN the new project we need to add the controller file which is executed when the application is executed from web browser this is done by mentioning `@RestController` above the class definition the function to be executed when the request is made must be specified above the function by specifying the annotation `@RequestMapping(value='/')` when we add the annotations we require predefined packages which can be imported by right clicking the annotation but these packages must be a part of the XML file this can be done using two methods, 
1. Downloading the Spring core file and the required file and including them in the class path by right clicking the project and selecting build path 
in window we can mention external jar files
2. Using online Maven Repository specifying the package and coping the code under the dependencies tag the required files are automatically downloaded and included in the class path.
For the controller program we will need two  dependencies 
spring-boot-starter-web
spring-webmvc


If we run this project it starts the tomcat server on a specific port number if we use localhost:portNo /request mapping detects the function and executes it
we are adding the web functionality to the spring project using rest controller 

> The predefined class object which is the base class of all Java classes is part of java.lang package.

This project deals with a social media platform this platform maintains the information about the user, location of the user and the posts made by the user.

when user is created it associated with a location of the user using a reference to location class similarly a post posted by a user will be specified by the userId.
We have created three packages to store user post and location. each package consists of file containing the information for rx. class user representing the user details.
class post representing the post details and same for location

* It also containes a Service file which is responsible for the creation of objects and a third controller file which is responsible for returning a response to the request by the user
* the user will request different information based upon the URL by specifying either users or post or locations. If we execute the project and type the location name the required list of information must be displayed on the screen.