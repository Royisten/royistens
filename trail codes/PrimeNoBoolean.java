import java.util.Scanner;

public class PrimeNoBoolean {
    // Function to check if a number is prime
    public static boolean isPrime(int no){
        // If number is less than or equal to 1, it's not prime
        if (no <=1)
            {
            return false;
            }
            int i;
            // Check divisibility from 2 to no/2
            for ( i=2 ; i <= no/2;i++)
            {
            // If divisible, it's not prime
            if (no%i==0)
            {
            return false;
            }
            }
            // If not divisible by any number, it's prime
            return true;
    }

    public static void main (String []args){
        Scanner bool =new Scanner(System.in);
        System.out.println("enter a positive int");

        // Check if input is an integer
        if (bool.hasNextInt())
        { 
        int no = bool.nextInt();
        // Check if the input number is prime
        if (isPrime(no))
        {
        System.out.println("prime");
        }else
        {
        System.out.println("not prime");
        }
        }else
        {
        System.out.println("invalid input");
        }
        bool.close();
    }
}
