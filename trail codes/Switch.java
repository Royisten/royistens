import java.util.Scanner;

public class Switch {
    public static void main (String []args){
        Scanner value =new Scanner(System.in);
        System.out.println("Enter a digit for the day\n \t 1. monday \t 2. tueaday \t 3. wednesday");
        int day = value.nextInt();
        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            default:
            System.out.println("Invalid");

        }
      value.close();
    }
}
