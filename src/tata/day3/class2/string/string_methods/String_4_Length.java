package perfect.learn.class2.string.string_methods;

public class String_4_Length {
    public static void main(String[] args) {

    }
}


/*
       # Java String length()
        The Java String class length() method finds the length of a string.

    Signature
    The signature of the string length() method is given below:

    public int length()
    Specified by
    CharSequence interface

    Returns
    Length of characters. In other words, the total number of
    characters present in the string.

    Internal implementation
    public int length() {
          return value.length;
      }
    The String class internally uses a char[] array to store the characters
*/

class LengthExample1 {
    public static void main(String args[]) {
        String str = new String("cse");
        System.out.println(str);

        str = "ru";

        System.out.println(str.length());


//        String s1 = "java";
//        String s2 = "python";
//        int len1 = s1.length();
//        System.out.println("string length is: " + s1.length());
//        System.out.println("string length is: " + s2.length());
    }
}


/*Since the length() method gives the total number of characters present in the string;
therefore, one can also check whether the given string is empty or not.*/

class LengthExample2 {
    public static void main(String[] args) {
        String str = "Javatpoint";
        if (str.length() > 0) {
            System.out.println("String is not empty and length is : " + str.length());
        }
        str = "";
        if (str.length() == 0) {
            System.out.println("String is empty now and length is : " + str.length());
        }
    }
}


///  The length() method is also used to reverse the string.
class LengthExample3 {

    public static void main(String[] args) {

        String str = "Welcome To RU CSE";
        int size = str.length();

        System.out.println("Reverse of the string: " + "'" + str + "'" + " is");

        for (int i = 0; i < size; i++) {
            // printing in reverse order
            System.out.print(str.charAt(str.length() - 1 -i ));
        }

    }
}

/* The length() method can also be used to find only the
 white spaces present in the string. Observe the following example.*/
class lengthExample4 {
    public static void main(String[] args) {
        String str = "Welcome to java perfect learning";
        System.out.println("In the string \'" + str + "\'");

        int sizeWithWhiteSpaces = str.length();
        str = str.replace(" ", "");
        System.out.println(str);
      int sizeWithoutWithespace = str.length();


        System.out.printf("Number of whiteSpace: " + (sizeWithWhiteSpaces - sizeWithoutWithespace));
    }
}