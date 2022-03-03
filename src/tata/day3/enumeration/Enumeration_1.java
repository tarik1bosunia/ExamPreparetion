package enumeration;



 enum Season{
    WINTER,SUMMER,FALL
}

public class Enumeration_1 {

    public static void main(String[] args) {
        for (Season s:Season.values() ){
            System.out.println(s);
        }
        System.out.println("Value of winter: " + Season.valueOf("WINTER"));
        System.out.println("Index of winter: " + Season.valueOf("WINTER").ordinal());


    }
}
// play
///Spring//enterprice level


/*
             Enum improves type safety
            Enum can be easily used in switch
            Enum can be traversed
            Enum can have fields, constructors and methods
            Enum may implement many interfaces but cannot extend any class because it internally extends Enum class


            Note: Java compiler internally adds values(), valueOf() and ordinal() methods
             within the enum at compile time. It internally creates a static and final class for the enum.

             What is the purpose of the values() method in the enum?

            The Java compiler internally adds the values() method when it creates an enum. The values() method returns an array containing all the values of the enum.
            What is the purpose of the valueOf() method in the enum?

            The Java compiler internally adds the valueOf() method when it creates an enum. The valueOf() method returns the value of given constant enum.
            What is the purpose of the ordinal() method in the enum?

            The Java compiler internally adds the ordinal() method when it creates an enum. The ordinal() method returns the index of the enum value.

            Defining Java Enum

            The enum can be defined within or outside the class because it is similar to a class.
             The semicolon (;) at the end of the enum constants are optional. For example:
                 enum Season { WINTER, SPRING, SUMMER, FALL }
                 enum Season { WINTER, SPRING, SUMMER, FALL; }
*/

