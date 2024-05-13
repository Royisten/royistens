package trail_codes;
import java.util.Scanner;

public class star {
    public static void main(String []args){
Scanner star=new Scanner(System.in);
System.out.println("let us lit up the sky");
int n;
if (star.hasNextInt()) 

{ n=star.nextInt();
    for (int i = 1; i <=n ; i++) {
        for (int j = 0; j < i; j++) {
            // Print stars horizontally on the same line using "print();",
            // Instead of "println();"
            System.out.print("*");
        } 
        // Move to the next line after printing each line of stars
        // So that the stars couldbe printed horizontally
        System.out.println();
    }
}else
{
System.out.println("please enter an interger ");
}
star.close();
}    
}
