package multi_threading_in_java;

public class hello {
    public static void main(String threadtesting[]){

        // creating instances for each classes

        sampleThread hi = new sampleThread();
        hi.start();
        sampleThread bye = new sampleThread();
        bye.start();
        sampleThread why = new sampleThread();
        why.start();
        sampleThread hi1= new sampleThread();
        hi1.start();
        sampleThread bye2= new sampleThread();
        bye2.start();
        sampleThread why2 = new sampleThread();
        why2.start();
        
        // creating instances for each classes

        sampleThread_interface hi01 = new sampleThread_interface();
        Thread hiThread = new Thread(hi01);
        hiThread.start();
        sampleThread_interface hi02 = new sampleThread_interface();
        Thread hi2Thread = new Thread(hi02);
        hi2Thread.start();
        sampleThread_interface hi03 = new sampleThread_interface();
        Thread hi3Thread = new Thread(hi03);
        hi3Thread.start();
        sampleThread_interface hi04 = new sampleThread_interface();
        Thread hi4Thread = new Thread(hi04);
        hi4Thread.start();
    }
}
/* this task should have taken 60 seconds but it will be 
 * executed in 10 seconds
 * this what we call multithreading ,
 * it's when the task is many task is running at the 
 * same time and the order it runs is decided by the OS of the system
 */