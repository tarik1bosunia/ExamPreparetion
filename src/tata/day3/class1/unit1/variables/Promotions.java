package perfect.learn.class1.unit1.variables;

public class Promotions {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i/c) - (d * s);
        long l = 1000000000000L;

        int x = 10;
        char y = 'a';
        System.out.println(x+y);


//        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
//        System.out.println("Result : " + result);
    }

}
/*
    The Type Promotion Rules
    Java defines several type promotion rules that apply to expressions. They are as follows: First,
    all byte, short, and char values are promoted to int, as just described. Then, if one operand
    is a long, the whole expression is promoted to long. If one operand is a float, the entire
    expression is promoted to float. If any of the operands are double, the result is double.
    The following program demonstrates how each value in the expression gets promoted
    to match the second argument to each binary operator:

    //Resulting data type after arithmetic operation
    Result = byte + short -> integer
    Result = short + integer -> integer
    Result = long + float -> float
    Result = integer + float -> float
    Result = character + integer -> integer
    Result = character + short -> integer
    Result = long + double -> double
    Result = float + double -> double


*/
