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
        System.out.println("\nPrinting the test scanned by the camera :  \n");
        System.out.println(nottest);
    }
    //this method initiates the scanning process
    sample(){
       
        testScanner trailobj = new testScanner(this);
        //calling the method scan() in testscanner
        trailobj.scan();
    }@SuppressWarnings("unused")
    public static void main (String exampleabstract[]){
        //using the constructor we can initiate the staring process which is (scan();)
        sample s = new sample();
   
           
    }
}
/*
 * refer 100k coding challenge part 9 in youtube 
 */


 /*                                                             Step-by-Step Explanation
                                                             -------------------------------

                            1. Creating a sample Object:
                                  CODE :            sample s = new sample();

                          explaination :            This line of code creates a new instance of the sample class. We refer to this instance as "s".


                            2. Inside the sample Constructor:
                                  CODE :             sample() {
                                                     // Creates an instance of testScanner, passing the current sample instance (this) to its constructor.
                                                     testScanner trailobj = new testScanner(this);
                                                     // Calls the scan method on the testScanner instance.
                                                     trailobj.scan();
                                                    }
                                                      
                          EXPLAINATION :             this: Inside the sample constructor, this refers to the instance s of sample that is being created.
                                                     Creating testScanner Instance: testScanner trailobj = new testScanner(this);
                                                     Passes the current sample instance (this, which is s) to the testScanner constructor.
                                                     Calling scan Method: trailobj.scan();
                                                     Calls the scan method on the testScanner instance trailobj.





                            2. Inside the testScanner Constructor:


                                CODE :              public testScanner(hello objnull) {
                                                    // Assigns the passed hello instance (actually the sample instance) to the instance variable obj.
                                                    this.obj = objnull;
                                                    }


                         EXPLAINATION :             Parameter objnull: This is the sample instance s passed to the constructor.
                                                    Assignment: this.obj = objnull;
                                                    Assigns the sample instance s to the instance variable obj of the testScanner object (trailobj).




                            3. Inside the scan Method:


                                CODE :              void scan() {
                                                    String test = "Trail scanned test";
                                                    // Calls the ontest method on the hello instance stored in obj (which is actually the sample instance).
                                                    obj.ontest(test);
                                                    }


                         EXPLAINATION :             obj: Refers to the sample instance s stored in the testScanner instance trailobj.
                                                    Calling ontest: obj.ontest(test);
                                                    Calls the ontest method on the sample instance s.







                                                        Detailed Flow with Explanation
                                                              ----------------------------------  
                                
                                                1. Creating a sample Object:
                                                           sample s = new sample(); creates a new instance of sample (referred to as s).

                                                2. Inside sample Constructor:
                                                            testScanner trailobj = new testScanner(this); creates a new testScanner object (trailobj),
                                                            passing the sample instance s (referred to as this) to the testScanner constructor.
                                                            trailobj.scan(); calls the scan method on the trailobj instance.

                                                3. Inside testScanner Constructor:
                                                            public testScanner(hello objnull) is called with objnull being the sample instance s.
                                                            this.obj = objnull; assigns the sample instance s to the instance variable obj in the testScanner instance (trailobj).

                                                4. Inside scan Method:
                                                            String test = "Trail scanned test"; defines a string test.
                                                            obj.ontest(test); calls the ontest method on the sample instance s stored in obj.
                                                            Since sample extends hello and implements ontest, the method ontest in sample is executed.


                                                                        Summary
                                                                      ------------

                                                * Creating sample Instance: sample s = new sample(); creates the sample instance s.
                                                * Inside sample Constructor:
                                                    - new testScanner(this) passes the sample instance s to the testScanner constructor.
                                                    - trailobj.scan(); calls the scan method on the trailobj instance.
                                                * Inside testScanner Constructor:
                                                    - this.obj = objnull; assigns the sample instance s to the obj variable.
                                                * Inside scan Method:
                                                    - obj.ontest(test); calls the ontest method on the sample instance s.
                                                * By passing the sample instance (this) to the testScanner constructor,
                                                the testScanner instance (trailobj) can call the ontest method on the sample instance (s) through its obj variable,
                                                leveraging the inheritance and polymorphism provided by the abstract class hello. */