package tata.day3.JavaThread.SmartProgrmming;



public class Thread_3  extends Thread{
    public void a(){

        System.out.println("Function A");
    }
    public void b(){

        System.out.println("Function B");
    }

    @Override
    public void run(){
        System.out.println("Thread is running");
        a();
        b();
    }

    public static void main(String[] args) {
        Thread_3 t1 = new Thread_3();
        t1.start();
    }
}

class A extends Thread{
    public void func1(){
        System.out.println("WE will be expert on thread in future");
    }

    @Override
    public void run(){
        try {
            Thread.sleep(10000);
            ///Thread.sleep(10,20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        func1();
    }

    public static void main(String[] args) {
        A a = new A(); //new
        a.start();// runnable
    }
}

interface X{
    int a = 10;
    public void func1();
    public void func2();
    default public void func3(){
        System.out.println("func3 from interface");
    }
}

class B implements X{

    @Override
    public void func1() {
        System.out.println("func1");
    }

    @Override
    public void func2() {
        System.out.println("func2");

    }
    public void func3(){
        System.out.println("func3 from class");

    }

    public static void main(String[] args) {
         B b = new B();
         b.func1();
         b.func2();
         b.func3();
         // basavara 2800
         // current 300
         // wifi 200
         // khawa 4000
         // porasuna
    }
}

class VLC{
    void video(){

    }
    void audio(){

    }
    void timer(){

    }

    public static void main(String[] args) {
        VLC vlc = new VLC();
        vlc.video();
        vlc.audio();
        vlc.timer();
    }
    // multitasking onekgulo task 1 sathe execute kra
    // 1. multiprocessing// onek gulo processor niye 1 sathe kaj kra
    // 2. multithreading


    // extends Thread class
    // implement runnable interface
}

interface P{
    int x = 10;
   void func1();
   void func2();
   default void func3(){
       System.out.println(" function 3 from interface");
   }

}
class Bangladesh implements P{

    @Override
    public void func1() {
        System.out.println("func1");
    }

    @Override
    public void func2() {
        System.out.println("func2");
    }

    @Override
    public void func3(){
        System.out.println("func 3 from class");
    }

    public static void main(String[] args) {
        Bangladesh b = new Bangladesh();
        b.func1();
        b.func2();
        b.func3();
    }
}


class M extends Thread{
    public static void tata(){

        System.out.println("TATA from M");
    }
    public void f1(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("THread Name: " + Thread.currentThread().getName());

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        }

    }

    @Override
    public void run(){
        f1();
    }

}
class N extends Thread{
    public void funcN(){

        System.out.println("Thread Name: " + Thread.currentThread().getName() + "\nID : " + Thread.currentThread().getId());
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
    @Override
    public void run(){


       funcN();
    }
}
class Tata{
    public static void main(String[] args) {
        M t1 = new M();
        N t3 = new N();
        t3.start();

/*        t1.setPriority(1);
        t3.setPriority(10);

        t1.setName("MMMMMM");
        t3.setName("NNNNNN");

        t1.start();
        t3.start();
        M.tata();*/




    }
}

class Rabitry implements Runnable{

    @Override
    public void run() {
        System.out.println("thread is running");
    }


}
class TATA{
    public static void main(String[] args) {
        Rabitry rabitry = new Rabitry();
        Thread t1 = new Thread(rabitry);
        t1.start();
    }
}

