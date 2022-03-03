package perfect.learn.class2.string.string_methods;

public class String_8_Contains {
    public static void main(String[] args) {

    }
}

/*
    # Java String contains()

    The Java String class contains() method searches the sequence of characters in this string.
    It returns true if the sequence of char values is found in this string otherwise returns false.

   # Signature

    public boolean contains(CharSequence sequence)

    Parameter

   sequence : specifies the sequence of characters to be searched.
    # Returns
    true if the sequence of char value exists, otherwise false.


   # Exception
    NullPointerException : if the sequence is null.

  #  Internal implementation
    public boolean contains(CharSequence s) {
          return indexOf(s.toString()) > -1;
      }

    Here, the conversion of CharSequence takes place into String.
     After that, the indexOf() method is invoked. The method indexOf()
      either returns 0 or a number greater than 0 in case the searched string is found.

    However, when the searched string is not found, the indexOf() method returns -1.
     Therefore, after execution, the contains() method returns true when the indexOf()
     method returns a non-negative value (when the searched string is found);
      otherwise, the method returns false.
*/
class ContainsExample {
    public static void main(String args[]) {
        String str1 = "the name of our country is Bangladesh. the capital of Bangladesh is Dhaka";

        System.out.println("Bangladesh");


//        String name = "what do you know about me";
//        System.out.println(name.contains("do you know"));
//        System.out.println(name.contains("about"));
//        System.out.println(name.contains("hello"));
    }
}


/*
    The contains() method searches case-sensitive char sequence.
        If the argument is not case sensitive, it returns false
*/
class ContainsExample2 {
    public static void main(String[] args) {
        String str = "Hello Tarik?";
        boolean isContains = str.contains("tarik");
        System.out.println(isContains);
        // Case Sensitive
        System.out.println(str.contains("Tarik")); // false
    }
}

/*
    The contains() method is helpful to find a char-sequence in the string.
    We can use it in the control structure to produce the search-based result.
*/

class ContainsExample3 {
    public static void main(String[] args) {
        String str = "The name of our country is Bangladesh." +
                "The longest sea beach Cox Bazar stay in here." +
                "Dhaka is the capital of Bangladesh ";
        if (str.contains("Bangladesh")) {
            System.out.println("This string contains Bangladsh");
        } else
            System.out.println("Result not found");
    }
}

 /*   The contains() method raises the NullPointerException
    when one passes null in the parameter of the method.*/

class ContainsExample4 {
    public static void main(String argvs[]) {
        String str = "Welcome to JavaTpoint!";

// comparing a string to null
        if (str.contains(null)) {
            System.out.println("Inside the if block");
        } else {
            System.out.println("Inside the else block");
        }

    }
}

/*
     # Limitations of the Contains() method

    1>  The contains() method should not be used to search for a character in a string.
        Doing so results in an error.
    2>  The contains() method only checks for the presence or absence
        of a string in another string. It never reveals at which index the searched
        index is found. Because of these limitations, it is better to use the indexOf()
        method instead of the contains() method.
*/
