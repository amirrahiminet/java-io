package streams;

import java.io.FileOutputStream;

public class FileOutput {
    public static void main(String[] args) throws Exception {
        FileOutputStream fs=new FileOutputStream("E://file1.txt");
        String st="Amir Rahimi Nejad";
        fs.write(st.getBytes());
        fs.close();
    }
}
