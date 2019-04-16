import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    private ServerSocket server;
    public MyServer(int port) {
        try {
            server = new ServerSocket(port);
            System.out.println("Server started!");
    
            System.out.println("Listening to port " + port);
            Socket socket = server.accept();
    
            DataInputStream in = new DataInputStream(socket.getInputStream());
            String data = in.readUTF();
            System.out.println("Received: \n" + data);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        MyServer server = new MyServer(12345);
    }
}
