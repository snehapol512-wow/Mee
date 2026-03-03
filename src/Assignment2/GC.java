package Assignment2;

public class GC {
    public static void main(String[] args){
        GC obj = new GC();
        obj = null;
        System.gc();
        System.out.println("GC requested");
    }
    protected void finalize(){ System.out.println("Object garbage collected"); }
}
