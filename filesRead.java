import java.io.*;
import java.util.*;
public class filesRead{
    public static void main(String[] args) throws IOException {
        long len;
        File new1= new File("Readme.txt");
        len = new1.length();
        System.out.println(len);
        BufferedReader bf= new BufferedReader(new  FileReader(new1));
        String line=bf.readLine();
       
        
        System.out.println(line.toUpperCase());
        
        bf.close();

    }
}