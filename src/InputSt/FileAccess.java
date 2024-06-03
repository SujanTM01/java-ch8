package InputSt;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
//Write a Java program to read a file using InputStream and
//print the content of file in console.
public class FileAccess {
    public static void main(String[] args) {
        byte[] array = new byte[40];
        try {
            InputStream input = new FileInputStream("src\\InputSt\\input.txt");
            System.out.println("Available bytes in the file:" + input.available());
            input.read(array);
            String data = new String(array);
            System.out.println(data);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
