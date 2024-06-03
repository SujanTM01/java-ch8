package FileReader;

import java.io.FileReader;
import java.io.Reader;
//Write a Java program to read a file using FileReader and
//print the content of file in console.
public class FileReaderBCA {
    public static void main(String[] args) {
        char[] array = new char[40];
        try{
            Reader input = new FileReader("src/FileReader/input.txt");
            System.out.println("Is there is  the stream:"+input.ready());
            input.read(array);
            System.out.println("Data in the stream ");
            System.out.println(array);
            input.close();
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
