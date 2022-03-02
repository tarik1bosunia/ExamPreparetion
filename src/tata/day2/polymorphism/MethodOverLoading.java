package com.company.polymorphism;

public class MethodOverLoading {
}

/*
=====Method Overloading in Java

    #learning outcome....
    Different ways to overload the method
    By changing the no. of arguments
    By changing the datatype
    Why method overloading is not possible by changing the return type
    Can we overload the main method
    method overloading with Type Promotion

====If a class has multiple methods having same name but different in parameters,
    it is known as Method Overloading.

====Advantage of method overloading
    Method overloading increases the readability of the program.

====There are two ways to overload the method in java
    1. By changing number of arguments
    2. By changing the data type of the arguments

 */
// changing number of arguments

/*class Adder{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
}
class TestOverloading1{
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
    }
}*/
/*
// this in a technique to pass unknown number of parameters
class Adder{

    static int add(int ...hahas){
        int sum = 0;
       int l = hahas.length;
        for (int i = 0; i < l ;i++) {
            sum += hahas[i];
        }
        return sum;
    }
}
class TestOverloading1{
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
    }
}
*/



/*class Adder{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
}
class TestOverloading1{
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
    }}*/



//2) Method Overloading: changing data type of arguments

/*class Adder{
    static int add(int a, int b){return a+b;}
    static double add(double a, double b){return a+b;}
}
class TestOverloading2{
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(12.3,12.6));
    }
}  */

/*
    Q) Why Method Overloading is not possible by changing the return type of method only?

    In java, method overloading is not possible by changing the return type of the method only because of ambiguity.
*/
/*
class Adder{
    static int add(int a,int b){return a+b;}
    static double add(int a,int b){return a+b;}
}
class TestOverloading3{
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));//ambiguity
    }
    //Here, how can java determine which sum() method should be called?.. there is no way
}*/


/*
        Can we overload java main() method?

        Yes, by method overloading. You can have any number of main methods in a
        class by method overloading. But JVM calls main() method which receives string array as arguments only.

*/

class TestOverloading4{
    public static void main(String[] args){System.out.println("main with String[]");}
    public static void main(String args){System.out.println("main with String");}
    public static void main(){System.out.println("main without args");}
}


/*
    Method Overloading and Type Promotion

    One type is promoted to another implicitly if no matching datatype is found.
*/
//Example of Method Overloading with TypePromotion
class OverloadingCalculation1{
    void sum(int a,long b){System.out.println(a+b);}
    void sum(int a,int b,int c){System.out.println(a+b+c);}

    public static void main(String args[]){
        OverloadingCalculation1 obj=new OverloadingCalculation1();
        obj.sum(20,20);//now second int literal will be promoted to long
        obj.sum(20,20,20);

    }
}
//Example of Method Overloading with Type Promotion if matching found

class OverloadingCalculation2{
    void sum(int a,int b){System.out.println("int arg method invoked");}
    void sum(long a,long b){System.out.println("long arg method invoked");}

    public static void main(String args[]){
        OverloadingCalculation2 obj=new OverloadingCalculation2();
        obj.sum(20L,20L);//now int arg sum() method gets invoked
    }
}
//Example of Method Overloading with Type Promotion in case of ambiguity
/*
class OverloadingCalculation3{
    void sum(int a,long b){System.out.println("a method invoked");}
    void sum(long a,int b){System.out.println("b method invoked");}

    public static void main(String args[]){
        OverloadingCalculation3 obj=new OverloadingCalculation3();
        obj.sum(20,20);
        //now ambiguity
        //One type is not de-promoted implicitly for example double cannot be depromoted to any type implicitly.
          // so compile time error
    }
}  */
