***ANSWER ALL QUESTIONS BELOW***

        What is a programming language?
        Answer:A programming language is an artificial language that can be used to control
        the behaviour of a machine, particularly a computer. Programming languages, like human
        languages, are defined through the use of syntactic and semantic rules, to determine structure
        and meaning respectively.

        What is a JDK composed of? Define each components?
        Answer:The Runtime Interpreter, The Compiler, The Applet Viewer, The Debugger, The Class File Disassembler,
        The Header and Stub File Generator, The Documentation Generator, Applet Demos, API Source Code.

        What is an IDE?
        Answer:An integrated development environment (IDE) is software for building applications
        that combines common developer tools into a single graphical user interface (GUI).

        What are some of the most popular Java IDEs available in the market?
        Answer:Eclipse
        IntelliJ
        NetBeans
        JDeveloper
        MyEclipse
        BlueJ
        JCreator

        Explain the entire java life cycle.
        Answer: write code in a text file with a .java extension
        then compile code using Java Compiler.output is a .class file
the .class file is called "byte code ",it is machine-readable
        the .class file runs on any System with a Java Virtual Machine (JVM)

        What is a class?
        Answer:A Class is like an object constructor, or a "blueprint" for creating objects.


        What is an object?
        Answer: Object is an instance of a class ,is a self-contained component which consists of methods and
        properties to make certain type of data useful.

        What is the entry point of an application?
        Answer:The main() method is the entry point into the application.

        Why is the main() static?
        Answer:This is necessary because main() is called by the JVM before any objects are made.
        Since it is static it can be directly invoked via the class.

        Which class is the superclass of all classes?
        Answer:Object class is the superclass of every other class.
        java.lang.Object

        What is difference between path and classpath variables?
        Answer:Path is an environment variable which is used by the operating system to find the executables.
        Classpath is an environment variable which is used by the Java compiler to find the path,

        What is the difference between an Interface and Abstract class?

        Answer:the main difference an abstract class can have abstract methods
        and not abstract methods . is not a 100% abstract
interface is 100% abstract

Can you make an Object from an Interface and Abstract class? If yes or no, how would you do it?

        Answer:We can not make an object from Interface and Abstract Class. but we can make one from
        the subclass (extends, implements).


        What is Access Modifier?

        Answer: They are used to control the visibility of members like classes, variables and methods.
        Public:   you can call the variables/Methods from any package
        Protected : you can call the variables/Methods from any class within same packagr
        Private :you can call the variables/Methods within same class.


        What is OOP? Define each OOP concept.
        Answer: (Object Oriented Programming)Procedural programming is about writing procedures or methods
        that perform operations on the data, while object-oriented programming is about creating objects
        that contain both data and methods.
        - Encapsulation: Is considered data hiding ,when we don't want to allow the users to
        change the states /variables of the class.

        - Polymorphism: Is the ability to have multiple methods with the same name ,but acting on different
        numbers , types and orders of arguments .
        there are two types of Polymorphism:
        1-Methods overloading (Compile-time Polymorphism)
        2-Methods overriding (Run-time Polymorphism)
        - Abstraction :Data abstraction is the process of hiding certain details and showing
        only essential information to the user.
        Abstraction can be achieved with either abstract classes or interfaces
        (which you will learn more about in the next chapter).
        - Inheritance: can be defined as the process where one class acquires the properties of an other class.
        there are 3 types of inheritance :
        1-Single inheritance
        2-Multi level inheritance
        3-Hierarchical inheritance

        What is Java Package and which package is imported by default?
        Answer:A package is a namespace that organizes a set of related classes and interfaces.
        - Java.lang package.

        What is an API? List some API's that you have used so far.
        Answer:stands for application programming interface, a concept that applies everywhere
        from command-line tools to enterprise Java code to Ruby on Rails web apps. An API is a way
        to programmatically interact with a separate software component or resource.

        Does java support multiple inheritance? Why or why not?
        Answer:java does not support multiple inheritance through class. to avoid ambiguity error.
        java get confused

        What is method overloading and when does it happen?
        Answer: compile-time Polymorphism
        is a feature that allows a class to have more than one method having the same name.

        Explain exceptions in java and how to handle them.
        Answer:try catch block is a way  to catch rum time exception
        and also to make the program more user friendly

        What is static keyword? When and how do we use it?
        Answer:The static keyword is a non-access modifier used for methods and attributes.
        Static methods/attributes can be accessed without creating an object of a class.

        What is final keyword? When and how do we use it?
        Answer: final keyword is used in different contexts.
        First of all, final is a non-access modifier applicable only to a variable, a method or a class.

        Explain the difference between final, finally and finalize?
        Answer: final variable value can't be changed.
        Finally is used to place important code, it will be executed whether exception is handled or not.
        Finalize is used to perform clean up processing just before object is garbage collected

        What is a constructor?
        Answer:is a special method that is used to initialize objects. The constructor is called when
        an object of a class is created, witch means helps to construct a object.

        Can we have multiple constructors in a class?
        Answer: yes we can have multiple constructor in a class but with different parameters (arguments)

        If we don't have a constructor declared, what is called during the object creation?
        Answer: the default constructor

        What is "this" keyword in Java? When would we use it?
        Answer:The this keyword refers to the current object in a method or constructor.
        The most common use of the this keyword is to eliminate the confusion between class
attributes and parameters with the same name

                What is "super" keyword in Java? What are some scenarios we would use it?
        Answer:The super keyword refers to superclass (parent) objects.
        It is used to call superclass methods, and to access the superclass constructor

        What does JVM stand for?
        Answer:Java Virtual Machine

        Is JVM platform independent?
        Answer:yes

        What version of Java are you using?
        Answer:11.0.1

        What does JAR stand for?
        Answer:JAR stands for "Java Archive". A JAR file is basically a zip-file which contains
        a couple of class files and a text file

        What is the difference between JDK and JVM?
        Answer:- JDK contains JVM and whole other tools for java development inside it.
        - JVM converts bytecode to machine code and execute it on machine.
        - There is no matching functionality between JDK and JVM.

        What is the difference between JVM and JRE?
        Answer: is an abstract machine. It is a specification that provides runtime environment in which java bytecode can be executed.
        - JRE is used to provide runtime environment.It is the implementation of JVM.It physically exists.


        Explain the difference between compile-time and run-time?
        Answer: - Compile-time Errors that occur when you violate the rules of writing syntax . exp:
        Missing Parenthesis (})
        Printing the value of variable without declaring it
        Missing semicolon (terminator)
        - Run-time Error  Errors which occur during program execution(run-time) after successful
        compilation are called run-time errors.

        What is heap?
        Answer:is the area of memory used to store objects instantiated.

        How does Java manage its memory?
        Answer:The JVM loads the code, verifies the code, executes the code, manages memory
        (this includes allocating memory from the Operating System (OS), managing Java allocation
        including heap compaction and removal of garbage objects) and finally provides the runtime environment.


        What is the difference between String, StringBuffer and StringBuilder?
        Answer: String is immutable, if you try to alter their values, another object gets created.
        - StringBuffer and StringBuilder are mutable so they can change their values.
        - The difference between StringBuffer and StringBuilder is that StringBuffer is thread-safe.


        What is Singleton class?
        Answer:is a class that can have only one object (an instance of the class) at a time per JVM instance.

        What is Serialization and Deserialization?
        Answer:Serialization is a process of converting an object into a sequence of bytes
        which can be persisted to a disk or database or can be sent through streams.
        - The reverse process of creating object from sequence of bytes is called deserialization.


        Explain the difference between While and Do..While loops?
        Answer:- While loop executes the code block only if the condition is True.
        - Do While loop, condition is tested at the end of the loop so Do While executes
        the statements in the code block at least once even if the condition Fails.


        What is Enum?
        Answer: is a special "class" that represents a group of constants (unchangeable variables, like final variables).

        What is Iterator?
        Answer:Iterators are used in Collection framework in Java to retrieve elements one by one.
        There are three iterators.


        Which one will take more memory: an int or Integer? Why?
        Answer:they are the same, they represent a same value.

        Why are Strings considered to be immutable in Java?
        Answer:Once string object is created its data, it can not be changed.

        What is constructor chaining in Java?
        Answer:
        Constructor chaining is useful when you want to invoke multiple constructors,
        one after another,by initializing only one instance.

        The difference between Serial and Parallel Garbage Collector?
        Answer:Serial Collector is mostly designed for single-threaded environments.
        - Parallel Garbage Collector is used for multi-threaded environments.

        What does JIT stands for?
        Answer:Just In Time compilation.

        Explain the process of Java garbage collection?
        Answer:The garbage collector is a program which runs on the Java Virtual Machine which gets rid of objects
        which are not being used by a Java application anymore.
        - The heap is created when the JVM starts up and may increase or decrease in size while the application runs.


        Can you guarantee the garbage collection process?
        Answer:No

        What is the difference between stack and heap in Java?
        Answer: The main difference between heap and stack is that stack memory is used to store local variables and function call
        while heap memory is used to store objects in Java.
        - If there is no memory left in the stack for storing function call or local variable,
        JVM will throw java.lang.StackOverFlowError, while if there is no more heap space for creating an object,
        JVM will throw java.lang.OutOfMemoryError: Java Heap Space.
        - stack memory is a lot lesser than the size of  heap memory in Java.
        - Variables stored in stacks are only visible to the owner Thread while objects created in the heap are visible to all thread.

        What is reflection in Java and why is it useful?
        Answer:Reflection in Java is the ability to examine and/or modify the properties or behavior
        of an object at run-time.


        What is multithreading in Java?
        Answer:Multithreading is a Java feature that allows concurrent execution
        of two or more parts of a program for maximum utilization of CPU.

        What is synchronization in Java?
        Answer:Synchronization is the process of allowing threads to execute one after another.

        What is a Framework?
        Answer:Frameworks are large bodies (usually many classes) of pre_written code to which
        you add your own code to solve a problem in a specific domain.

        What are the testing Frameworks available in Java?
        Answer:JUNIT, REST Assured, Selenium, TestNG, Mockito, Spock Framework, Cucumber,

        What are jUnit and testNG?
        Answer: estNG is quite similar to JUnit, but with added functionalities and features such as parallel test execution,
        parameterization, and more. It is inspired by JUnit and NUnit.

        What are the dependencies for this project?
        Answer:Sometimes, you may need to invoke methods in a test case in a particular order,


        What is dependency injection in Java?
        Answer:In software engineering, dependency injection is a technique whereby one object
        (or static method) supplies the dependencies of another object.

        Explain what static binding and dynamic binding is?
        Answer: static binding in Java occurs during compile time while dynamic binding occurs during runtime.
private , final and static methods and variables use static binding and are bonded by compiler
        while virtual methods are bonded during runtime based upon runtime object.
