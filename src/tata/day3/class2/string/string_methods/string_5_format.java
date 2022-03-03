package perfect.learn.class2.string.string_methods;

public class string_5_format {
    public static void main(String[] args) {

    }
}

/*
    Java String format()
    *The java string format() method returns the formatted
    string by given locale, format and arguments.

    *If you don't specify the locale in String.format() method,
    it uses default locale by calling Locale.getDefault() method.

    *The format() method of java language is like sprintf() function in
    c language and printf() method of java language.


    //Internal implementation
    public static String format(String format, Object... args) {
           return new Formatter().format(format, args).toString();
    }

   # Signature
    There are two type of string format() method:

   1. public static String format(String format, Object... args)

   2. public static String format(Locale locale, String format, Object... args)


   #Parameters
    locale : specifies the locale to be applied on the format() method.

    format : format of the string.

    args : arguments for the format string. It may be zero or more.


     #Returns
    formatted string

    #Throws
    NullPointerException : if format is null.

    IllegalFormatException : if format is illegal or incompatible.
*/

class FormatExample1 {

    public static void main(String[] args) {

        String name = "tarik";
        int age = 22;
        String sf1 = String.format("name: %s\n%d", name,50);
        String sf2 = String.format("age: %d", age);
        String sf3 = String.format("value is %.2f", 15.12367);//return 12 char fractional part filling with 0

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);

    }
}

//    Java String Format Specifiers
class FormatExample2 {
    public static void main(String[] args) {
        String str1 = String.format("%d", 101);          // Integer value
        String str2 = String.format("%s", "Amar Singh"); // String value
        String str3 = String.format("%f", 101.00);       // Float value
        String str4 = String.format("%x", 101);          // Hexadecimal value
        String str5 = String.format("%c", 'c');          // Char value
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }

}

//Apart from formatting, we can set width, padding etc. of any value.
class FormatExample3 {
    public static void main(String[] args) {
        String str1 = String.format("%d", 101);
        String str2 = String.format("%10d", 101);//specifying length of integer
       String str3 = String.format("|%-10d|", 101);//// Left-justifying within the specified width
       String str4 = String.format("% d", 101);//shifting 1 from left
        String str5 = String.format("|%010d|", 101); // Filling with zeroes

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}