package AbstractClass;
// consider this is the  code that is actually available to the work on 
public class sample extends hello{
    // lets conside  developers for the library will only asks us to inherit the class (hello) 
    // and there is a method in hello* called (ontest) which will automatically be called 
    // whenever the camera* recognises and scans the "test" 

    //this method only works if there is a "test" that is scanned by the camera*
    void ontest(String nottest) {
        // and the developers will only says to use the "nottest" to print the test* that has been scanned by
        // the camera  which is here "Trail scanned test"*.
        System.out.println("Printing the test scanned by the camera :  \n");
        System.out.println(nottest);
    }
    //this method initiates the scanning process
    sample(){
        //creating an instance of testscanner and using "this" keyword for passing the current object 
        //refer "passing_object01.java" in "constructor_java" for more understanding
        testScanner trailobj = new testScanner(this);
        //calling the method scan() in testscanner
        trailobj.scan();
    }
    public static void main (String exampleabstract[]){
        //using the constructor we can initiate the staring process which is (scan();)
        //sample s = new sample();     //remove(//) to run the code 
    }
}
