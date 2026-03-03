package Assignment2;

public class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Thread using Runnable");
        }
    }

     class ThreadDemo2 {
        public static void main(String[] args) {
            Thread t = new Thread(new MyRunnable());
            t.start();
        }
    }

