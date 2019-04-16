import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {

    private Socket client;

    public MyClient(String address, int port) {
        try {
            client = new Socket(address, port);
            System.out.println("Client started!");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter data to be sent: ");
            String data = sc.nextLine();

            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            out.writeUTF(data);
            System.out.println("Data sent!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        MyClient client = new MyClient("localhost", 12345);
    }
}
