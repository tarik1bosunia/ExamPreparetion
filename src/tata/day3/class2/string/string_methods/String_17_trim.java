package perfect.learn.class2.string.string_methods;

public class String_17_trim {
    public static void main(String[] args) {

    }
}
/*Java String trim()

The Java String class trim() method eliminates leading
 and trailing spaces. The Unicode value of space character
  is '\u0020'. The trim() method in Java string checks this
   Unicode value before and after the string, if it exists
    then the method removes the spaces and returns the omitted string.
The string trim() method doesn't omit middle spaces.
Signature

The signature or syntax of the String class trim() method is given below:

    public String trim()

Returns

string with omitted leading and trailing spaces
Internal implementation

    public String trim() {
            int len = value.length;
            int st = 0;
            char[] val = value;     avoid getfield opcode

            while ((st < len) && (val[st] <= ' ')) {
        st++;
        }
        while ((st < len) && (val[len - 1] <= ' ')) {
        len--;
        }
        return ((st > 0) || (len < value.length)) ? substring(st, len) :this;
        }

*/

class StringTrimExample{
    public static void main(String args[]){
        String s1="  hello string   ";
        System.out.println(s1+"tata");//without trim()
        System.out.println(s1.trim()+"tata");//with trim()
    }
}

class StringTrimExample2 {
    public static void main(String[] args) {
        String s1 ="  hello java string   ";
        System.out.println(s1.length());
        String tr = s1.trim();
        System.out.println(tr.length());

    }
}

class TrimExample3
{
    // main method
    public static void main(String argvs[])
    {

        String str = " abc ";

        if((str.trim()).length() > 0)
        {
            System.out.println("The string contains characters other than white spaces \n");
        }
        else
        {
            System.out.println("The string contains only white spaces \n");
        }

        str = "    ";

        if((str.trim()).length() > 0)
        {
            System.out.println("The string contains characters other than white spaces \n");
        }
        else
        {
            System.out.println("The string contains only white spaces \n");
        }

    }
}

/*
    Since strings in Java are immutable;
    therefore, when the trim() method manipulates the string
    by trimming the whitespaces, it returns a new string.
    If the manipulation is not done by the trim() method,
     then the reference of the same string is returned.
      Observe the following example.
*/

class TrimExample4
{

    public static void main(String argvs[])
    {

// the string contains white spaces
// therefore, trimming the spaces leads to the
// generation of new string
        String str = " abc ";

// str1 stores a new string
        String str1 = str.trim();

// the hashcode of str and str1 is different
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode() + "\n");

// no white space present in the string s
// therefore, the reference of the s is returned
// when the trim() method is invoked
        String s = "xyz";
        String s1 = s.trim();

// the hashcode of s and s1 is the same
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

    }
}