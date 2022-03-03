package perfect.learn.class2.string.string_methods;

import java.util.ArrayList;

public class String_10_Equals {
    public static void main(String[] args) {

    }
}
/*
    ##Java String equals()

    The Java String class equals() method compares the two given
    strings based on the content of the string. If any character
    is not matched, it returns false. If all characters are matched,
    it returns true.

    #The String equals() method overrides the equals() method of the Object class.

    #Signature
    public boolean equals(Object anotherObject)

    #Parameter
    anotherObject : another object, i.e., compared with this string.

    #Returns
    true if characters of both strings are equal otherwise false.

    #Internal implementation

    public boolean equals(Object anObject) {
          if (this == anObject) {
              return true;
          }
          if (anObject instanceof String) {
              String anotherString = (String) anObject;
              int n = value.length;
              if (n == anotherString.value.length) {
                  char v1[] = value;
                  char v2[] = anotherString.value;
                  int i = 0;
                  while (n-- != 0) {
                      if (v1[i] != v2[i])
                              return false;
                      i++;
                  }
                  return true;
              }
         }
         return false;
    }
*/


class EqualsExample {
    public static void main(String args[]) {
        String s1 = "java";
        String s2 = "java";
        String s3 = "JAVA";
        String s4 = "python";
        System.out.println(s1.equals(s2));//true because content and case is same
        System.out.println(s1.equals(s3));//false because case is not same
        System.out.println(s1.equals(s4));//false because content is not same
    }
}

class EqualExample3 {
    public static void main(String[] args) {
        String str1 = "Esha";
        ArrayList<String> list = new ArrayList<>();
        list.add("Mominur");
        list.add("Rabitry");
        list.add("Esha");
        list.add("Tarik");

        for (String str : list) {
            if (str.equals(str1)) {
                System.out.println(str1 + " is present.");
            }
        }

    }
}


/*The internal implementation of the equals() method shows that one can
 pass the reference of any object in the parameter of the method.*/

class EqualsExample4 {
    // main method
    public static void main(String argvs[]) {
// Strings
        String str = "a";
        String str1 = "123";
        String str2 = "45.89";
        String str3 = "false";
        Character c = new Character('a');
        Integer i = new Integer(123);
        Float f = new Float(45.89);
        Boolean b = new Boolean(false);
// reference of the Character object is passed
        System.out.println(str.equals(c));
// reference of the Integer object is passed
        System.out.println(str1.equals(i));
// reference of the Float object is passed
        System.out.println(str2.equals(f));
// reference of the Boolean object is passed
        System.out.println(str3.equals(b));
// the above print statements show a false value because
// we are comparing a String with different data types
// To achieve the true value, we have to convert
// the different data types into the string using the toString() method
        System.out.println(str.equals(c.toString()));
        System.out.println(str1.equals(i.toString()));
        System.out.println(str2.equals(f.toString()));
        System.out.println(str3.equals(b.toString()));
    }
}