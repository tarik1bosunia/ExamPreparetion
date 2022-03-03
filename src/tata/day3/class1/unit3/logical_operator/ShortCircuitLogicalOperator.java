package perfect.learn.class1.unit3.logical_operator;

public class ShortCircuitLogicalOperator {
    public static void main(String[] args) {
        int num = 10;
        int denom = 0;

        if (denom != 0 & num / denom > 10){
            System.out.println("tata");
        }
       /* if (denom != 0 && num / denom > 10){
            System.out.println("tata");
        }*/
    }


}
/*
    // Short-Circuit Logical Operators
    Java provides two interesting Boolean operators not found in some other computer
    languages. These are secondary versions of the Boolean AND and OR operators, and are
    commonly known as short-circuit logical operators. As you can see from the preceding table,
    the OR operator results in true when A is true, no matter what B is. Similarly, the AND
    operator results in false when A is false, no matter what B is. If you use the || and && forms,
    rather than the | and & forms of these operators, Java will not bother to evaluate the righthand operand when the outcome of the expression can be determined by the left operand
    alone. This is very useful when the right-hand operand depends on the value of the left one
    in order to function properly. For example, the following code fragment shows how you
    can take advantage of short-circuit logical evaluation to be sure that a division operation
    will be valid before evaluating it:

    if (denom != 0 && num / denom > 10)
* */