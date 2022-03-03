package perfect.learn.class2.string.string_methods;

public class String_7_Concat {
    public static void main(String[] args) {

    }
}

/*
    #   Java String concat

        The Java String class concat() method combines specified string
        at the end of this string. It returns a combined string.
        It is like appending another string.

    #Signature
    The signature of the string concat() method is given below:
    public String concat(String anotherString)

    #Parameter
    anotherString : another string i.e., to be combined at the end of this string.

    #Returns
    combined string

    #Internal implementation
    public String concat(String str) {
           int otherLen = str.length();
           if (otherLen == 0) {
               return this;
           }
           int len = value.length;
           char buf[] = Arrays.copyOf(value, len + otherLen);
           str.getChars(buf, len);
           return new String(buf, true);
    }
*/

class ConcatExample {
    public static void main(String args[]) {
        String s1 = "java string";
// The string s1 does not get changed, even though it is invoking the method
// concat(), as it is immutable. Therefore, the explicit assignment is required here.
        s1.concat("is immutable");
        System.out.println(s1);
        s1 = s1.concat(" is immutable so assign it explicitly");
        System.out.println(s1);
    }
}

//Let's see an example where we are concatenating multiple string objects.

class ConcatExample2 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Tarik,";
        String str3 = "How are you?";
        // Concatenating one string
//        String str4 = str1.concat(" ").concat(str2).concat(str3);
//        System.out.println(str4);
        // Concatenating multiple strings
//        String str5 = str1.concat(str2).concat(str3);
//        System.out.println(str5);
    }
}


class ConcatExample3 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Tarik";
        String str3 = "How are you";
        // Concatenating Space among strings
        String str4 = str1.concat(" ").concat(str2).concat(", ").concat(str3);
        System.out.println(str4);
        // Concatenating Special Chars
        String str5 = str4.concat("???");
        System.out.println(str5);

        String str6 = "bosuniamdtarik005";
        String str7 = "gamil.com";
        String str8 = str6.concat("@").concat(str7);
        System.out.println(str8);
    }
}


// a string at the beginning of another string
class ConcatExample4 {
    public static void main(String argvs[]) {
        String str = " is my favourite Team.";

        String s = "Bangladesh".concat(str);

        System.out.println(s);

    }
}
