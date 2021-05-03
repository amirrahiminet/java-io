package streams;

import java.io.FileInputStream;

public class FileInput {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("E://file1.txt");
        int i=0;
        while ((i = fis.read())!=-1){
            System.out.print((char) i);
        }
    }
}
