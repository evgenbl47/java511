package tcp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class TcpClient {

    private static final String MESSAGE = "Hello, World!";
    public static void main(String[] args) throws IOException {

        System.out.println("Connect to server...");
        try (Socket socket = new Socket("127.0.0.1", 27015)){
            System.out.println("Connect success");

            PrintWriter printWriter = new PrintWriter(
                    socket.getOutputStream(),
                    true
            );

            printWriter.println(MESSAGE);
            System.out.println("Message sent");

        }
    }
}

//hampus naeselius - mirage
