import java.net.*;

public class TCPS {
    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server waiting for client...");

        Socket socket = server.accept();

        System.out.println("Client connected: " + socket.getInetAddress());

        socket.close();
        server.close();
    }
}