package hw_19_05_2023;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {
    private final int serverPort;
    public static List<ClientHandler> clients = new ArrayList<>();

    public Server(int port) {
        serverPort = port;
        ServerSocket server = null;
        Socket s = null;

        try {
            server = new ServerSocket(8189);
            System.out.println("Server run");
            while (true) {
                //Как только клиент подключился, создаем сокет (соединение)
                s = server.accept();
                System.out.println("Client connected");

                //В отдельном потоке запускаем обработчик этого клиента
                ClientHandler clientHandler = new ClientHandler(s);
                clients.add(clientHandler);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                server.close();
                System.out.println("Server closed");
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}