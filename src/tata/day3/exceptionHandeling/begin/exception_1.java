package exceptionHandeling.begin;

class Except{
    public void test_1(){
        try{
            int data = 100/0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Rest of code");
    }
}

public class exception_1 {
    public static void main(String[] args) {
        Except t = new Except();
        t.test_1();
    }
}

    /*Exception Handling in Java*/
  /*    The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors
        so that the normal flow of the application can be maintained.
        What is Exception in Java?

     // Dictionary Meaning: Exception is an abnormal condition.
        In Java, an exception is an event that disrupts the normal flow of the program.
        It is an object which is thrown at runtime.

      //  What is Exception Handling?
        Exception Handling is a mechanism to handle runtime errors
        such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.

     // Advantage of Exception Handling
        The core advantage of exception handling is to maintain the normal
        flow of the application. An exception normally disrupts
        the normal flow of the application; that is why we need to handle exceptions
   */

 /*
       //Types of Java Exceptions

        There are mainly two types of exceptions: checked and unchecked.
        An error is considered as the unchecked exception. However, according to Oracle,
        there are three types of exceptions namely:

        1. Checked Exception
        2. Unchecked Exception
        3. Error

    //    Difference between Checked and Unchecked Exceptions

    1) Checked Exception
    The classes that directly inherit the Throwable class except RuntimeException
    and Error are known as checked exceptions. For example, IOException, SQLException,
    etc. Checked exceptions are checked at compile-time.
    2) Unchecked Exception

    The classes that inherit the RuntimeException are known as unchecked exceptions.
    For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException,
    etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
    3) Error

    Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError,
    AssertionError etc.

  */

        /*Common Scenarios of Java Exceptions

        There are given some scenarios where unchecked exceptions may occur. They are as follows:
        1) A scenario where ArithmeticException occurs
        If we divide any number by zero, there occurs an ArithmeticException.
        int a=50/0;//ArithmeticException

        2) A scenario where NullPointerException occurs
        If we have a null value in any variable, performing any operation on
        the variable throws a NullPointerException.
        String s=null;
        System.out.println(s.length());//NullPointerException

        3) A scenario where NumberFormatException occurs
        If the formatting of any variable or number is mismatched,
        it may result into NumberFormatException. Suppose we have a string
        variable that has characters; converting this variable into digit will
         cause NumberFormatException.
        String s="abc";
        int i=Integer.parseInt(s);//NumberFormatException

        4) A scenario where ArrayIndexOutOfBoundsException occurs
            When an array exceeds to it's size, the ArrayIndexOutOfBoundsException occurs.
            there may be other reasons to occur ArrayIndexOutOfBoundsException.
            Consider the following statements.
            int a[]=new int[5];
            a[10]=50; //ArrayIndexOutOfBoundsException

         */

