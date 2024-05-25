package Interface;

public class sample implements hello{
 
    public void display() {
       System.out.println("hi, this is a interface implementation"); 
    }

 public static  void main (String i[]){
  sample s = new sample();
  s.display();
}
}