package perfect.learn.class1.unit1.variables;

public class Variables1 {
    public static void main(String[] args) {
     /*   byte b = 50;
        b = b * 2; // Error! Cannot assign an int to a byte!*/

        byte b = 50;
        b = (byte)(b * 2);


//        int  a = 127;
//        byte b = (byte) a;
//        System.out.println(b);
    }

}
    /*

        ====The Scope and Lifetime of Variables======


        ====Type Conversion and Casting========
        //automatic type conversion
         If the two types are compatible, then Java will perform the
         conversion automatically
         an automatic type conversion  will take place if the following two
         conditions are met:
            •	 The two types are compatible.
            •	 The destination type is larger than the source type

          Java also performs an automatic type conversion when storing a
           literal integer constant into variables of type byte, short, long, or char.

          // casting
         However, there are no automatic conversions from the
         numeric types to char or boolean. Also, char and boolean are
         not compatible with each other

         //Casting Incompatible Types
         To create a conversion between two incompatible types, you must use a cast.
          A cast is simply an explicit type conversion.
          (target-type) value

          For example,
          the following fragment casts an int to a byte. If the integer’s value is larger than the range of a
          byte, it will be reduced modulo (the remainder of an integer division by the) byte’s range.

          //Automatic type promotion in expression
            In an expression, the precision
            required of an intermediate value will sometimes exceed the range of either operand. For
            example, examine the following expression
            byte a = 40;
            byte b = 50;
            byte c = 100;
            int d = a * b / c;

            byte b = 50;
            b = b * 2; // Error! Cannot assign an int to a byte!

            you should use as bellow...
            byte b = 50;
            b = (byte)(b * 2);

    */
