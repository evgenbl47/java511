package tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(27015);

        Socket clientSocket = serverSocket.accept();
    }
}
