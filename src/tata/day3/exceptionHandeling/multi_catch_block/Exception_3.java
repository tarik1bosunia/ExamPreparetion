package exceptionHandeling.multi_catch_block;

public class Exception_3 {
    public void test1(){
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
    public void test_2(){
        try{
            int a[]=new int[5];

            System.out.println(a[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
    public void test_3(){
        try{
            String s=null;
            System.out.println(s.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
   /*
   //this is a compile_time_error
   public void test_4(){
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(Exception e){System.out.println("common task completed");}
        catch(ArithmeticException e){System.out.println("task1 is completed");}
        catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}
        System.out.println("rest of the code...");
    }*/

  /*  Let's consider the following example. Here the try block within nested try block (inner try block 2)
      do not handle the exception. The control is then transferred to its parent try block (inner try block 1).
      If it does not handle the exception,then the control is transferred to the main try block (outer try block)
      where the appropriate catch block handles the exception. It is termed as nesting.*/

    public void nested_try_catch(){
        // outer (main) try block
        try {
            //inner try block 1
            try {
                // inner try block 2
                try {
                    int arr[] = { 1, 2, 3, 4 };
                    //printing the array element out of its bounds
                    System.out.println(arr[10]);
                }
                // to handles ArithmeticException
                catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception");
                    System.out.println(" inner try block 2");
                }
            }
            // to handle ArithmeticException
            catch (ArithmeticException e) {
                System.out.println("Arithmetic exception");
                System.out.println("inner try block 1");
            }
        }
        // to handle ArrayIndexOutOfBoundsException
         catch (ArrayIndexOutOfBoundsException e4) {
            System.out.print(e4);
            System.out.println(" outer (main) try block");
        }
        catch (Exception e5) {
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }

}


  /*
        //Java Multi-catch block
        A try block can be followed by one or more catch blocks. Each catch block
        must contain a different exception handler. So, if you have to perform different tasks
        at the occurrence of different exceptions, use java multi-catch block.

        Points to remember
        At a time only one exception occurs and at a time only one catch block is executed.
        All catch blocks must be ordered from most specific to most general,
        i.e. catch for ArithmeticException must come before catch for Exception.
 */

