import java.io.*;

public class IOStreamsDemo {

    public static void main(String args[])  throws Exception {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
                System.out.print((char) c);
                Thread.sleep(30);
            }
        }
        catch(IOException e) {
            System.out.println(e);
        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
