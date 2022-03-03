package perfect.learn.class2.string.string_methods;

public class String_16_valueOf {
    public static void main(String[] args) {

    }
}

/*
    * Java String valueOf()

    The java string valueOf() method converts different types of values into string.
    * By the help of string valueOf() method, you can convert int to string,
    * long to string, boolean to string, character to string, float to string,
    *  double to string, object to string and char array to string.
    Internal implementation

        public static String valueOf(Object obj) {
               return (obj == null) ? "null" : obj.toString();
           }

    Signature
    The signature or syntax of string valueOf() method is given below:

        public static String valueOf(boolean b)
        public static String valueOf(char c)
        public static String valueOf(char[] c)
        public static String valueOf(int i)
        public static String valueOf(long l)
        public static String valueOf(float f)
        public static String valueOf(double d)
        public static String valueOf(Object o)

    #Returns
    string representation of given value
* */

class StringValueOfExample1{
    public static void main(String args[]){
        int value=30;
        String s1=String.valueOf(value);
        System.out.println(s1+10);//concatenating string with 10
        System.out.println(s1+" " + 10);//concatenating string with 10
    }
}

class StringValueOfExample2 {
    public static void main(String[] args) {
        // Boolean to String
        boolean bol = true;
        boolean bol2 = false;
        String s1 = String.valueOf(bol);
        String s2 = String.valueOf(bol2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
class StringValueOfExample3 {
    public static void main(String[] args) {
        // char to String
        char ch1 = 'A';
        char ch2 = 'B';
        String s1 = String.valueOf(ch1);
        String s2 = String.valueOf(ch2);
        System.out.println(s1);
        System.out.println(s2);
    }
}

class StringValueOfExample4 {
    public static void main(String[] args) {
        // Float and Double to String
        float f  = 10.05f;
        double d = 10.02;
        String s1 = String.valueOf(f);
        String s2 = String.valueOf(d);
        System.out.println(s1);
        System.out.println(s2);
    }
}


class StringValueOfExample5 {
    public static void main(String[] args) {
        boolean b1=true;
        byte b2=11;
        short sh = 12;
        int i = 13;
        long l = 14L;
        float f = 15.5f;
        double d = 16.5d;
        char chr[]={'j','a','v','a'};
        StringValueOfExample5 obj=new StringValueOfExample5();
        String s1 = String.valueOf(b1);
        String s2 = String.valueOf(b2);
        String s3 = String.valueOf(sh);
        String s4 = String.valueOf(i);
        String s5 = String.valueOf(l);
        String s6 = String.valueOf(f);
        String s7 = String.valueOf(d);
        String s8 = String.valueOf(chr);
        String s9 = String.valueOf(obj);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9);
    }
}
