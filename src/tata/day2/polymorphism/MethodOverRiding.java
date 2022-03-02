package com.company.polymorphism;

public class MethodOverRiding {
}

/*
=====Method Overriding in Java

    // learning outcome
    Understanding the problem without method overriding
    Can we override the static method
    Method overloading vs. method overriding


    # If subclass (child class) has the same method as declared in the parent class,
     it is known as method overriding in Java.

    #Usage of Java Method Overriding
    1. Method overriding is used to provide the specific implementation of a method which
       is already provided by its superclass.
    2. Method overriding is used for runtime polymorphism

    #Rules for Java Method Overriding
    1. The method must have the same name as in the parent class
    2. The method must have the same parameter as in the parent class.
    3. There must be an IS-A relationship (inheritance).

*/

/*//Understanding the problem without method overriding
class Vehicle{
    void run(){System.out.println("Vehicle is running");}
}
//Creating a child class
class Bike extends Vehicle{
    public static void main(String args[]){
        //creating an instance of child class
        Bike obj = new Bike();
        //calling the method with child class instance
        obj.run();
    }
}*/

//Java Program to illustrate the use of Java Method Overriding
//Creating a parent class.
class Vehicle{
    //defining a method
    void run(){System.out.println("Vehicle is running");}
}
//Creating a child class
class Bike2 extends Vehicle{
    //defining the same method as in the parent class
    void run(){System.out.println("Bike is running safely");}

    public static void main(String args[]){
        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method
    }
}

/*
    * Can we override static method?
    No, a static method cannot be overridden. It can be proved by runtime polymorphism

    * Why can we not override static method?
    It is because the static method is bound with class whereas instance method is bound with an object.
     Static belongs to the class area, and an instance belongs to the heap area.

     * Can we override java main method?
        No, because the main is a static method.
*/
