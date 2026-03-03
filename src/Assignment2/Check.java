package Assignment2;
import java.io.*;
public class Check {
    public static void main(String[] args){
        // Unchecked
        try { int[] a = new int[2]; a[5] = 1; }
        catch(ArrayIndexOutOfBoundsException e){ System.out.println("Unchecked: " + e.getMessage()); }

        // Checked
        try { new FileReader("nofile.txt"); }
        catch(FileNotFoundException e){ System.out.println("Checked: " + e.getMessage()); }
    }
}
