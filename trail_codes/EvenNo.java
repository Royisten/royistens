package trail_codes;
import java.util.Scanner;

public class EvenNo {
    public static void main (String []args){
        Scanner Even = new Scanner(System.in);
        int i;
        System.out.println("enter the limit till which the Even no should be printed");
        int limit= Even.nextInt();
        for(i =2; i<=limit;i++){
            if (i % 2 == 0) {
                System.out.println("\n" +i);
            }Even.close();
}   
}
}
