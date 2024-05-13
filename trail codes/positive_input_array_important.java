import java.util.Scanner;

public class positive_input_array_important {
    public static void main (String []args){
        Scanner posarr = new Scanner(System.in);
        int Size;  
        System.out.println("Enter the size of array");
        Size=posarr.nextInt();
        // Creating an array of integers of size 'limit'
        int numA[]= new int[Size];
        // Initializing a count variable to keep track of the number of elements added to the array
        int count= 0;
        System.out.println("Enter " + Size+ " positive values");
        // Loop to read user input and populate the array
        // by numA.length it means the size of the array like...
        // if the user enters limit as "5" then the numA.length = 5.
        while (count<numA.length) 
        {   
            // Checking if the input is an integer
            if (posarr.hasNextInt()) 
            {
            // Reading the integer input
            //  intialising and declaring the user given "positive values" as "input"
            int input = posarr.nextInt();
                
                // Checking if the input is positive or zero
                if (input>=0)   
                {
                
                // Adding the positive integer to the array
                // if the "input" is greater or equal to "0" (Positive*)
                // then the "positive value" is added to the "numA[]" array as "input"
                // starting from numA[0], ( count = 0 )*
                numA[count]=input;
                
                // Incrementing the count to move to the next index in the array
                // (count + 1 = 1),(2),(3).....repeat till it fulfill the While condition* (count<numA.length)
                count++;
                
                }else{
                    // Prompting the user to enter a positive value if a negative value is entered
                    System.out.println("Enter a positive value dumdum");
                
                } 
            }else{
                // Clearing the invalid input from the scanner buffer if a non-integer value is entered
                System.out.println(" Enter a value dumdum");
                posarr.nextInt();  
                //When the Scanner object encounters an input that cannot be interpreted as an integer,
                //such as a string or a floating-point number, it throws an InputMismatchException.
                //In this case, the program prints a message to the user indicating that they need to enter a valid integer, 
                //but it doesn't consume the (invalid input)** from the scanner buffer
                //If the invalid input is not consumed, the hasNextInt() method will continuously return false,causing an infinite loop***.
                //Therefore, posarr.nextInt(); is used to read and discard the invalid input from the scanner buffer, 
                //allowing the program to continue executing normally. This ensures that the program can handle subsequent inputs correctly. 
                }
        }
        // Displaying the values entered by the user
        System.out.println(".....Displaying the values!");
        for (int i = 0; i < Size; i++) 
        {
        System.out.println("["+(i+1)+"]"+ numA[i]);    
        }
        // Closing the Scanner object to prevent resource leak
        posarr.close();
    }
}

