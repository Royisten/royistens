 package exception_handleing;

import java.util.Scanner;

public class zero_exceptiion {
    @SuppressWarnings ("unused")
  
     public static void main (String zerodiv[]){
       
        Scanner z = new Scanner(System.in);
        System.out.print("Enter the numenator: ");
        int numenator = z.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = z.nextInt();
        float Result = DividedAnswer(numenator,denominator);
        System.out.println("the Result is "+Result);
        z.close();
     }
     public static int DividedAnswer(int numenator , int denominator){
        int answer=0;
        try {
            answer= (numenator/denominator);
        } catch (ArithmeticException e) {
            System.out.println("How dare u ........Exception Detected : "+e.getMessage());
        }finally{
            System.out.println("------------");
        }
      return answer;
     }
 }
/*

In Java, when you perform arithmetic operations, 
certain illegal operations automatically throw specific exceptions. 
Division by zero is one such illegal operation that throws an ArithmeticException.

Here's what's happening behind the scenes:

Division Operation: 
When you attempt to divide by zero, 
Java's runtime system detects this illegal operation.

Throwing the Exception: 
The runtime system then creates an instance of ArithmeticException and throws it. 
This is a built-in behavior in Java.

Understanding catch (ArithmeticException e)
The catch block is designed to catch exceptions of a specific type. 
In this case, 
it's looking for ArithmeticException.

When ArithmeticException is thrown, 
the catch block catches it.
The variable e is assigned the caught exception object, 
which contains information about the exception.

Using getMessage()
The getMessage() method is part of the Throwable class, 
which is the superclass for all exceptions in Java. 
This method returns a detailed message about the exception.

ArithmeticException inherits from Throwable, 
so it also has the getMessage() method.
When an ArithmeticException is thrown due to division by zero, 
its message is set to "/ by zero".

*/

