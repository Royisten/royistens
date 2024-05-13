import java.util.Scanner;

public class searchkey_ar {
        public static void main(String[]args){
    Scanner aradds=new Scanner(System.in);
    // intial & declare size* and searchkey* 
     int size,searchkey;
     System.out.println("Enter the size of the array");
     //reading size* and storing the user given input into size*
     size=aradds.nextInt();
     //declare & intial array (numA[]) and also setting its limit as size* given by the user 
     int numA[]= new int[size];
     System.out.println("enter "+size+" positive values");
     //Let the user give out the (positive) values for the array 
     int count=0;
     //declare count* and intial the value as 0*
     while (count<numA.length)
     //while loop condition* untill the value of count(0*) < num.length(size of array = given by the user*)
     //if the condition is satisfied , the code inside the the loop will run*
     {
        if (aradds.hasNextInt())
        //(if loop) for to check if the user given input (positive values)*  is an integer*
        // or it will not execute the rest of the code
        {
            int input=aradds.nextInt();
            // read the user given value as input* if it satisfy the (if loop)*
            if (input>=0)
            // (if loop) to check the input* is a positive value* (x>=0) : + x 
            {
                numA[count]=input;
                //read the input* and stores it into the numA[] array if its satisfy the (if loop)
                count++;
                // iterates the value of (count=0)* to (count+1)*
                // and repeat the While loop* (count(1)<num.length)....(2)(3)(4)
                }else{
                    System.out.println(" Enter Positive values");
                }
                }else{
                    System.out.println("Enter  integers");
                    aradds.nextInt();
                }
        
     }
     //prompt the user to give a value to search 
     System.out.println("Enter a value to search");
     //takes the value* given to the user and stored in searchkey*
     searchkey=aradds.nextInt();
     //boolean used to check if the condition is true or not
     // boolean is setas false
     boolean found= false;
     //(for loop)* to check if the user given value is there in the array*(numA)
     for (int i = 0; i < size; i++) {
        //(if loop)* to show the user the value is present 
        if (searchkey==numA[i]){
            System.out.println("value found at "+ (i+1) + " position.");
            found=true;
            break;
        }
    }
    //if the statement is found false then it is setted as value is not found* 
    if (found==false) {
        
        System.out.println("Value is not found");
    }
     aradds.close();
    }
}

