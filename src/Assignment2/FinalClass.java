package Assignment2;

public class FinalClass {
    final int x = 10;
    final void show(){ System.out.println("Final method, x = " + x); }
}
class demo {
    public static void main(String[] args){
        FinalClass obj = new FinalClass();
        obj.show();
    }
}
