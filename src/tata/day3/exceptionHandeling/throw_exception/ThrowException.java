package exceptionHandeling.throw_exception;

public class ThrowException {
    public void test_1(int age){
        if (age < 18){
            throw new ArithmeticException("Person is not eligible to vote");
        }else{
            System.out.println("Person is eligible to vote.");
        }
    }

    public static class Throwing_checked_exception {
    }
}
     /*
        //Java throw Exception
        In Java, exceptions allows us to write good quality codes where the errors are checked
        at the compile time instead of runtime and we can create custom exceptions
        making the code recovery and debugging easier.*/

   /*
        //Java throw keyword
        The Java throw keyword is used to throw an exception explicitly.
        We specify the exception object which is to be thrown. The Exception has some message with it that provides
        the error description. These exceptions may be related to user inputs, server, etc.

        We can throw either checked or unchecked exceptions in Java by throw keyword. It is mainly used
        to throw a custom exception. We will discuss custom exceptions later in this section.

        We can also define our own set of conditions and throw an exception explicitly using throw keyword.
        For example, we can throw ArithmeticException if we divide a number by another number.
        Here, we just need to set the condition and throw exception using throw keyword.*/
