package files;

import java.io.FileReader;

public class FileRead {
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("E://file1.txt");
        int a= 0;
        while ((a=fr.read())!=-1){
            System.out.print((char)a);
        }

        
    }
}
