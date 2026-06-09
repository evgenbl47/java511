package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {

        try(ServerSocket serverSocket = new ServerSocket(27015)) {
            System.out.println("Waiting connect...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connect success");

            System.out.println("Receive message...");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            clientSocket.getInputStream()
                    )
            );

            String receivedMessage = reader.readLine();
            System.out.println(receivedMessage);
        }
    }
}
