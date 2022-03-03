package perfect.learn.class2.string.String_1;

public class String_1 {
    public static void main(String[] args) {
        char[] ch = {'a', 'x', 'y', 'z'};
        String str = new String(ch);
      //  System.out.println(s);

//        for (char t : ch) {
//            System.out.print(t + " ");
//        }

        ///normally strings are immutable in java

        String str1 = "RU CSE";
        str1 = "welcome";

        String str2 = str1.toLowerCase();



        System.out.println(str1);
        System.out.println(str2);

    }

}


/*
        === Java String=====

       # What is String in Java?
        Generally, String is a sequence of characters.
        But in Java, string is an object that represents a sequence of characters.
        The java.lang.String class is used to create a string object.

        *  An array of characters works same as Java string. For example:

        char[] ch={'j','a','v','a','t','p','o','i','n','t'};
        String s = new String(ch);

* */

/*
        Java String class provides a lot of methods to perform operations
        on strings such as compare(), concat(), equals(), split(), length(),
        replace(), compareTo(), intern(), substring() etc.

        The java.lang.String class implements
        1. Serializable,
        2. Comparable and
        3. CharSequence
         interfaces
 */

/*
    * CharSequence Interface
    The CharSequence interface is used to represent the sequence of characters.
    *  String, StringBufferand StringBuilder classes implement it.
    *  It means, we can create strings in Java by using these three classes.
    *

    * The Java String is immutable which means it cannot be changed.
    *  Whenever we change any string,a new instance is created.
    *  For mutable strings, you can use StringBuffer and StringBuilder classes.
* */

/*
     #   How to create a string object?

        There are two ways to create String object:
        1. By string literal
        2. By new keyword

     # 1) String Literal
        Java String literal is created by using double quotes. For Example:
        String s="welcome";

        **Each time you create a string literal, the JVM checks the "string
        constant pool" first. If the string already exists in the pool,
        a reference to the pooled instance is returned.
        **If the string doesn't exist in the pool, a new string instance
         is created and placed in the pool. For example:

        String s1="Welcome";
        String s2="Welcome";//It doesn't create a new instance

        **Note: String objects are stored in a special memory area
        known as the "string constant pool".

        **Why Java uses the concept of String literal?
        To make Java more memory efficient (because no new objects
        are created if it exists already in the string constant pool).


      #  2) By new keyword
        String s=new String("Welcome");//creates two objects and one reference variable
        In such case, JVM
        will create a new string object in normal (non-pool) heap memory,
        and the literal "Welcome" will be placed in the string constant pool.
        The variable s will refer to the object in a heap (non-pool).

*/

class StringExample {
    public static void main(String args[]) {
        String s1 = "java";//creating string by Java string literal

        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch);//converting char array to string

        String s3 = new String("Example");//creating Java string by new keyword

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}


///18 dec 2021

class CSE{
    //constructor
    private int point;
    private int health;

    void initVariable(){
        point = 0;
        health = 30;
    }
    void initGraphics(){

    }

    CSE(){

        initVariable();
        initGraphics();
    }
    //function

    void nana(){

    }

    //getter
    int getPoint(){
        return point;
    }
    int getHealth(){
        return health;
    }
    //setter
    void setPoint(int point){
        this.point = point;
    }

}

class Student{
    public static void main(String[] args) {
        CSE a = new CSE();
    /*    System.out.println(a.getPoint());

        a.setPoint(100);
        System.out.println(a.getPoint());*/

    }
}