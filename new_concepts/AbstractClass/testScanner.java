package AbstractClass;
// conside this class as a set of code from a part of a library for using a :  Test scanner 
public class testScanner {
    hello obj;
    public testScanner(hello objnull){
        //this creates a reference which helps to call the instance of (hello) named (obj)
        //which is  globally defined as "objnull" 
        this.obj=objnull;
    }
    void scan(){
        /* this is showcase on how abstract are used : 
                  
         * Consider this method "scan" as a function that has lot of code using libaraies created by the developers*
         * 
         * this whole method is how the testscanner* works and put the "value" which is scanned*
         * 
         * where the code is used to scan a "test" from a ccamera lense and the "test which is scanned" is 
         * then put out to the below code which is using a abstract method from class "hello"
        */
        String test = "Trail scanned test";
        //here "obj" is used as a global object which has been made possible using "this"
     obj.ontest(test);
    }
}
