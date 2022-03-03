package perfect.learn.class1.string.string_methods.String_3_charAt;

import java.util.ArrayList;

public class String_3_charAt {
    public static void main(String[] args) {

    }
}

 /*
     #(1)Java String charAt()
        The Java String class charAt() method returns a char value at the given index number.

        *   The index number starts from 0 and goes to n-1,
            where n is the length of the string.
        *   It returns StringIndexOutOfBoundsException,
            if the given index number is greater than or equal to this
            string length or a negative number.

        //Internal implementation

        public char charAt(int index) {
            if ((index < 0) || (index >= value.length)) {
               throw new StringIndexOutOfBoundsException(index);
            }
           return value[index];
        }
*/

 class CharAtExample1{
     public static void main(String[] args) {
        /* String country = "Bangladesh";
         char ch = country.charAt(3);
         System.out.println(ch);*/

         //out of range example

        /* String country = "Bangladesh";
         char ch = country.charAt(10);
         System.out.println(ch);*/

/*
         String country = "Bangladesh";
         int strLength = country.length();
         //Accessing First and Last Character by Using the charAt() Method
         System.out.println("The character at 0 index: " + country.charAt(0));
         System.out.println("The character at last index: " + country.charAt(strLength -1));*/

         //Print Characters Presented at Odd Positions by Using the charAt() Method
        /* String str = "The name of our country is Bangladesh";
         for (int i=0; i<=str.length()-1; i++) {
             if(i%2!= 0) {
                 System.out.println("Char at "+i+" place "+str.charAt(i));
             }
         }*/

        // Counting Frequency of a character in a String by Using the charAt() Method
       /*  String str = "The name of our country is Bangladesh";
         int count = 0;
         for (int i=0; i<=str.length()-1; i++) {
             if (str.charAt(i) == 't') {
                 count++;
             }
         }
         System.out.println("Frequency of t is: " + count);*/
     }
 }

 class charAtExample2{
     ArrayList<Character>al;
     charAtExample2(){
         initialize();
     }
     void initialize()
     {
         al = new ArrayList<Character>();
         al.add('A'); al.add('E');
         al.add('a'); al.add('e');
         al.add('I'); al.add('O');
         al.add('i'); al.add('o');
         al.add('U'); al.add('u');
     }
     private boolean isVowel(char c){
         for (int i = 0; i < al.size(); i++) {
                if(c == al.get(i)){
                    return true;
                }
         }
         return false;
     }
     public  int countVowels(String s){
         int size = s.length();
         char c;
         int countVowel = 0;
         for (int j = 0; j < size; j++) {
                 c = s.charAt(j);
                 if(isVowel(c)){
                     countVowel++;
                 }
         }
         return countVowel;
     }

     public static void main(String[] args) {
         charAtExample2 t1= new charAtExample2();
         String str = "The name of our country is Bangladesh";
         int nrOfVowels = t1.countVowels(str);
         System.out.println("String: " + str);
         System.out.println("Total number of vowels of the string are: " + nrOfVowels);
     }
 }