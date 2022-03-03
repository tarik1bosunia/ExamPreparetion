package JavaThread.SmartProgrmming;

//performing single task from single thread
//performing single task from multiple thread
//performing multiple task from single thread///it is not good
//performing multiple task from multiple thread

class Pstfst  extends Thread{
    public void run(){
        System.out.println("Thread task");
    }
}
class Multi extends Thread{
    @Override
    public void run() {
        System.out.println("Multiple task");
    }
}



public class Thread_4 {
    public static void main(String[] args) {
        Pstfst t1 = new Pstfst();
        t1.start();

        Pstfst t2 = new Pstfst();
        t2.start();

        Multi t3 = new Multi();
        t3.start();
    }

}
