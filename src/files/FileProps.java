package files;

import java.io.File;

public class FileProps {
    public static void main(String[] args) throws Exception {
        File file=new File("E://file1.txt");
        if (!file.exists())
            file.createNewFile();

        System.out.println("file name:" + file.getName());
        System.out.println("can write:" + file.canWrite());
        System.out.println("can read:" + file.canRead());


    }
}
