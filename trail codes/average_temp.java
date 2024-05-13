import java.util.Scanner;

public class average_temp {
    public static void main( String[]arguments){
        Scanner value =new Scanner(System.in);
        System.out.println("Enter the values to add \n");
        System.out.println("\nfirst value\n");
        int first = value.nextInt();
        System.out.println("\nSecond value\n");
        int Second = value. nextInt();
        System.out.println("\nthird value\n");
        int Third = value. nextInt();
        double result = (first + Second + Third)/3;
        System.out.println("\nresult is ="+result); 

        int temp;
        temp=first;
        first=Second ;
        Second=Third;
        Third=temp;
        System.out.println("Swapped values\n"  +first +Second + Third);
        

        value.close();
    }
}
