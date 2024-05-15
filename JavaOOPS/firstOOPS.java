package JavaOOPS;

public class FIRSTOOPS {
    public static void main(String oopssample[]){
        SAMPLE_FIRSTOOPS s1= new SAMPLE_FIRSTOOPS();
        SAMPLE_FIRSTOOPS s2 = new SAMPLE_FIRSTOOPS();
         s1.a=12;
         s1.b=25;
         s2.a=68;
         s2.b=57;
        System.out.print("first object for tha sample class : "+s1.a +" , "+ s1.b);
        System.out.println(" ");
        System.out.print("Second object for tha sample class : "+s2.a +" , "+ s2.b +"\n");
        s1.displayB();
        s2.displayA();
        s2.calculatesum();
        s2.Printsum();
    }

    
}
