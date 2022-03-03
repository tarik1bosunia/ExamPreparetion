package perfect.learn.class2.string.string_methods;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class String_12_GetBytes {
    public static void main(String[] args) {

    }
}
/*
    #Java String getBytes()

    The Java String class getBytes() method does the encoding of string
    into the sequence of bytes and keeps it in an array of bytes.

    #Signature
    There are three variants of getBytes() method.

   1. public byte[] getBytes()
   2. public byte[] getBytes(Charset charset)
   3. public byte[] getBytes(String charsetName)throws UnsupportedEncodingException

    #Parameters
    charset / charsetName - The name of a charset the method supports.

    #Returns
    Sequence of bytes.

    #Exception Throws
    UnsupportedEncodingException: It is thrown when the mentioned charset is not supported by the method.

    #Internal implementation

    public byte[] getBytes() {

           return StringCoding.encode(value, 0, value.length);
    }
*/

class StringGetBytesExample {
    public static void main(String args[]) {
        String s1 = "ABCDEFG";
        byte[] barr = s1.getBytes();
        for (int i = 0; i < barr.length; i++) {
            System.out.println(barr[i]);
        }
    }
}

//   The method returns a byte array that again can be passed to the String constructor to get String.

class StringGetBytesExample2 {
    public static void main(String[] args) {
        String s1 = "ABCDEFG";
        byte[] barr = s1.getBytes();
        for (int i = 0; i < barr.length; i++) {
            System.out.println(barr[i]);
        }

        // Getting string back
        String s2 = new String(barr);
        System.out.println(s2);
    }
}

class StringGetByteExample3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "Welcome to bangladesh";
        System.out.println("The input string is:");
        System.out.println(str + "\n");

        //16 - bit UCS Transformation format
        byte[] byteArr1 = str.getBytes(StandardCharsets.UTF_16);
        for (int i = 0; i < byteArr1.length; i++) {
            System.out.print(byteArr1[i]);
        }
        System.out.println("\n");


        // Big Endian byte order, 16 - bit UCS Transformation format
        byte[] byteArr2 = str.getBytes(StandardCharsets.UTF_16BE);
        System.out.println("After converted into UTF-16BE the String is : ");
        for (int i = 0; i < byteArr2.length; i++) {
            System.out.print(byteArr2[i]);
        }
        System.out.println("\n");

        // // ISO Latin Alphabet
        byte[] byteArr3 = str.getBytes(StandardCharsets.ISO_8859_1);
        System.out.println("After converted into  ISO Latin Alphabet  the String is : ");
        for (int i = 0; i < byteArr3.length; i++) {
            System.out.print(byteArr3[i]);
        }
        System.out.println("\n");

        // Little Endian byte order, 16 - bit UCS Transformation format

        byte[] byteArr4 = str.getBytes(StandardCharsets.UTF_16LE);
        System.out.println("After converted into UTF-16LE the String is : ");
        for (int i = 0; i < byteArr4.length; i++) {
            System.out.print(byteArr4[i]);
        }
        System.out.println("\n");

    }
}

// The following example shows when the charset is not supported by the getBytes() method
 /*  public class StringGetBytesExample4
   {
       // main method
      public static void main(String argvs[])
       {
           // input string
           String str = "Welcome to JavaTpoint.";
           System.out.println("The input String is : ");
           System.out.println(str + "\n");

           // encoding into UTF - 17
           byte[] byteArr = str.getBytes(StandardCharsets.UTF-17);
           System.out.println("After converted into UTF-17 the String is : ");

           for (int j = 0; j < byteArr.length; j++)
           {
               System.out.print(byteArr[j]);
           }


       }
   }*/


// byte,short,int ,long
// float ,double
// character
// boolean