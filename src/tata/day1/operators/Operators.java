package tata.day1.operators;

public class Operators {
}

//increment decrement
class OperatorExample1{
    public static void main(String args[]){
        int a=10;
        int b=10;
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21

    }
}
// ~ and ! example
class OperatorExample2{
    public static void main(String args[]){
        int a = 10;
        int b=-10;
        boolean c=true;
        boolean d=false;
        System.out.println(~a);//-11 (minus of total positive value which starts from 0)
        System.out.println(~b);//9 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true
    }
}

//Java Left Shift Operator Example

class OperatorExample3{
    public static void main(String args[]){
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240
    }
}

//Java Right Shift Operator Example

class OperatorExample4{
        public static void main(String args[]) {
            System.out.println(10 >> 2);//10/2^2=10/4=2
            System.out.println(20 >> 2);//20/2^2=20/4=5
            System.out.println(20 >> 3);//20/2^3=20/8=2
        }
}

//Java Shift Operator Example: >> vs >>>

class OperatorExample5{
    public static void main(String args[]){
        //For positive number, >> and >>> works same
        System.out.println(20>>2);
        System.out.println(20>>>2);
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20>>2);
        System.out.println(-20>>>2); //jante hbe
    }
}

/*
    Java AND Operator Example: Logical && and Bitwise &

    The logical && operator doesn't check the second condition if the first condition is false.
     It checks the second condition only if the first one is true.

    The bitwise & operator always checks both conditions whether first condition is true or false.
*/

class OperatorExample6{
    public static void main(String args[]){
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b && a++<c);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a<b & a++<c);//false && true = false
        System.out.println(a);//11 because second condition is checked
    }
}

/*
    Java OR Operator Example: Logical || and Bitwise |

    The logical || operator doesn't check the second condition if the first condition is true.
     It checks the second condition only if the first one is false.
*/
class OperatorExample7{
    public static void main(String args[]){
        int a=10;
        int b=5;
        int c=20;

        System.out.println(a>b||a++<c);//true || true = true
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a>b|a++<c);//true | true = true
        System.out.println(a);//11 because second condition is checked
    }
}

/*
    * Java Ternary Operator

     Java Ternary operator is used as one line replacement for if-then-else statement
     and used a lot in Java programming.
     It is the only conditional operator which takes three operands.
*/

class OperatorExample8{
    public static void main(String args[]){
        int a=2;
        int b=5;
        int min = (a<b)?a:b;
        int max = (a>b)?a:b;

        // ternary operator example search

        System.out.println(max);
    }
}

//Java Assignment Operator Example: Adding short

class OperatorExample{
    public static void main(String args[]){
        short a=10;
        short b=10;
        //a+=b;//a=a+b internally so fine
        a = (short)(a+b);//Compile time error because 10+10=20 now int
        System.out.println(a);
    }
}
