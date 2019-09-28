import java.io.*;
import java.util.*;
public class directories{
    public static void main(String[] args)throws IOException {
        File folder = new File("Desktop/'java problems 3'");
File[] listOfFiles = folder.listFiles();

for (int i = 0; i < listOfFiles.length; i++) {
  if (listOfFiles[i].isFile()) {
    System.out.println("File " + listOfFiles[i].getName());
    }else if (listOfFiles[i].isDirectory()) {
        System.out.println("Directory " + listOfFiles[i].getName());
      }
}
    }
}