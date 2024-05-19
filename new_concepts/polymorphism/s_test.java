package polymorphism;

public class s_test extends s_test01 {
    int a=6;
    void display(){
        int b=66;
        System.out.println(b);
    }
    /* here we are using "super" keyword to show that we can call the method 
       "display()" of "s_test01" which has a identical method in "s_test".
       in this case normally the method in the base class "s_test01" gets ignored and it prints 
       method in the sub class "s_test" , since we used "super" keyword , we can overide it even if its has identical method names. 
    */
    void show(){
        super.display();// print the method in "s_test01"
        display();// prints the method in "s_test"
    }
    public static void main (String pleasework[]){
        s_test test = new s_test();
        test.show();
    }
}
