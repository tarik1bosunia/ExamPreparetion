package tata.day3.class1.unit1.string;

import java.util.Locale;

public class StringMethods {
}


/*
    1. length() 	Returns the length of String name. (4 in this case)
    2. toLowerCase() 	Converts all the characters of the string to the lower case letters.
    3. toUpperCase() 	Converts all the characters of the string to the upper case letters.
    4. trim() 	Returns a new String after removing all the leading and trailing spaces from the original string.
    5. substring(int start)

    Returns a substring from start to the end. Substring(3) returns “ry”. [Note that indexing starts from 0]
    6. substring(int start, int end) 	Returns a substring from the start index to the end index. The start index is included, and the end is excluded.
    7. replace(‘r’, ‘p’) 	Returns a new string after replacing r with p. Happy is returned in this case. (This method takes char as argument)
    8. startsWith(“Ta”) 	Returns true if the name starts with the string “Ha”. (True in this case)
    9. endsWith(“ta”) 	Returns true if the name ends with the string “ry”. (True in this case)
    10. charAt(2) 	Returns the character at a given index position. (r in this case)
    11. indexOf(“s”) 	Returns the index of the first occurrence of the specified character in the given string.
    12. lastIndexOf(“r”) 	Returns the last index of the specified character from the given string. (3 in this case)
    13. equals(“Tata”) 	Returns true if the given string is equal to “Harry” false otherwise [Case sensitive]
    14. equalsIgnoreCase(“tata”) 	Returns true if two strings are equal, ignoring the case of characters.
* */

class Str{
    String country = "Bangldesh";
    public void Length() {
        System.out.println(country.length());
        System.out.println(country.toLowerCase());
        System.out.println(country.toUpperCase());
        System.out.println(country.trim());
        System.out.println(country.substring(7));
        System.out.println(country.substring(1, 3));
        System.out.println(country.replace("desh","country"));
        System.out.println(country.replace('a','D'));
        System.out.println(country.startsWith("ba"));
        System.out.println(country.startsWith("Ba"));
        System.out.println(country.startsWith("dhaka"));



    }

    void func(){
        String tata = "Rajsaahahi";
        System.out.println(tata.charAt(3));
        System.out.println(tata.indexOf('a'));
        System.out.println(tata.lastIndexOf('a'));
        System.out.println(tata.lastIndexOf("ha"));
    }

    void func2(){
        String str1 = "CSE";
        String str2 = "CSE";
        String str3 = "EEE";
        String str4 = new String("CSE");
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));


//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str1 == str4);
    }

    // string pull

    public static void main(String[] args) {
        Str str = new Str();
        str.func2();
    }

}