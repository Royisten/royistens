package constructor_java;

public class passing_object03 {
    public static void main (String mainclass[]){
       
        passing_object01 A = new passing_object01();
        passing_object02 B = new passing_object02();
        A.display(B);// this argument goes directly to (passing_object01)
      
    }
}
/*
 * here we are passing the object "B" as the argument for "display()" in "passing_object01"
 */