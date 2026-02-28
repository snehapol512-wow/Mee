package Threads.Threads;
public class FestRegistration {
    static class FormFill extends Thread {
        public void run() {
            System.out.println("Form filling started");
        }
    }
    static class DocumentsUploads extends Thread{
        public void run(){
            System.out.println("Documents upload started");

        }
    }
    static class EmailNotification extends Thread{
        public void run(){
            System.out.println("confirmation Email Sent!");

        }

        public static void main(String[] args) {
            FormFill t1 = new FormFill();
            DocumentsUploads t2 = new DocumentsUploads();
            EmailNotification t3 = new EmailNotification();
            t1.run();
            t2.run();
            t3.run();
        }
    }
}
//PTR//
//