public class continue_eg {
    public static void main (String []args){
        int  n = 10;
        for (int i = 1; i < n; i++) {
            System.out.println("hi");
            if (i==5) 
            {continue;}
            System.out.println("hello");
        }
        System.out.println("\nFinished");
    }
}


