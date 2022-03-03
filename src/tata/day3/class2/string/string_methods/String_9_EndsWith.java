package tata.string.string_methods;

public class String_9_EndsWith {
    public static void main(String[] args) {

    }
}

/*
   ## Java String endsWith()

        The Java String class endsWith() method checks if this string ends with a
        given suffix. It returns true if this string ends with the given suffix;
        else returns false.

        # Signature
        public boolean endsWith(String suffix)

        # Parameter
        suffix : Sequence of character

        # Returns
        true or false

       # Internal implementation

        public boolean endsWith(String suffix) {
            return startsWith(suffix, value.length - suffix.value.length);
        }

        The internal implementation shows that the endWith() method is dependent on
        the startsWith() method of the String class.
*/

class EndsWithExample1 {
    public static void main(String args[]) {
        String s1 = "the name of our country of bangladesh";
        System.out.println(s1.endsWith("country to bangladesh"));

      //  System.out.println(s1.endsWith("desh"));
    }
}


//Since the endsWith() method returns a boolean value, the method can also be used in an if statement.

class EndsWithExample2 {
    public static void main(String[] args) {
        String str = "the name of our country of bangladesh";
        System.out.println(str.endsWith("desh"));
        if (str.endsWith("desh")) {
            System.out.println("String ends with desh");
        } else System.out.println("It does not end with desh");
    }
}

//  The endsWith() method takes care of the case sensitiveness of the characters present in a string.

class EndsWithExample3 {
    // main method
    public static void main(String argvs[]) {
        String str = "the name of our country of Bangladesh";

        // the result of the following display statement
        // shows endsWith() considers the case sensitiveness of
        // the charaters of a string
        System.out.println(str.endsWith("bangladesh")); // false because B and  b are different
        System.out.println(str.endsWith("BanglaDesh")); // false because D and d are different
        System.out.println(str.endsWith("Bangladesh")); // true because every character is same

    }
}

/*
    When an empty string is passed in the parameter of the method endsWith(),
    the method always returns a true value.
    The reason behind this is that a string never changes
    when we append an empty string to it.

    The statement
    String str = "Ladies and Gentlemen" + "";
    results in
    str = "Ladies and Gentlemen";

*/
class EndsWithExample4 {
    // main method
    public static void main(String args[]) {
        String str = "where are you now?";

        // prints true
        System.out.println(str.endsWith(""));

        // prints false as there is no white space after the string
        System.out.println(str.endsWith(" "));

    }
}

/*
    The endsWith() method raises the NullPointerException if
    one passes null in the parameter of the method.
*/

class EndsWithExample5 {
    // main method
    public static void main(String args[]) {
        String str = "Welcome to java learning perfectly";

        // invoking the method endsWith with the parameter as null
        if (str.endsWith(null)) {
            System.out.println("Inside the if block");
        } else {
            System.out.println("Inside the else block");
        }

    }
}

//   A String literal can also call the endsWith() method.

class EndsWithExample6 {
    // main method
    public static void main(String args[]) {
        // invoking the method endsWith() using the string literal
        if ("Welcome to tata".endsWith("")) {
            System.out.println("Inside the if block");
        } else {
            System.out.println("Inside the else block");
        }
        // invoking the method endsWith() using the string literal
        if ("Welcome to tata".endsWith("tata")) {
            System.out.println("Inside the if block");
        } else {
            System.out.println("Inside the else block");
        }
        // invoking the method endsWith() using the string literal
        if ("Welcome to tata".endsWith("xyz")) {
            System.out.println("Inside the if block");
        } else {
            System.out.println("Inside the else block");
        }
    }
}