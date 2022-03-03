package exceptionHandeling.exception_propagation;

import java.io.IOException;

class TestExceptionPropagation1{
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }

}
/*class TestExceptionPropagation2{
    void m() throws IOException {
        throw new java.io.IOException("device error");//checked exception//Compile Time Error
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handeled");}
    }

}*/

class M1{
    void method()throws IOException{
        throw new IOException("device error");
    }
}
class M2{
    void method()throws IOException{
        System.out.println("device operation performed");
    }
}
class M3{
    void method()throws IOException{
        throw new IOException("device error");
    }
}

public class ExceptionPropagation {
    public static void main(String[] args) throws IOException {//declare exception
//        TestExceptionPropagation1 test1 = new TestExceptionPropagation1();
//        test1.p();
//        System.out.println("normal flow...");

     /*   TestExceptionPropagation2 test2 = new  TestExceptionPropagation2();
        test2.p();
        System.out.println("normal flow");*/

      /*  try{
            M1 m=new M1();
            m.method();
        }catch(Exception e){System.out.println("exception handled");}

        System.out.println("normal flow...");*/

 /*       M2 m = new M2();
        m.method();
        System.out.println("normal flow...");*/

        M3 m=new M3();
        m.method();
        System.out.println("normal flow...");

    }
}




     /*
        //Java Exception Propagation
        An exception is first thrown from the top of the stack and if it is not caught,
        it drops down the call stack to the previous method. If not caught there,
        the exception again drops down to the previous method,
        and so on until they are caught or until they reach the
        very bottom of the call stack. This is called exception propagation.

        Note: By default Unchecked Exceptions are forwarded in calling chain (propagated)
        Note: By default, Checked Exceptions are not forwarded in calling chain (propagated).

        Exception can be handled in any method in call stack either in the main()
        method, p() method, n() method or m() method.
        */
