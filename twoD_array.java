import java.util.Scanner;

public class twoD_array {
    public static void main (String []args){
        Scanner Two=new Scanner(System.in);
        //creates an arraya with two dimensions , with the size setted up as [3][3]
        int Num[][]= new int [3][3];
        System.out.println("Enter the values for 3*3 array");
        //nested loop to read the values for the both the dimensions
        for (int i = 0; i < Num.length; i++) {
            for (int j = 0; j < Num.length; j++) {
                //reads the values for both the dimension and stores it into a single 2d array Num[i][j]**
                Num[i][j]=Two.nextInt();
                
            } 
        }
        System.out.println("The values given for the 3*3 array is");
        //nested loop to print the values for the array**
        for (int i = 0; i < Num.length; i++) {
            //("\t") for to print in the next line (row by row )
            System.out.println("\t");
            for (int j = 0; j < Num.length; j++) {
                //prints the value and seperate with spaces
                System.out.print("\t"+Num[i][j]);
            }
        }
        //("\n") nest line print
        System.out.println("\n");
    Two.close();
    }
    
}
