package InnerClass;

public interface Payment {
    void pay();
}
class PaymentDemo{
    public static void main(String[] args) {
        //BoilerPlate Code
        Payment p = new Payment() {
            @Override
            public void pay() {
                System.out.println("Payment done using Credit Card");
            }
        };
        p.pay();
        // SCALA - Java 8 (Streams, Annotations, Lambda, Reflections)
        Payment p1 = () -> System.out.println("Cash Payment");
        p1.pay();
    }
}
/*
🟢PTR🟢
👉One time implementation
👉No need to create separate class
👉It is used in events and callback functions
 */
