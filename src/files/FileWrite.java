package files;

import java.io.FileWriter;

public class FileWrite {
    public static void main(String[] args) throws Exception{
        FileWriter fw=new FileWriter("E://file1.txt");
        fw.write("amir rahimi nejad 123");
        fw.close();
    }
}
