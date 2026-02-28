package InnerClass;

public class BankAccount {
    private double balance = 10000;
    //Member inner class
    class Transaction{
        void withdraw(double amount){
            if(amount <= balance) {
                balance -= amount;
                System.out.println("Withdraw: " + amount);
            }else{
                System.out.println("Insufficient Funds");

            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        BankAccount.Transaction tx = account.new Transaction();
        tx.withdraw(3000);
        tx.withdraw(2000);
        System.out.println(account.balance);
    }
}
/*
💡PTR💡
👉Transaction belongs to specific account
👉Direct access to private variable balance
👉Clean encapsulation
 */
