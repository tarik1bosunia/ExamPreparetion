package perfect.learn.class2.string.string_methods;

public class String_6_CompareTo {
    public static void main(String[] args) {

    }
}
 /*
        Java String compareTo()

        **The Java String class compareTo() method compares the given string with
        the current string lexicographically.
         It returns a positive number, negative number, or 0.

        **It compares strings on the basis of the Unicode value of each character in the strings.

        **If the first string is lexicographically greater than the second string,
        it returns a positive number (difference of character value).

        **If the first string is less than the second string lexicographically,
        it returns a negative number, and

        **if the first string is lexicographically
        equal to the second string, it returns 0.


        if s1 > s2, it returns positive number
        if s1 < s2, it returns negative number
        if s1 == s2, it returns 0

        # Return type
        It returns an integer value.


       #  It throws the following two exceptions:

        ClassCastException: If this object cannot get compared with the specified object.

        NullPointerException: If the specified object is null.


     #   Internal implementation

    int compareTo(String anotherString) {
        int length1 = value.length;
        int length2 = anotherString.value.length;
        int limit = Math.min(length1, length2);
        char v1[] = value;
        char v2[] = anotherString.value;

        int i = 0;
        while (i < limit) {
            char ch1 = v1[i];
            char ch2 = v2[i];
            if (ch1 != ch2) {
                return ch1 - ch2;
            }
            i++;
        }
        return length1 - length2;
    }
*/

class CompareToExample1 {
    public static void main(String args[]) {
        String s1 = "hello";
        String s2 = "hello";
        String s = "HELLO";
        String s3 = "meklo";
        String s4 = "hemlo";
        String s5 = "flag";
        String s6 = "hello guys";





    ///    System.out.println(s1.compareTo(s2));// 0 because both are equal
   //     System.out.println(s1.compareTo(s));

 //      System.out.println(s1.compareTo(s3));// -5 because "h" is 5 times lower than "m"
//        System.out.println(s1.compareTo(s4));// -1 because "l" is 1 times lower than "m"
//        System.out.println(s1.compareTo(s5));// 2 because "h" is 2 times greater than "f"
//        System.out.println(s1.compareTo(s6));// -5 because s6 is 5 more character than s1
    }
}

    /*
        Java String compareTo(): empty string

        When we compare two strings in which either first or second string is empty,
        the method returns the length of the string. So, there may be two scenarios:

        If first string is an empty string, the method returns a negative
        If second string is an empty string, the method returns a positive number
        that is the length of the first string.
    */

class CompareToExample2 {
    public static void main(String args[]) {
        String s1 = "hello";
        String s2 = "";
        String s3 = "me";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
    }
}
