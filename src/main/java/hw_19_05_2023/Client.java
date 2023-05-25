package hw_19_05_2023;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        System.out.println("Starting client...");
        try {
            Socket socket = new Socket("localhost", 8189);
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            Scanner in = new Scanner(socket.getInputStream());
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String s = scanner.nextLine();
                out.println(s);
                out.flush();
                if (s.equals("end")) {
                    break;
                }
                String message = in.nextLine();
                System.out.println("Massage from server: " + message);
            }
            scanner.close();
            in.close();
            out.close();
            socket.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Client ended run");
    }
}
