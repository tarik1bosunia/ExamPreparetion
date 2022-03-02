package tata.day2.controlstatements;

public class ControlStatements {
}

/*
Java provides three types of control flow statements.

    1.Decision Making statements
        if statements
        switch statement
    2.Loop statements
        do while loop
        while loop
        for loop
        for-each loop
    3.Jump statements
        break statement
        continue statement


====Java Switch Statement

    The Java switch statement executes one statement from multiple conditions.
     It is like if-else-if ladder statement. The switch statement works with byte,
      short, int, long, enum types, String and some wrapper types like Byte, Short,
       Int, and Long. Since Java 7, you can use strings in the switch statement.

    In other words, the switch statement tests the equality of a variable against multiple values.
    Points to Remember

    There can be one or N number of case values for a switch expression.
    The case value must be of switch expression type only. The case value must be literal or constant.
     It doesn't allow variables.
    The case values must be unique. In case of duplicate value, it renders compile-time error.
    The Java switch expression must be of byte, short, int, long (with its Wrapper type), enums and string.
    Each case statement can have a break statement which is optional. When control reaches to
     the break statement, it jumps the control after the switch expression.
    If a break statement is not found, it executes the next case.
    The case value can have a default label which is optional.



*/
//if else example
class LeapYearExample {
    public static void main(String[] args) {
        int year=2020;
        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("COMMON YEAR");
        }
    }
}

// switch example
class Student {
    public static void main(String[] args) {
        int num = 2;
        switch ( num){
            case 0:
                System.out.println("number is 0");
                break;
            case 1:
                System.out.println("number is 1");
                break;
            default:
                System.out.println(num);
        }
    }
}

class SwitchMonthExample1 {
    public static void main(String[] args) {
        //Specifying month number
        int month=7;
        String monthString="";
        //Switch statement
        switch(month){
            //case statements within the switch block
            case 1: monthString="1 - January";
                break;
            case 2: monthString="2 - February";
                break;
            case 3: monthString="3 - March";
                break;
            case 4: monthString="4 - April";
                break;
            case 5: monthString="5 - May";
                break;
            case 6: monthString="6 - June";
                break;
            case 7: monthString="7 - July";
                break;
            case 8: monthString="8 - August";
                break;
            case 9: monthString="9 - September";
                break;
            case 10: monthString="10 - October";
                break;
            case 11: monthString="11 - November";
                break;
            case 12: monthString="12 - December";
                break;
            default:System.out.println("Invalid Month!");
        }
        //Printing month of the given number
        System.out.println(monthString);
    }
}

class SwitchVowelExample2 {
    public static void main(String[] args) {
        char ch='O';
        switch(ch)
        {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            case 'A':
                System.out.println("Vowel");
                break;
            case 'E':
                System.out.println("Vowel");
                break;
            case 'I':
                System.out.println("Vowel");
                break;
            case 'O':
                System.out.println("Vowel");
                break;
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}
class SwitchExample3 {
    public static void main(String[] args) {
        int number=20;
        //switch expression with int value
        switch(number){
            //switch cases without break statements
            case 10: System.out.println("10");
            case 20: System.out.println("20");
            case 30: System.out.println("30");
            default:System.out.println("Not in 10, 20 or 30");
        }
    }
}

//Java Program to demonstrate the use of Java Switch
//statement with String
class SwitchStringExample {
    public static void main(String[] args) {
        //Declaring String variable
        String levelString="Expert";
        int level=0;
        //Using String in Switch expression
        switch(levelString){
            //Using String Literal in Switch case
            case "Beginner": level=1;
                break;
            case "Intermediate": level=2;
                break;
            case "Expert": level=3;
                break;
            default: level=0;
                break;
        }
        System.out.println("Your Level is: "+level);
    }
}

//Java Program to demonstrate the use of Java Nested Switch
class NestedSwitchExample4 {
    public static void main(String args[])
    {
        //C - CSE, E - ECE, M - Mechanical
        char branch = 'C';
        int collegeYear = 4;
        switch( collegeYear )
        {
            case 1:
                System.out.println("English, Maths, Science");
                break;
            case 2:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Computer Organization, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
            case 4:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Data Communication and Networks, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Embedded System, Image Processing");
                        break;
                    case 'M':
                        System.out.println("Production Technology, Thermal Engineering");
                        break;
                }
                break;
        }
    }
}

//Java Program to demonstrate the use of Enum
//in switch statement
class JavaSwitchEnumExample5 {
    public enum Day {Sun, Mon, Tue, Wed, Thu, Fri, Sat}

    public static void main(String args[]) {
        Day[] DayNow = Day.values();

        for (Day Now : DayNow) {
            switch (Now) {
                case Sun:
                    System.out.println("Sunday");
                    break;
                case Mon:
                    System.out.println("Monday");
                    break;
                case Tue:
                    System.out.println("Tuesday");
                    break;
                case Wed:
                    System.out.println("Wednesday");
                    break;
                case Thu:
                    System.out.println("Thursday");
                    break;
                case Fri:
                    System.out.println("Friday");
                    break;
                case Sat:
                    System.out.println("Saturday");
                    break;
            }
        }
    }
}
//Java Program to demonstrate the use of Wrapper class
//in switch statement
class WrapperInSwitchCaseExample7 {
    public static void main(String args[])
    {
        Integer age = 18;
        switch (age)
        {
            case (16):
                System.out.println("You are under 18.");
                break;
            case (18):
                System.out.println("You are eligible for vote.");
                break;
            case (65):
                System.out.println("You are senior citizen.");
                break;
            default:
                System.out.println("Please give the valid age.");
                break;
        }
    }
}
// ternary operator example
class IfElseTernaryExample {
    public static void main(String[] args) {
        int number=13;
        //Using ternary operator
        String output=(number%2==0)?"even number":"odd number";
        System.out.println(output);
    }
}

// for each loop example
class Calculation {
    public static void main(String[] args) {
        String[] names = {"Java","C","C++","Python","JavaScript"};
        System.out.println("Printing the content of the array names:\n");
        for(String name:names) {
            System.out.println(name);
        }
    }
}



