package perfect.learn.class2.string.string_methods;

public class String_13_getChars {
    public static void main(String[] args) {
        System.out.println("tata");
    }
}
/*
    #Java String getChars()

    The Java String class getChars() method copies the content of this string
    into a specified char array. There are four arguments passed in the getChars() method.
     The signature of the getChars() method is given below:

    #Signature
    public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)

    #Parameters

    1. int srcBeginIndex: The index from where copying of characters is started.

    2. int srcEndIndex: The index which is next to the last character that is getting copied.

    3. Char[] destination: The char array where characters from the string that invokes the
    getChars() method is getting copied.

    4. int dstEndIndex: It shows the position in the destination array from where
     the characters from the string will be pushed.

    #Returns
    It doesn't return any value.

    #Exception Throws

    The method throws StringIndexOutOfBoundsException when any one or
     more than one of the following conditions holds true.

    If srcBeginIndex is less than zero.
    If srcBeginIndex is greater than srcEndIndex.
    If srcEndIndex is greater than the size of the string that invokes the method
    If dstEndIndex is is less than zero.
    If dstEndIndex + (srcEndIndex - srcBeginIndex) is greater than the size of the destination array.

    #Internal implementation

    void getChars(char dst[], int dstBegin) {
            // copies value from 0 to dst - 1
            System.arraycopy(value, 0, dst, dstBegin, value.length);
        }
 */

class StringGetCharsExample {
    public static void main(String args[]) {
        String str = new String("hello RU CSE");
        char[] ch = new char[10];
        ch[0] = 'a';
        try {
            str.getChars(0, 5, ch, 2);
            System.out.println(ch);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}

class StringGetCharsExample2 {
    public static void main(String[] args) {
        String str = new String("Welcome to bangladesh");
        char[] ch = new char[20];
        try {
            str.getChars(1, 26, ch, 0);
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
    The getChars() method does not copy anything into the char array,
     provided the value of srcBeginIndex and srcEndIndex are the same.
      It is because the getChars() method copies from the srcBeginIndex
      index to srcEndIndex - 1 index. As srcBeginIndex is equal to srcEndIndex;
      therefore, srcEndIndex - 1 is less than srcBeginIndex.
     Therefore, the getChars() method copies nothing.
      The following example confirms the same.
 */
class StringGetCharsExample3 {
    // main method
    public static void main(String argvs[]) {
        String str = "Welcome to Bangladesh!";

        // creating a char array of size 25
        char[] chArr = new char[25];

        // start and end indices are same
        int srcBeginIndex = 11;
        int srcEndIndex = 11;
        int dstBeginIndex = 2;

        try {
            // invoking the method getChars()
            str.getChars(srcBeginIndex, srcEndIndex, chArr, dstBeginIndex);
            System.out.println(chArr);
        } catch (Exception excpn) {
            System.out.println(excpn);
        }
        System.out.println("The getChars() method prints nothing as start and end indices are equal.");
    }
}