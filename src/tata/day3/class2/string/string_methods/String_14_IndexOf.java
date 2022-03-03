package perfect.learn.class2.string.string_methods;

public class String_14_IndexOf {
    public static void main(String[] args) {

    }
    /*1	int indexOf(int ch)	It returns the index position for the given char value
    2	int indexOf(int ch, int fromIndex)	It returns the index position for the
     given char value and from index
    3	int indexOf(String substring)	It returns the index position for the given substring
    4	int indexOf(String substring, int fromIndex)	It returns the index
     position for the given substring and from index
     */
}
/*
   # Java String indexOf()

    The Java String class indexOf() method returns the position
    of the first occurrence of the specified character or string
    in a specified string.

   # Parameters

    1. ch: It is a character value, e.g. 'a'
    2. fromIndex: The index position from where the index of the
        char value or substring is returned.
    3. substring: A substring to be searched in this string

   # Returns

    Index of the searched string or character.

    Internal Implementation

        public int indexOf(int ch) {
                return indexOf(ch, 0);
            }
 */

class IndexOfExample1 {
    public static void main(String[] args) {
        String s1 = "This is indexOf method";
        String s2 = "this index";
        System.out.println(s1.indexOf("it"));
        // Passing Substring
//        int index = s1.indexOf("method"); //Returns the index of this substring
//        System.out.println("index of substring "+index);
    }

}

class IndexOfExample2{
    public static void main(String args[]){
        String s1="this is index of example";
//passing substring
        int index1=s1.indexOf("is");//returns the index of is substring
        int index2=s1.indexOf("index");//returns the index of index substring
        System.out.println(index1+"  "+index2);//2 8

//passing substring with from index
        int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index
        System.out.println(index3);//5 i.e. the index of another is

//passing char value
        int index4=s1.indexOf('s');//returns the index of s char value
        System.out.println(index4);//3
    }
}

/*We observe that when a searched string or character is found,
 the method returns a non-negative value. If the string or character is not found, -1 is returned.
 We can use this property to find the total count of a character present in the given string. */

class IndexOfExample3 {
    public static void main(String[] args) {
        String s1 = "This is indexOf method";
        // Passing substring and index
        int index = s1.indexOf("method", 10); //Returns the index of this substring
        System.out.println("index of substring "+index);
        index = s1.indexOf("method", 20); // It returns -1 if substring does not found
        System.out.println("index of substring "+index);
    }
}

class IndexOfExample4 {
    public static void main(String[] args) {
        String s1 = "This is indexOf method";
        // Passing char and index from
        int index = s1.indexOf('e', 12); //Returns the index of this char
        System.out.println("index of char "+index);
    }
}

class IndexOfExample5
{
    public static void main(String argvs[])
    {
        String str = "Welcome to RU CSE";
        int count = 0;
        int startFrom = 0;
        for(; ;)
        {
            int index = str.indexOf('o', startFrom);

            if(index >= 0)
            {
                // match found. Hence, increment the count
                count = count + 1;

                // start looking after the searched index
                startFrom = index + 1;
            }

            else
            {
                // the value of index is - 1 here. Therefore, terminate the loop
                break;
            }

        }

        System.out.println("In the String: "+ str);
        System.out.println("The 'o' character has come "+ count + " times");
    }
}

