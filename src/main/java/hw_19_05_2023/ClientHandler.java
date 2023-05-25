package hw_19_05_2023;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler implements Runnable {
    private Socket s;
    private PrintWriter out;
    private Scanner in;
    private static int CLIENT_COUNT = 0;
    private String name;
    public ClientHandler(Socket s) {
        try {
            this.s = s;
            out = new PrintWriter(s.getOutputStream());
            in = new Scanner(s.getInputStream());
            CLIENT_COUNT++;
            name = "client №" + CLIENT_COUNT;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void run() {
        while (true) {
            if (in.hasNext()) {
                String w = in.nextLine();
                System.out.println(name + ": " + w + " - Thread name: " + Thread.currentThread().getName());
                //out.println("echo: " + w);
                //out.flush();
                if (w.equals("end")) {
                    break;
                }
                for (ClientHandler cl : Server.clients) {
                    cl.out.println(name + ": " + w);
                    cl.out.flush();
                }
            }
        }
        try {
            s.close();
            in.close();
            out.close();
            System.out.println("client disconnect");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
