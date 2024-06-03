package FileWriter;

import java.io.FileWriter;
import java.io.Writer;
//Write a Java program to write content in a file using
//FileWriter.
public class FileWriterBCA {
    public static void main(String[] args) {
        String data = "hello  "+" sujan "+" lama";
        try{
            Writer output = new FileWriter("src/FileWriter/output.txt");
            output.write(data);
            System.out.println("Data is written to the file.");
            output.close();
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
