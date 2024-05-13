import java.util.Scanner;

public class addfor_repeated_add {
   
    public static void main(String []args){
        int i,sum=0;
       Scanner add= new Scanner(System.in);{
            System.out.println("Enter the limit of the repeated addition");
            int n = add.nextInt();
            for (i=1;i<=n;i++ ){
                sum=sum+i;
              
            }  System.out.println(""+sum);
     add.close();
        }
    }
}


