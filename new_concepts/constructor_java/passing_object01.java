package constructor_java;

public class passing_object01 {
    //argument uses class name (passing_object02),
    //and a name for the instance (which is B) that has been passed as an argument  object (c)
    void display(passing_object02 c){
        c.display();
    
    }
}/*when this method "dispaly()" is called by "passing_object03" it starts by,
   printing the method "display()" in "passing_object02"
   by taking  instance of "passing_object02" "B" as the arguments */
