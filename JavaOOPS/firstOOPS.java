package JavaOOPS;

public class FirstOOPS {
    int a=10;// Non-static field
    // int a cannot be assesed directly since its a non static , so we create am object for it 
    public static void main(String oopssample[]){
        FirstOOPS i=new FirstOOPS();// Create an instance(object) "i" of FirstOOPS
        System.out.println(i.a);// Access the non-static variable "a" through the instance(object)
        //creating objects for the class "SAMPLE_FIRSTOOPS.java" as "s1" & "s2".
        SAMPLECLASS s1= new SAMPLECLASS();
        SAMPLECLASS s2 = new SAMPLECLASS();
        //assign  distinct values to the 2 objects "s1" & "s2"   
         s1.a=12;
         s1.b=25;
         s2.a=68;
         s2.b=57;
         //printing values by calling the specific object 
        System.out.print("first object for tha sample class : "+s1.a +" , "+ s1.b);
        System.out.println(" ");
        System.out.print("Second object for tha sample class : "+s2.a +" , "+ s2.b +"\n");
        //calling function that exist in the class "SAMPLE_FIRSTOOPS.java"
        s1.displayB();
        s2.displayA();
        s2.calculatesum();
        s2.Printsum();
    }

    
}
