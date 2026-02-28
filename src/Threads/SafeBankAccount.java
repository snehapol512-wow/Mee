package Threads;

public class SafeBankAccount {
        int balance = 1000;
        void withdraw(int amount){
            balance -= amount;
        }

        public static void main(String[] args) throws InterruptedException {
            Threads.BankAccount acc = new Threads.BankAccount();
            Thread t1 = new Thread(() -> acc.withdraw(500));
            Thread t2 = new Thread(() -> acc.withdraw(500));
            t1.start();
            t2.start();
            //t1.join();
            //t2.join();
            System.out.println("Final Balance: " +  acc.balance);
        }
    }
/*
Code Explanation :
👉The synchronized keyword ensures that only one thread can execute the withdraw() operation at a
time, preventing race condition and ensuring correct balance deduction.
*PTR*
📌Synchronization avoids race condition
📌Lacks critical section in an application
📌Slower but style
📌Essential for shared resources
 */

