package OutputSt;

import java.io.FileOutputStream;
import java.io.OutputStream;
//Write a Java program to write content in a file using
//OutputStream.
public class OutputFileAccess {
    public static void main(String[] args) {
        String data = "hello world!!\n " + "we are peace lover\n" + "sorry for that";
        try{
            OutputStream out = new FileOutputStream("src/OutputSt/out.txt");
            byte[] dataBytes = data.getBytes();
            out.write(dataBytes);
            System.out.println("Data is  written to get file .");
            out.close();
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
