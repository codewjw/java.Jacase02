package Test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread{
    private ServerSocket serverSocket;
    public Server(int port) throws IOException{
        serverSocket =new ServerSocket(port);
        serverSocket.setSoTimeout(1000);
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.printf("等待远程连接,端口号为："+serverSocket.getLocalPort()+"...");
                Socket server=serverSocket.accept();
                System.out.printf("远程主机地址："+server.getLocalSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.printf(in.readUTF());
                DataOutputStream out=new DataOutputStream(server.getOutputStream());
                out.writeUTF("感谢连接我："+server.getLocalSocketAddress()+"\nGoodBey!!!");
                server.close();

            }catch (Exception ex){
                System.out.printf("连接超时");
                break;
            }
        }
    }

    public static void main(String[] args){
        int port=Integer.parseInt(args[0]);
        try {
            Thread t= new Server(port);
            t.run();
        }catch (Exception ex){
            ex.getMessage();
        }
    }


}
