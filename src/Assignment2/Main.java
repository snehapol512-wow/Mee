package Assignment2;

interface Payment { void pay(); }
class CreditCardPayment implements Payment {
    public void pay(){ System.out.println("Paid via Credit Card"); }
}
class UPIPayment implements Payment {
    public void pay(){ System.out.println("Paid via UPI"); }
}
public class Main {
    public static void main(String[] args){
        Payment p1=new CreditCardPayment(), p2=new UPIPayment();
        p1.pay(); p2.pay();
    }
}