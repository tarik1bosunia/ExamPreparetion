package tata.day4;

import java.util.ArrayList;
import java.util.LinkedList;

public class ThreadExample1 extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadExample1 t1 = new ThreadExample1();
        t1.start();
    }
}

class ThreadExample2 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " :" +  i);
        }
    }

    public static void main(String[] args) {
        ThreadExample2 threadExample2 = new ThreadExample2();
        Thread t1 = new Thread(threadExample2 ,"thread A");
        t1.start();

        Thread t2 = new Thread(threadExample2, "thread B");
        t2.start();
    }
}



/**
 A bank account has a balance that can be changed by
 deposits and withdrawals.*/
class BankAccount {
    private double balance;

    /*Constructs a bank account with a zero balance.*/
    public BankAccount() {
        balance = 0;
    }

    /*
        Deposits money into the bank account.@param amount the amount to deposit
    */
    public void deposit(double amount) {
        System.out.print("Depositing " + amount);
        double newBalance = balance + amount;
        System.out.println(", new balance is " + newBalance);
        balance = newBalance;
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        System.out.print("Withdrawing " + amount);
        double newBalance = balance - amount;
        System.out.println(", new balance is " + newBalance);
        balance = newBalance;
    }

    /**
     * Gets the current balance of the bank account.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }


}
class A extends Thread{
   static BankAccount b;

    @Override
    public void run() {
        b.deposit(100);
    }

    public static void main(String[] args) {
        b = new BankAccount();
        A tata = new A();
        tata.start();


    }
}



class BookTheatersSeat{
    int total_seats = 10;
   synchronized void bookSeat(int seat){

        if(this.total_seats >= seat){// critical section
            System.out.println("Seat booking successfully!");
            this.total_seats = total_seats - seat;
            System.out.println("seats left : " + total_seats );
        }else {
            System.out.println("Seat can not booked");
            System.out.println("seats left : " + total_seats );
        }
    }
}

class MovieBookApp extends Thread{
    static BookTheatersSeat b;
    int seats;
    @Override
    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheatersSeat();

        MovieBookApp tarik = new MovieBookApp();
        tarik.seats = 7;
        tarik.start();

        MovieBookApp abid = new MovieBookApp();
        abid.seats = 4;
        abid.start();
    }
}

class X{
    ArrayList<Integer> list  = new ArrayList<Integer>();
    synchronized void addValue(int value){
        list.add(value);
        System.out.println(list);
    }

}
class Y extends Thread{
    static X x;

    public void setValue(int value) {
        this.value = value;
    }

    int value;
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            x.addValue(i);

        }

    }

    public static void main(String[] args) {
        x = new X();
        Y t1 = new Y();
        Y t2 = new Y();
        t1.start();
        t2.start();





    }
}

abstract class P extends Thread{
    static P x;
    abstract void func();

    @Override


    public void run() {


        for (int i = 1; i <= 5; i++) {
            try {
                x.interrupt();
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println("catch block");
            }

        }


    }


}

class Q extends P{

    @Override
    void func() {

    }
}
