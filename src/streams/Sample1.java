package streams;

public class Sample1 {

    public static void main(String[] args) throws Exception{
        System.out.println("hello world");
        System.err.println("Error!!!");

        int a=  System.in.read();
        System.out.println(a);

    }
}
