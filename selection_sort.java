import java.util.Scanner;

public class selection_sort {
    public static void main(String[]args){
        Scanner sort = new Scanner(System.in);
        //declare size &temp 
        int Size,Temp;
        System.out.println("Enter the size of array  ");
        Size=sort.nextInt();
        //intailise numA[] array and setting its limit as (Size) given by the user 
        int numA[]= new int [Size];
       
        System.out.println("Enter the values for array ");
        //Reading the values entered by the user and storing it into the array (numA[]) by using (for loop)
        for (int i = 0; i < Size; i++) {
            numA[i]= sort.nextInt();
            
        }
       
        System.out.println(" array sorted in Accending ");
        // using nested loop ('i' and 'j' for loop) to rearrange the array in accending order 
        for (int i = 0; i < Size; i++) {
            for (int j = i+1; j < Size-1; j++) {
                //(if loop) if the already given array is not in accendinhg  position 
                //using temp* for swapping the values in order 
                if (numA[i]>numA[j]) {
                    Temp=numA[i];
                    numA[i]=numA[j];
                    numA[j]=Temp;  
                }
                //printing the sorted array
            }System.out.println("\t"+ numA[i]);
            
        }
       


    sort.close();
    }
}
