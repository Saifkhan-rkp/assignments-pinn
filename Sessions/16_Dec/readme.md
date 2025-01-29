# Abstract class

Abstract class is regular class with data members, constructors and normal member functions.
one or more than one method in this class is empty body this empty bodied function is termed as an abstract function and a class which contains
an abstract function is termed as an abstract class. we cannot create an object of an abstract class as it is incomplete

> an incomplete abstract class by extending it in derived class which apart from its members will have a function which complete or overrides the abstract method if it does not override the derived class also becomes the abstract

> the blank function of the abstract class serves as the guideline which must be compulsorily or implemented by the derived class

> An interface is not a class but simply a collection of empty bodied collection that is guideline it can also define a constant and not a data member by default each variable is final constant and each empty is method is public, private modifier is not allowed.

> The implementation of an abstract function has to be defined in the implementing class but it can be left blank if not applicable.

# Exception Handling

Whenever a runtime error occurs during the program execution it leads to abnormal program termination this should never happen and a program must be terminated normally under all circumstances this can be done using the exception handling mechanism

> It is mainly divided in five parts in java

1. Try block: the statement to be monitored are defined , java keeps watching for error inside the try block. if an error occur further execution of try is suspended and the control comes out of the try block.
2. Throw statement: On error inside try block throw takes place and it transfers the control of the program from try to an appropriate catch depending upon the type of error
3. Catch block: On an error the control is transfer to the catch block whose objective is to rectify the error or normally shutdown the program
4. throws : it is admission of function that an error can take place and it does not have a try catch block, hence the function calling it must take the precaution of calling it from try and catch
5. finally: the finally block in the exception handling mechanism is executed irrespective of whether error takes place or not hence operation that must be performed under all circumstances like file or connection closing operation must be done in the finally block

### Scanner class

the i/o operation in any programming language are handled by different types of predefined "Streams"

for each type of input we must use different streams to avoid this complexity java supports a predefined class Scanner in java.util package this class can be connected to different type of input mediums or sources and supports , list of predefined functions for differents types of values.

- nextInt()
- nextDouble()
- next()
- nextLine()

all the function are non static and can be called using /Scanner/ class object.

> next() is used to read a word whereas to read a sentence we need a function nextLine()
> catch can be defined in any sequence but generic catch() mustee at the end

# Multi threading

        the execution of other blocks remain suspended this is because by default there is only one thread or program execution which performs the operation

2. in java we can create an extra thread apart from the main thread which gets executed parallel to the main thread that is multiple block of program are executed simultaneously
3. To create a thread java supports two methods
   i. extending the class Thread
   ii. implemenrting the interface Runnable
4. The logic to be executed parallaly by overriding the function run of the thread class, this function gets executed when the function start is called.
5. while impleneting the runnable interface, we either define an object of class Thread or create an Object by passing the object of the class implementing runnable interface we can check the status of Thread isAlive() which either returns true or false depending upon the thread status.
6. Normally the main thread will be responsible for creation of the child threads its execution must be terminated only after

#### 18 Dec 2024

## Runnable and Running state

when an object of thread implementing class
but start is not yet called means thread is in runnable state
when start() is called execution of run() takes place that means the object is in the running state
A thread object when dead (after the completion of run function) cannot be revived

logic in side the run() function can defined as

```java

synchronized(this){
    /** code to be executed */
}

public synchronized void method(){}
```

## Nested Class

resource1 and resource2 are nested in deadlockSolved Class; test is object of deadlockSolved class if we use

```java
    final resource1 a = new resource1(); //it will try to locate class outside deadlockSolved
```

whereas we wish to create an object of inner nested class hence object creation involves

```java
DeadlockSolved test = new DeadlockSolved();

Resource1 a = test.new Resource1();
```

### deadlock

> 2 chair 2 person without sequence(deadlock) or with sequence(not deadlock)

## Packages

1. is the mechanism of storing different classes in different folders as per their utilities
2. A Class usually identified with the help of its name but it defined in package it is identified with the help of its packageName.ClassName
3. A package can be considered as a folder and nesting of folder is also possible. once a class is defined inside package we can either use the whole packageName.ClassName or Import the package and directly use only the class name
4. The accessibility modes like Private, NO access specifier (Protected) and public must be understood with respect to within the package and outside the package
5. In C++ it is w. r. to within the class and outside the class
6. When you defined the package declaration above the class declaration, the class must be defined as public only then it can be accessed from outside the package
7. If the program and package exists in same folder we can use them directly but in case of different folder we must use the class path specifying the location of the Class file this can be done temporarily on the cmd prompt or set permanently in systems environment variable. if the class path does not exists we can create a new one and if it exists we can edit it while setting the class path use the following syntax

```bash
 $set classpath = .;c:\example\;
```

8. `.` search class file inside the folder, if not found inside the specified class path

folder creation can be done manually or using the directory option while compiling the java file

```bash
    $javac -d . sample.java
```

any java project will be collection of n number of classes instead of storing them together we distribute them into individual folders depending upon the utility of the class


? while importing a programmer defined class from a package, usage of * or wildcard character leads to an error but it works fine incase of predefined packages why?


to set the class path permanently follow the steps given below
1. right click on the My Computer
2. select Advance system Setting
3. click on Environment Variables
4. under system variable click on new
5. in variable name enter CLASSPATH and in variable value enter the path of the folder where your


9. the set path command mentions the java installation path whereas set class path command specifies the location of the package
10. private data members are access bike in the same class not accessible in derived class or an external class in the package as well as outside the package
11. no access specifier member behaves as public for the whole package that is accessible in the class derived class and the main function of the same package but is inaccessible outside the package
12. protected members are accessible in the class derived class as well as the main program of the same package only to the derived class outside the package
public members are accessible in each part inside the package as well as accessible in each part outside the package.  



#### Assignment 

1. Read all threading related programs, execute them and the output along with the explanation of the program.
2. Explain concept of nested class and its creation of objects
3. Read deadlock and its solution programs with explanation
    1. creating class in package and using it in program
    2. creating class in package and using it in program using import statement
    3. Implementing inheritance in terms of 

## Singleton Class

when class is defined we can create multiple objects of same class
but in many cases we need to restrict the creation of objects to single object this is done by implementing the concept of Singleton Classes
Singleton can be implemented in any program with the following feature
1. it defines a static datamember of the same class this data member can be initialize at the time of declaration or we can implement the `lazy initialization`
its constructor must be private so that it cannot be used for object creation 
2. If the object is created using early initialization technic it can be referred directly using the class name but normally it is done using lazy initialization using a function usually termed as `getInstance()` this function checks if object is already created then returns it if not then creates new Object and returns it
3. In the main program object creation using new will not be allowed as the constructor is private hence the getInstance() mechanism which is static function returning object of the class is used it ensures creation of single object of the class.