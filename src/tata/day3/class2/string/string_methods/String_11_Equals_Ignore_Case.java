package tata.string.string_methods;


import java.util.ArrayList;

public class String_11_Equals_Ignore_Case {
    public static void main(String[] args) {

    }
}
/*
    #Java String equalsIgnoreCase()

    The Java String class equalsIgnoreCase() method compares the two given strings
    on the basis of the content of the string irrespective of the case (lower and upper) of the string.
    It is just like the equals() method but doesn't check the case sensitivity.
    If any character is not matched, it returns false, else returns true.


   # publicboolean equalsIgnoreCase(String str)

        Parameter
        str : another string i.e., compared with this string.
    #Returns

    It returns true if characters of both strings are equal, ignoring case otherwise false.

    #Internal implementation
    public boolean equalsIgnoreCase(String anotherString) {
           return (this == anotherString) ? true
                   : (anotherString != null)
                   && (anotherString.value.length == value.length)
                   && regionMatches(true, 0, anotherString, 0, value.length);
       }

It is obvious from looking at the implementation that the equalsIgnoreCase() method is invoking the regionMatches() method. It makes the equalsIgnoreCase() method case-insensitive. The signature of the regionMatches() method is mentioned below.

public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)

The regionMatches() method parses five parameters. The first parameter ignoreCase is set to true in the above implementation. Thus, when the method is executed, it checks whether the ignoreCase flag is true or not. If yes, then one character each from both the strings is taken and then compared. If the comparison gives a false value, then both the character is converted to upper case and then checked if the comparison still gives a false value, then both the characters are converted to a lower case and then compared. If the comparison gives the true value, then both the strings have equal contents; otherwise, not. Code Snippet of the discussed comparison is mentioned below.

    while (toffset < last)
    {
    char ch1 = getChar(value, toffset++);
    char ch2 = getChar(other, ooffset++);
    if (ch1 == ch2)
    {
    continue;
    }
    // convert each character to uppercase and
    // then make the comparison.
    // If the comparison yeilds a true value,
    // then next pair of characters should be scanned
    char uCh1 = Character.toUpperCase(ch1);
    char uCh2 = Character.toUpperCase(ch2);
    if (uCh1 == u2)
    {
    continue;
    }

    // convert each character to lowercase and
    // then make the comparison.
    // If the comparison yeilds a true value,
    // then next pair of characters should be scanned
    // Otherwise, return false.
    if (Character.toLowerCase(uCh1) == Character.toLowerCase(uCh2))
    {
    continue;
    }
    return false;
    }

    // reaching here means the content of both the strings
    // are the same after ignoring the case sensitiveness
    return true;

One may argue that if we made a comparison after converting to uppercase, then why do we need an extra comparison by converting characters to the lowercase. The reason behind this is to provide to the requirement of Georgian alphabets. Conversion in uppercase does not work properly for the Georgian alphabets, as they have some strange rules about the case conversion. Therefore, one extra comparison, by converting characters to the lowercase, is required.
*/

class EqualsIgnoreCaseExample1 {
    public static void main(String args[]) {
        String s1 = "bangladesh";
        String s2 = "bangladesh";
        String s3 = "BANGlADESH";
        String s4 = "maxico";
        System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same
        System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored
        System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same
    }
}

class EqualsEgnoreCaseExample2 {
    public static void main(String[] args) {
        String str1 = "Esha";
        ArrayList<String> list = new ArrayList<>();
        list.add("mominur");
        list.add("rabitry");
        list.add("esha");
        list.add("tarik");

        for (String str : list) {
            if (str.equalsIgnoreCase(str1)) {
                System.out.println(str1 + " is present.");
            }
        }

    }
}