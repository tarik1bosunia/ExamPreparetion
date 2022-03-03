package tata.day3.JavaThread;

import javax.imageio.IIOException;

class TestSleepMethod1 extends Thread{
    public void run(){
        //Thread Sleep for 500 milli seconds
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(i);
            }

        }
    }
}

public class ThreadSleepMethod {
    public static void main(String[] args) {
//        TestSleepMethod1 t1 = new TestSleepMethod1();
//        TestSleepMethod1 t2 = new TestSleepMethod1();
//        t1.start();
//        t2.start();

        try {
            for (int i = 0; i < 5 ; i++) {
                Thread.sleep(1000);///negative value set is cause exception
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

}


/*
        Parameters:
        The following are the parameters used in the sleep() method.
        mls: The time in milliseconds is represented by the parameter mls. The duration for which
        the thread will sleep is given by the method sleep().
        n: It shows the additional time up to which the programmer or developer wants
         the thread to be in the sleeping state. The range of n is from 0 to 999999.
        The method does not return anything.
        *
        *
        *
        Important Points to Remember About the Sleep() Method

        Whenever the Thread.sleep() methods execute, it always halts the execution of the current thread.

        Whenever another thread does interruption while the current thread is already in the sleep mode,
         then the InterruptedException is thrown.

        If the system that is executing the threads is busy, then the actual sleeping time of the thread is generally
         more as compared to the time passed in arguments.
         However, if the system executing the sleep() method has less load, then the actual sleeping time
          of the thread is almost equal to the time passed in the argument.
* */
