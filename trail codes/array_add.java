import java.util.Scanner;
//refer (positive_input_array_important) for more info
public class array_add {
    public static void main(String[]args){
    Scanner aradd=new Scanner(System.in);
    //intialising & declaring sum = 0*
    // intial & declare size*  
     int size,sum=0;
     System.out.println("Enter the size of the array");
     //reading size* and storing the user given input into size*
     size=aradd.nextInt();
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
        if (aradd.hasNextInt())
        //(if loop) for to check if the user given input (positive values)*  is an integer*
        // or it will not execute the rest of the code
        {
            int input=aradd.nextInt();
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
                    aradd.nextInt();
                }
        
     }
     System.out.println("Sum of array =");
     // adding the total sum of array using for loop*
     for (int i = 0; i < size; i++) {
        sum=sum+numA[i];
        }
        System.out.println(sum);

    aradd.close();
    }
}
