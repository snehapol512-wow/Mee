package Assignment2;

public class Var {
    static int count = 0;
    static void increment(){ count++; }
    public static void main(String[] args){
        increment(); increment(); increment();
        System.out.println("Count: " + count); // 3
    }
}
