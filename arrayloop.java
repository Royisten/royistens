import java.util.Scanner;

public class arrayloop {
    public static void main (String[]args){
        Scanner arloop= new Scanner(System.in);
        // Declaring a variable to store the limit of the array
        int limit;
        System.out.println("Enter the limit of the array");
        // Reading the limit inputted by the user
        limit= arloop.nextInt();
        // Creating an array of integers with the size provided by the user
        int numA[]= new int[limit];
        System.out.println("enter the values");
        // Checking if the user inputs an integer
        if (arloop.hasNextInt()) 
        {
        // Looping to read values for each index of the array
        for (int i = 0; i < limit; i++) 
        {
        // Reading values and storing them in the array    
        numA[i]=arloop.nextInt();
        }
        System.out.println("!!!displaying the values!!!");
        for (int i = 0; i < limit; i++) 
        {
        // Displaying each value with its index
        System.out.println("["+(i+1) +"] = "+ numA[i]);
        }   
        }else {
            System.out.println("invalid input");
        }
        arloop.close();
        
    }
}
