package polymorphism;

public class s_test extends s_test01 {
    int a;
    int v=56;
    void display(){
        int b=66;
        System.out.println(b);
        System.out.println(a);
    }
    /* here we are using "super" keyword to show that we can call the method 
       "display()" of "s_test01" which has a identical method in "s_test".
       in this case normally the method in the base class "s_test01" gets ignored and it prints 
       method in the sub class "s_test" , since we used "super" keyword , we can overide it even if its has identical method names. 
    */
    void show(){
        a=501;// directly assign value to "a".
        super.a=105;// assign value to "a" in "s_test01", instead of assigning value to "a" in "s_test"
        super.display();// print the method in "s_test01", along with "a" that has newly assigned value "105". 
        display();// prints the method in "s_test",along with "a" that has newly assigned value "501"
        System.out.println(v);// "v" in "s-test"
        System.out.println(super.v); //"v" in "s_test01"
        
        
    }
    public static void main (String pleasework[]){
        s_test test = new s_test();
        test.show();
    }
}
