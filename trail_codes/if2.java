package trail_codes;
import java.util.Scanner;
public class if2 {
    
    public static void main (String []args){
        Scanner value = new Scanner(System.in);
        System.out.println("Enter a value between 1-100");
        
        if (value.hasNextInt()) {
            int no= value.nextInt();
            if (no>100 ) {
            System.out.println("value is more than 100");
            }else if (no <1) {
                System.out.println("value is less than 1");

            } else  {
                System.out.println("So u listened....");
                
            } 
        
    }else{
        System.out.println("Dumb bitc");
    }
    value.close();

    }
}

