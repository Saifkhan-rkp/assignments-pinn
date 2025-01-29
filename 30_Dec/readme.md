# Design Pattern in JAVA
## Factory Method 27 - Dec'24
## Adapter pattern

In Java, the Adapter Pattern is implemented by creating an interface (Target) that defines the expected methods, an existing class (Adaptee) with a different interface, and an Adapter class that implements the Target interface and extends the Adaptee. This allows the Client to interact with the Adaptee through the Target interface, enabling compatibility between incompatible interfaces without modifying their code.


in simple words an interface which uses the data or details of another another existing class that extends in same class where that interface is implemented.

## Facade

Facade is a `structural design pattern` that provides a simplified interface to a complex system of classes, libraries, or frameworks. It hides the complexity of the system from t

he client and provides a single interface to access. The Facade pattern is used to reduce the complexity of a system by providing a simpler interface to access.

## Observer

> ? Using the oberver technic create two classes one representing no. of ball and another representing the runs. The ball can be change by 0/1 and the run can be change by 0-6.  ... both the objects must get affected.

Observer pattern is a `behavioral design pattern` that allows an object to be notified of changes to another object without having a direct reference to that object. It's a one-to-many dependency between objects so that when on object changes state is updated in dependent objects. in simple words when one object changes the state of another object also gets changed.

Observer interface is implemented by the object that wants to be notified of changes to the subject object. The subject object maintains a list of observers and notifies them when its state changes.

Observable class is the class that maintains the list of observers (adds oberver using `addObservers()`) and notifies them when its state changes (`setChanged()` and `notifyOberver()`).

## Chain of Responsibility

Chain of Responsibility is a `behavioral design pattern` that allows multiple objects to handle a request in a sequence. 

ChainOfResponsibilityClient 

The Chain of Responsibility is a behavioral design pattern that allows multiple objects to handle a request without the sender needing to know which object will process it.
It consists of a handler interface (e.g., Logger) that defines methods for processing requests and maintaining a reference to the next handler.
Concrete handlers (e.g., ConsoleBasedLogger, ErrorBasedLogger, DebugBasedLogger) implement the handler interface and decide whether to process the request or pass it along the chain.
Each handler checks if it can handle the request based on its defined level of severity.
If a handler can process the request, it does so; otherwise, it forwards the request to the next handler in the chain.
This pattern promotes loose coupling between the sender and the handlers, allowing for flexibility in adding or modifying handlers.
Handlers can be configured dynamically at runtime, enabling changes in the processing order.
It simplifies the code by avoiding multiple conditional statements for request handling.
The pattern is useful in scenarios like logging, event handling, and user interface actions.
Overall, it enhances maintainability and scalability of the code.


# Spring

is used to create robust and efficient java projects, it can be a Standalone project or a web based project. It is mainly dependant on IOC (Inversion of Control) where its implement Dependency Injection.
- It basically consists of JAVA Class file and an XML file the configuration of the prject is defined.
- When a spring framework is executed it loads the XML file and based upon the configuration the Internal working takes place 
- The Structure of The Spring Projectwill have groupID, artifactID, in which the java program is defined, there are some dependencies needed to run spring project which can be downlloaded or can be specified in dependency stack and automatic downloding of the required depedant file are downloaded and installed
- To execute spring relateed program the basic requiment is JAVA, Maven or Gradle, and the spring tool suite (STS)
- Spring tool Suite is an extention of the eclipse IDE which is used to create and run the spring project.
- Spring being a framework most of the logic is predefined only the projecct specific business logic is to be written.


