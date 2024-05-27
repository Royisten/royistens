package multi_threading_in_java;
/*in this method  implemets Runnable interface
and uses the method run* , in which we intentionally slow 
down the task by giving it a 1000 milliseconds timer by using
the "sleep" method ,
this class will be used to show multi threading works,
by witnessing the time it takes to run
*/
public class sampleThread_interface implements Runnable {
    public void run(){
        for (int i = 0; i <=10; i++) 
        {
            System.out.println("Thread Count"+i );
            /*and to use thred.sleep we need to
            surrond it by "try" block 
            */
            try 
            {
            Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
            e.printStackTrace();
            }
            
        }
    }
}
