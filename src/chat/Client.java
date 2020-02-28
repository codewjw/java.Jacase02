package chat;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/***
 * 聊天室系统
 */
public class Client {
		/**
		 * java.net.Socket
		 * 封装了TCP通讯协议，使用他与远程计算机进行
		 * 网络通讯
		 */
		private Socket socket;
		/**
		 * 构造方法，用来初始化客户端
		 * @throws IOException 
		 * @throws UnknownHostException 
		 */
		public Client() throws UnknownHostException, IOException{
			/**
			 * 实例化Socket是需要传入两个参数
			 * 1.服务端ip地址
			 * 2.服务端端口
			 * 通过IP地址可以找到网络上的服务端所在的计算机
			 * 通过端口可以连接到该计算机上的服务端应用程序
			 * 
			 * 实例化Socket的过程就是建立连接的过程，所以若
			 * 链接服务端失败，这里就会抛出异常
			 */
			
				BufferedReader br=new BufferedReader(
						new InputStreamReader(
								new FileInputStream("src/chat/config.txt")
						)
				);

				
				String host=br.readLine();
				
				int port=Integer.parseInt(br.readLine());
			
				System.out.println("正在与服务端建立连接。。。");
				socket =new Socket(host , port);
				System.out.println("与服务端链接成功！");
		}
		/**
		 * 客户端的启动方法，从这里开始执行客户端逻辑
		 */
		public void start(){
				try {
						Scanner scanner=new Scanner(System.in);
						OutputStream out= socket.getOutputStream();
						
						OutputStreamWriter osw
								=new OutputStreamWriter(out,"UTF-8");
						
						PrintWriter pw
								=new PrintWriter(osw,true);
						
						//启动读取服务端发送过来消息的线程
						ServerHandler handler
								=new ServerHandler();
						
						Thread t=new Thread(handler);
						
						t.start();
						
						String line=null;
						
						System.out.println("开始聊天吧！");
						
						long time=System.currentTimeMillis();
						
						while(true){
							
								line=scanner.nextLine();
								
								long curr=System.currentTimeMillis();
								if (curr-time>2000) {
									pw.println(line);
									time=curr;
								}else {
									System.out.println("说话速度太快");
								}
								
								
								
						}
						
				} catch (Exception e) {
						e.printStackTrace();
				}
		}
		
		public static void main(String[] args) {
				try {
					
						Client client=new Client();
						
						client.start();
						
				} catch (Exception e) {
						e.printStackTrace();
						
						System.out.println("客户端启动失败");
						
				}
		}
		
		/**
		 * 该线程用来循环接收服务端发送过来的消息并输出到
		 * 客户端自己的控制台上
		 */
		private class ServerHandler implements Runnable{
				@Override
				public void run(){
						try {
								
								InputStream in = socket.getInputStream();
								
								InputStreamReader isr
										=new InputStreamReader(in,"UTF-8");
								
								BufferedReader br
										=new BufferedReader(isr);
								
								String message=null;
								
								while ((message=br.readLine())!=null) {
									
										System.out.println(message);
										
								}
							
						} catch (Exception e) {

							e.printStackTrace();
							System.out.println("服务端关闭连接！！！");
						}
					
				}
				
			
		}
		
		
		
		
		
}
