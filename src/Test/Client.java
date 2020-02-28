package Test;

import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args){
        String serverName=args[0];
        int port=Integer.parseInt(args[1]);
        try {
            System.out.printf("连接到主机："+serverName+"端口："+port);
            Socket clients=new Socket(serverName,port);
            System.out.printf("远程连接主机："+clients.getRemoteSocketAddress());
            OutputStream os= clients.getOutputStream();
            DataOutputStream out=new DataOutputStream(os);

            out.writeUTF("Hello"+clients.getLocalAddress());
            InputStream infrom = clients.getInputStream();
            DataInputStream in =new DataInputStream(infrom);
            System.out.printf("服务器响应："+in.readUTF());

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }


}
