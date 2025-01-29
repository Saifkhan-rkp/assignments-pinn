
#### 18 Dec 2024

## Runnable and Running state

when an object of thread implementing class
but start is not yet called means thread is in runnable state
when start() is called executin=on of run() takes place that means the object is in the running state
A thread object when dead (after the comlpletion of run funcction) cannot be revived

logic in side the run() function can defined as

```java

synchronized(this){
    /** code to be executed */
}

public synchronized void method(){}
```

## Nested Class

resouce1 and resouce2 are nested in deadlockSolved Class; test is object of deadlockSolved class if we use

```java
    final resouce1 a = new resouce1(); //it will try to locate class outside deadlockSolved
```

whereas we wish to create an object of inner nested class hence object creation involves

```java
DeadlockSolved test = new DeadlockSolved();

Resouce1 a = test.new Resouce1();
```

### deadlock

> 2 chair 2 person without sequence(deadlock) or with sequence(not deadlock)

## Packages

1. is the mechanismm of storing different classes in different folders as per their utilities
2. A Class usually identified with the help of its name but it defined in package it is identified with the help of its packageName.ClassName
3. A package can be considered as a folder and nesting of folder is also posssible. once a class is defined inside package we can either use the whole packageName.ClassName or Import the package and directly use only the class name
4. The accessibility modes like Private, NO access specifier (Protected) and public must be understood with respect to within the package and outside the package
5. In C++ it is w. r. to within the class and outside the class
6. When you defined the package declaration above the class declaration, the class must be defined as public only then it can be accessed from outside the package
7. If the program and package exists in same folder we can use them directly but in case of different folder we must use the class path specifying the location of the Class file this can be done temporaryly on the cmd prompt or set permanently in systems environment variable. if the class path does not exists we can create a new one and if it exists we can edit it while setting the class path use the following syntax

```bash
 $set classpath = .;c:\examplec\;
```

8. `.` search class file inside the folder, if not found inside the specified class path

folder creation can be done manually or using the directory option while compiling the java file

```bash
    $javac -d . sample.java
```

any java project will be collection of n number of classes insted of storing them together we distribute them into individual folders depending upon the utility of the class


? while importing a programmer defined class from a package, usage of * or wildcard character leads to an error but it works fine incase of predefined packages why?


to set the class path permanently follow the steps given below
1. right click on the My Computer
2. select Advance system Setting
3. click on Environment Variables
4. under system variable click on new
5. in variable name enter CLASSPATH and in variable value enter the path of the folder where your


9. the set path command mentions the java installation path wereas setclass path command specifies the location of the package
10. private data members are accessibke in the same class not accessible in derived class or an external class in the package as well as outside the package
11. no access specifier member behaves as public forthe whole paclage that is acccessible in the class derived class and the main function of the same package but is inaccessbile outside the package
12. protected members are accessible in the class derived class as well as the main program of the same package only to the derived class outside the package
public members are accssible in each part inside the package as well as accssible in each part outside the package.  



#### Assignment 

1. Read all threading related programs, execute them and the output along with the explanation of the program.
2. Explain concept of nested class and its creation of objects
3. Read deadlock and its sloution programs with explanation
    1. creating class in package and using it in program
    2. creating class in package and using it in program using import statement
    3. Implementing inheritance in terms of 

## Singleton Class

when class is defined we can create multiple objects of same class
but in many cases we need to restrict the creation of objects to single object this is done by implementing the concept of Singleton Classes
Singleton can be implemented in any programin any program with the following feature
1. it defines a static datamember of the same class this data member can be initialize at the time of declaration or we can implement the `lazy initialization`
its constructor must be private so that it cannot be used for object creation 
2. If the object is created using early initialization technic it can be refered directly using the class name but normally it is done using lazy initialiization using a function usually termed as `getInstance()` this function checks if object is already created then returns it if not then creates new Object and returns it
3. In the main program object creation using new will not be allowed as the constructor is private hence the getInstance() mechanism which is static function returning object of the class is used it ensures creation of single object of the class.