package Interface;
//we can import files across folders by just using "import" 
//and specific files by mentioning their name. 
import JavaOOPS.test;

public class sample implements hello{
 
    public void display() {
       System.out.println("hi, this is a interface implementation"); 
    }

 public static  void main (String i[]){
  sample s = new sample();
  s.display();
  @SuppressWarnings("unused")
  
  //using "test" class of javaOOPS by creating a instance of "test"
  test testinstance = new test();
}
}