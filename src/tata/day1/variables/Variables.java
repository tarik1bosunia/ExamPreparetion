package tata.day1.variables;

public class Variables {
}
/**
 * Java Variables
 *
 * A variable is a container which holds the value while the Java program
 * is executed. A variable is assigned with a data type.
 *
 * Variable is a name of memory location. There are three types of variables in java: local, instance and static.
 *
 * There are two types of data types in Java
 * primitive and non-primitive.
 1) Local Variable


 A variable declared inside the body of the method is called local variable.
 You can use this variable only within that method and the other methods in the class
 aren't even aware that the variable exists.

 A local variable cannot be defined with "static" keyword.
 2) Instance Variable

 A variable declared inside the class but outside the body of the method, is called an instance variable.
 It is not declared as static
 .

 It is called an instance variable because its value is instance-specific and is not shared among instances.
 3) Static variable

 A variable that is declared as static is called a static variable. It cannot be local.
 You can create a single copy of the static variable and share it among all the instances of the class.
 Memory allocation for static variables happens only once when the class is loaded in the memory.


 Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
 Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.

 Java is a statically-typed programming language. It means, all variables must be declared before its use.
 That is why we need to declare variable's type and name.

 * */

class A{
    static int x = 10;
    public static void tata(){
        System.out.println("I am Tata");
    }

    public static void main(String[] args) {


        System.out.println(A.x);
        A.tata();
    }
}