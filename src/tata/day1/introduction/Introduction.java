package tata.day1.introduction;

public class Introduction {
}

/*

=====What is Java?

    Java is a programming language and a platform.
    Java is a high level, robust, object-oriented and secure programming language.

    Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995.
    James Gosling is known as the father of Java. Before Java, its name was Oak.

    Since Oak was already a registered company, so James Gosling and his team changed the name from Oak to Java.

    Platform: Any hardware or software environment in which a program runs, is known as a platform.
    Since Java has a runtime environment (JRE) and API, it is called a platform.


====Application

    Desktop Applications such as acrobat reader, media player, antivirus, etc.
    Web Applications
    Enterprise Applications such as banking applications.
    Mobile
    Embedded System
    Smart Card
    Robotics
    Games, etc.

====Types of Java Applications

    There are mainly 4 types of applications that can be created using Java programming:
    1) Standalone Application
        Standalone applications are also known as desktop applications or window-based applications.
        These are traditional software that we need to install on every machine.
        Examples of standalone application are Media player, antivirus, etc.
        AWT and Swing are used in Java for creating standalone applications.
    2) Web Application
        An application that runs on the server side and creates a dynamic page is called a web application.
        Currently, Servlet, JSP, Struts, Spring, Hibernate, JSF, etc. technologies are used for creating web
        applications in Java.
    3) Enterprise Application
         An application that is distributed in nature, such as banking applications,
         etc. is called an enterprise application. It has advantages like high-level security, load balancing,
         and clustering. In Java, EJB is used for creating enterprise applications.
    4) Mobile Application
        An application which is created for mobile devices is called a mobile application. Currently,
        Android and Java ME are used for creating mobile applications.

====Java Platforms / Editions

    There are 4 platforms or editions of Java:
    1) Java SE (Java Standard Edition)

    It is a Java programming platform. It includes Java programming APIs such as java.lang, java.io, java.net,
     java.util, java.sql, java.math etc. It includes core topics like OOPs, String, Regex, Exception,
      Inner classes, Multithreading, I/O Stream, Networking, AWT, Swing, Reflection, Collection, etc.
    2) Java EE (Java Enterprise Edition)

    It is an enterprise platform that is mainly used to develop web and enterprise applications.
     It is built on top of the Java SE platform. It includes topics like Servlet, JSP, Web Services, EJB, JPA, etc.
    3) Java ME (Java Micro Edition)

    It is a micro platform that is dedicated to mobile applications.
    4) JavaFX

    It is used to develop rich internet applications. It uses a lightweight user interface API.

====important to know
    1) James Gosling, Mike Sheridan, and Patrick Naughton initiated the Java language project in June 1991.
     The small team of sun engineers called Green Team.

    2) Initially it was designed for small, embedded systems in electronic appliances like set-top boxes.

    3) Firstly, it was called "Greentalk" by James Gosling, and the file extension was .gt.

    4) After that, it was called Oak and was developed as a part of the Green project.
    Why Java was named as "Oak"?
    Java History from Oak to Java

    5) Why Oak? Oak is a symbol of strength and chosen as a national tree of many countries like the U.S.A.
    , France, Germany, Romania, etc.

    6) In 1995, Oak was renamed as "Java" because it was already a trademark by Oak Technologies.
    Why Java Programming named "Java"?

    7) Why had they chose the name Java for Java language? The team gathered to choose a new name.
     The suggested words were "dynamic", "revolutionary", "Silk", "jolt", "DNA", etc.
      They wanted something that reflected the essence of the technology: revolutionary, dynamic,
       lively, cool, unique, and easy to spell, and fun to say.

    According to James Gosling, "Java was one of the top choices along with Silk".
     Since Java was so unique, most of the team members preferred Java than other names.

    8) Java is an island in Indonesia where the first coffee was produced (called Java coffee).
    It is a kind of espresso bean. Java name was chosen by James Gosling while having a cup of coffee nearby his office.

    9) Notice that Java is just a name, not an acronym.

    10) Initially developed by James Gosling at Sun Microsystems (which is now a subsidiary of Oracle Corporation)
     and released in 1995.

    11) In 1995, Time magazine called Java one of the Ten Best Products of 1995.

    12) JDK 1.0 was released on January 23, 1996. After the first release of Java,
     there have been many additional features added to the language. Now Java is being used in Windows applications,
      Web applications, enterprise applications, mobile applications, cards, etc.
      Each new version adds new features in Java.

====Features of Java
    Simple
    Object-Oriented
    Portable
    Platform independent
    Secured
    Robust
    Architecture neutral
    Interpreted
    High Performance
    Multithreaded
    Distributed
    Dynamic
Simple

Java is very easy to learn, and its syntax is simple, clean and easy to understand.
 According to Sun Microsystem, Java language is a simple programming language because:

    Java syntax is based on C++ (so easier for programmers to learn it after C++).
    Java has removed many complicated and rarely-used features, for example, explicit pointers,
     operator overloading, etc.
    There is no need to remove unreferenced objects because there is an Automatic Garbage Collection in Java.

Object-oriented

Java is an object-oriented programming language. Everything in Java is an object.
Object-oriented means we organize our software as a combination of different types of
objects that incorporate both data and behavior.

Object-oriented programming (OOPs) is a methodology that simplifies software development
 and maintenance by providing some rules.

Basic concepts of OOPs are:

    Object
    Class
    Inheritance
    Polymorphism
    Abstraction
    Encapsulation

Platform Independent
Java is platform independent

Java is platform independent because it is different from other languages like C, C++, etc.
 which are compiled into platform specific machines while Java is a write once, run anywhere language.
  A platform is the hardware or software environment in which a program runs.

There are two types of platforms software-based and hardware-based. Java provides a software-based platform.

The Java platform differs from most other platforms in the sense that it is a software-based
platform that runs on top of other hardware-based platforms. It has two components:

    Runtime Environment
    API(Application Programming Interface)

Java code can be executed on multiple platforms, for example, Windows, Linux, Sun Solaris,
 Mac/OS, etc. Java code is compiled by the compiler and converted into bytecode.
 This bytecode is a platform-independent code because it can be run on multiple platforms,
  i.e., Write Once and Run Anywhere (WORA).
Secured

Java is best known for its security. With Java, we can develop virus-free systems. Java is secured because:

    No explicit pointer
    Java Programs run inside a virtual machine sandbox

how Java is secured

    Classloader: Classloader in Java is a part of the Java Runtime Environment (JRE) which is used
    to load Java classes into the Java Virtual Machine dynamically. It adds security by separating
     the package for the classes of the local file system from those that are imported from network sources.
    Bytecode Verifier: It checks the code fragments for illegal code that can violate access rights to objects.
    Security Manager: It determines what resources a class can access such as reading and writing to the local disk.

Java language provides these securities by default. Some security can also be provided by an
 application developer explicitly through SSL, JAAS, Cryptography, etc.
Robust

The English mining of Robust is strong. Java is robust because:

    It uses strong memory management.
    There is a lack of pointers that avoids security problems.
    Java provides automatic garbage collection which runs on the Java Virtual Machine to get rid
    of objects which are not being used by a Java application anymore.
    There are exception handling and the type checking mechanism in Java. All these points make Java robust.

Architecture-neutral

Java is architecture neutral because there are no implementation dependent features, for example,
the size of primitive types is fixed.

In C programming, int data type occupies 2 bytes of memory for 32-bit architecture and 4 bytes
of memory for 64-bit architecture. However, it occupies 4 bytes of memory for both 32 and 64-bit architectures in Java.
Portable

Java is portable because it facilitates you to carry the Java bytecode to any platform.
It doesn't require any implementation.
High-performance

Java is faster than other traditional interpreted programming languages because Java bytecode
is "close" to native code.It is still a little bit slower than a compiled language (e.g., C++).
Java is an interpreted language that is why it is slower than compiled languages, e.g., C, C++, etc.
Distributed

Java is distributed because it facilitates users to create distributed applications in Java.
 RMI and EJB are used for creating distributed applications. This feature of Java makes us able
 to access files by calling the methods from any machine on the internet.
Multi-threaded

A thread is like a separate program, executing concurrently. We can write Java programs that deal
 with many tasks at once by defining multiple threads. The main advantage of multi-threading is
  that it doesn't occupy memory for each thread. It shares a common memory area. Threads are
   important for multi-media, Web applications, etc.
Dynamic

Java is a dynamic language. It supports the dynamic loading of classes. It means classes are loaded on demand.
 It also supports functions from its native languages, i.e., C and C++.



Can you save a Java source file by another name than the class name?



Yes, if the class is not public.

Q) Can you have multiple classes in a java source file?

JVM

JVM (Java Virtual Machine) is an abstract machine. It is called a virtual machine because it doesn't physically exist. It is a specification that provides a runtime environment in which Java bytecode can be executed. It can also run those programs which are written in other languages and compiled to Java bytecode.

JVMs are available for many hardware and software platforms. JVM, JRE, and JDK are platform dependent because the configuration of each OS
is different from each other. However, Java is platform independent. There are three notions of the JVM: specification, implementation, and instance.

The JVM performs the following main tasks:

    Loads code
    Verifies code
    Executes code
    Provides runtime environment

More Details.
JRE

JRE is an acronym for Java Runtime Environment. It is also written as Java RTE.
 The Java Runtime Environment is a set of software tools which are used for developing
 Java applications. It is used to provide the runtime environment. It is the
 implementation of JVM. It physically exists. It contains a set of libraries + other files that JVM uses at runtime.

The implementation of JVM is also actively released by other companies besides Sun Micro Systems.
JRE
JDK

JDK is an acronym for Java Development Kit. The Java Development Kit (JDK) is a software development
 environment which is used to develop Java applications and applets
. It physically exists. It contains JRE + development tools.

JDK is an implementation of any one of the below given Java Platforms released by Oracle Corporation:

    Standard Edition Java Platform
    Enterprise Edition Java Platform
    Micro Edition Java Platform

The JDK contains a private Java Virtual Machine (JVM) and a few other resources such as an
 interpreter/loader (java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc),
  etc. to complete the development of a Java Application.


  1) Classloader

Classloader is a subsystem of JVM which is used to load class files. Whenever we run the java program, it is loaded first by the classloader. There are three built-in classloaders in Java.

    Bootstrap ClassLoader: This is the first classloader which is the super class of Extension classloader. It loads the rt.jar file which contains all class files of Java Standard Edition like java.lang package classes, java.net package classes, java.util package classes, java.io package classes, java.sql package classes etc.
    Extension ClassLoader: This is the child classloader of Bootstrap and parent classloader of System classloader. It loades the jar files located inside $JAVA_HOME/jre/lib/ext directory.
    System/Application ClassLoader: This is the child classloader of Extension classloader. It loads the classfiles from classpath. By default, classpath is set to current directory. You can change the classpath using "-cp" or "-classpath" switch. It is also known as Application classloader.
These are the internal classloaders provided by Java. If you want to create your own classloader, you need to extend the ClassLoader class.
*/
class ClassLoaderExample{
    public static void main(String[] args) {
        Class c = ClassLoaderExample.class;
        System.out.println(c.getClassLoader());
       // System.out.println(String.class.getClassLoader());
    }

}
