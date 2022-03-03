package perfect.learn.class1.unit1.arrays;

public class String_vs_Array {
    public static void main(String[] args) {
//        String str1 = "Keep coding";
//        String str2 = "Keep coding";
//        System.out.println(str1 == str2);


        String str1 = new String("Keep coding");
        String str2 = new String("Keep coding");
 //       System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
/*
    It is just that Java’s string type, called String, is not a primitive type.
    Nor is it simply an array of characters.
    String defines an object
*/

/*
    Although the value of both the string object is the same,
    still false is displayed as output because str1 and str2 are two
    different string objects created in the heap. That's why it is not considered
     a good practice two compare two strings using the == operator.
     Always use the equals() method to compare two strings in Java.
 */

/*
    * Different ways to print in Java :

    System.out.print() // No newline at the end
    System.out.println() // Prints a new line at the end
    System.out.printf()
    System.out.format()*/