package trail_codes;
import java.util.Scanner;

public class primeNO {
    public static void main (String[]args){
    Scanner value = new Scanner(System.in);
    int i, divisor = 0;
    System.out.println("Enter a Prime no ");
    // Check if the next input is an integer
    if (value.hasNextInt())
    {
        int no = value.nextInt();
        // Check for prime by trying to divide the number by all numbers from 2 to no/2
        for (i=2;i<= no/2;i++)
        {
            // If no is divisible by i, set divisor to 1 and exit the loop
            if (no%i==0)
            {
            divisor=1;
            break;    
            }
        }
        // Use the ternary operator to print "prime" if divisor is still 0, 
        //indicating that no factors were found, otherwise print "not prime"
        System.out.println(divisor==0 ? "prime" : "not prime");
    }else
    {
        System.out.println("invalid input");    
    }
        value.close();
}
}
