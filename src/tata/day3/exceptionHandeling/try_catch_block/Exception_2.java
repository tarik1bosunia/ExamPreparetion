package exceptionHandeling.try_catch_block;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


class except_2{
    public void test_1(){
        int data=50/0; //may throw exception
        System.out.println("rest of the code");
    }
    public void test_2(){
        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt"); //may throw exception
            pw.println("saved");
        }
// providing the checked exception handler
        catch (FileNotFoundException e) {

            System.out.println(e);
        }
        System.out.println("File saved successfully");
    }
}



public class Exception_2 {

    public static void main(String[] args) {

    }
   /*
        //Internal Working of Java try-catch block
        The JVM firstly checks whether the exception is handled or not. If exception is not handled,
        JVM provides a default exception handler that performs the following tasks:
        1.  Prints out exception description.
        2.  Prints the stack trace (Hierarchy of methods where the exception occurred).
        3.  Causes the program to terminate.

        But if the application programmer handles the exception, the normal
        flow of the application is maintained, i.e., rest of the code is executed
    .*/
}
