package Threads;

public class BankAccount {
    int balance = 1000;
     synchronized void withdraw(int amount){
        balance -= amount;
    }

    public static void main(String[] args) throws InterruptedException {
        BankAccount acc = new BankAccount();
        Thread t1 = new Thread(() -> acc.withdraw(500));
        Thread t2 = new Thread(() -> acc.withdraw(500));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Balance: " +  acc.balance);
    }
}
//*PTR*
/*👉Both the threads t1 and t2 access & modify the same balance variable simultaneously. Due to
lack of synchronization, the final balance becomes inconsistent.
📌Shared data causes issues
📌Execution order is unpredictable
📌Leads to data inconsistency
📌Need synchronization to solve the race condition
 */
