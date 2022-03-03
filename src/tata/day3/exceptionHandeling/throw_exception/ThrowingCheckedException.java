package exceptionHandeling.throw_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowingCheckedException {
    public void tata() throws FileNotFoundException {
        FileReader filer =new FileReader("C:\\\\Users\\\\bosuni\\\\Desktop\\\\abc.txt");
        BufferedReader fileInput = new BufferedReader(filer);

        throw new FileNotFoundException();
    }


}

/*
        The above code throw an unchecked exception. Similarly,
        we can also throw unchecked and user defined exceptions.
        Note: If we throw unchecked exception from a method,
        it is must to handle the exception or declare in throws clause.

        If we throw a checked exception using throw keyword, it is must to handle
        the exception using catch block or the method must declare it using throws
         declaration.
         Note: Every subclass of Error and RuntimeException is an unchecked exception in Java.
          A checked exception is everything else under the Throwable class.

*/
