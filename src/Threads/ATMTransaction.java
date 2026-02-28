package Threads;

public class ATMTransaction extends Thread {
    public void run() {
        System.out.println("Processing ATM Transaction");
    }

    public static void main(String[] args) {
        ATMTransaction ob = new ATMTransaction();
        System.out.println("Thread State: " + ob.getState());
        ob.start();
        System.out.println("Thread state after start: " + ob.getState());
    }
}


