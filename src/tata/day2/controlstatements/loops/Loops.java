package com.company.controlstatements.loops;

public class Loops {

}



/*
====Java for-each Loop

    The for-each loop is used to traverse array or collection in Java.
    It is easier to use than simple for loop because we don't need to increment value and use subscript notation.
*/

//Java For-each loop example which prints the elements of the array
class ForEachExample {
    public static void main(String[] args) {
        //Declaring an array
        int arr[]={12,23,44,56,78};
        //Printing array using for-each loop
        for(int i:arr){
            System.out.println(i);
        }
    }
}

/*
    Java Labeled For Loop

    We can have a name of each Java for loop. To do so, we use label before the for loop.
    It is useful while using the nested for loop as we can break/continue specific for loop.
    Note: The break and continue keywords breaks or continues the innermost for loop respectively.
*/

//A Java program to demonstrate the use of labeled for loop
class LabeledForExample {
    public static void main(String[] args) {
        //Using Label for outer and for loop
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    break aa;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}