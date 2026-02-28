package exceptions;

import java.io.IOException;
// java.io.exception -> fully qualified class name //

public class CheckedException {
    static void readFile() throws IOException {
        throw new IOException("File not found");
    }
    public static void main(String[] args) {
        try {
            display();
        } catch (IOException e) {
            System.out.println(e.getMessage());//if you only want this part , you should write this one.
        }
    }
    static void display() throws IOException {
        readFile();
    }
}
