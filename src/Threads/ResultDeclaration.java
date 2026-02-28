package Threads;

public class ResultDeclaration {
    synchronized void declareResult() throws Exception {
        System.out.println("Waiting for approval.....!");
        wait();
        System.out.println("Result Declared");
    }
    synchronized void approved(){
        notify();
    }

    public static void main(String[] args) throws InterruptedException{
        ResultDeclaration rd = new ResultDeclaration();
        new Thread(()-> {
            try {
                rd.declareResult();
            } catch (Exception e){}
        }).start();
        Thread.sleep(5000);
        new Thread(() ->
            rd.approved()).start();

    }
}
/* Here,The declareResult() method waits until another thread calls notify().
During wait(), the thread releases the lock, allowing other threads to enter the synchronized code.
✨PTR :
👉sleep() -> time based
👉wait() -> condition based
👉wait() -> releases lock -> by checking the notify() method
👉wait() -> is used in their inter-threaded communication
✅Order-Placed -> Preparing -> Prepared -> Delivery -> Delivered
 */
