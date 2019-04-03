import java.net.*;

public class NetworkingDemo {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Localhost Address : " + address.getHostAddress());
            address = InetAddress.getByName("www.printopark.com");
            System.out.println("Print-O-Park : " + address);
            // InetAddress website[] = InetAddress.getAllByName("www.google.com");
            // for (InetAddress link : website) {
            //     System.out.println("Google : " + link);
            // }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
