package Threads;

public class SleepEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Printing 0-9:");
        for (int i =0; i<10; i++) {
            System.out.println("Printed: " + i);
            Thread.sleep(5000);
        }
        System.out.println("Done");

        }
    }
//👉Here, the thread is paused for a fixed duration of time
//👉The thread does not lack anything and resumes after the given time.
