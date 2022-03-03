package exceptionHandeling.throw_exception;

class UserDefinedException extends Exception{
    public UserDefinedException(String str){
        super(str);
    }
}

public class ThrowingUserDefinedException{
   public void user_defined_exception(){

       try {
           throw new UserDefinedException("This is User-defined exception");
       } catch (UserDefinedException ude) {
           System.out.println("Caught the exception");
           System.out.println(ude.getMessage());
       }
   }
}

