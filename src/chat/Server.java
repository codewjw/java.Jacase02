package chat;

import java.util.ArrayList;
import java.util.List;

import Day09.PWDemo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �����ҷ����
 * @author �������ؼ
 *
 */
public class Server {
		/**
		 * import java.net.ServerSocket;
		 * ������ServerSocket��Ҫ����������
		 * 1.�������˿�
		 * 2.��������˿ڣ�һ��һ���ͻ���ͨ���ö˿ڽ���
		 * 		���ӣ��򴴽�һ��Socket������ÿͻ���ͨѶ
		 */
		private ServerSocket server;
		
		/**
		 * �ü�������������пͻ��˵�����������ڽ���Ϣ
		 * �㲥�����пͻ���
		 */
		private List<PrintWriter> allout;
		
		public Server() throws IOException{
			
			/**
			 * ��ʼ��ServerSocket��ͬʱ��Ҫָ�������ǿ�
			 * �ö˿ںŲ�����ϵͳ����Ӧ�ó���������Ķ˿�
			 * ���ظ���������׳��쳣
			 */
			
				server =new ServerSocket(8088);
				
				allout=new ArrayList<PrintWriter>();
				
		}
		
		public void start(){
			
				try {
					
					/**
					 * ServerSocket�ṩ�ķ���:
					 * Socket accept()
					 * �÷��������ServerSocket����ķ���˿�
					 * ������һ������������ֱ��һ���ͻ���ͨ��
					 * �ö˿����ӲŻ᷵��һ��Socket���������
					 * ��Socket�����������ӵĿͻ��˽���ͨѶ��
					 * 
					 */
					
					while(true){
						System.out.println("�ȴ��ͻ������ӡ�����");
						Socket socket= server.accept();
						System.out.println("һ���ͻ��������ˣ�");
						
						/**
						 * ����һ���߳���ÿͻ��˽���
						 */
						
						ClientHandler handler
								=new ClientHandler(socket);
						
						Thread t=new Thread(handler);
						t.start();
					}
					
				} catch (Exception e) {
					
						e.printStackTrace();
						
				}
				
		}
		
		/**
		 * ����������Ϣ�㲥���пͻ���
		 * @param message
		 */
		
		private void sendMessage(String message){
			synchronized (allout) {
				//ת�������пͻ���
				for (PrintWriter o : allout) {
						o.println(message);
				}
		}
		}
		
		public static void main(String[] args) {
				try {
						Server server=new Server();
						server.start();
				} catch (Exception e) {
						e.printStackTrace();
						
				}
		}
		
		/**
		 * ���߳����������ָ���ͻ��˽����Ĺ���
		 * @author �������ؼ
		 *
		 */
		private class ClientHandler implements Runnable{
				/**
				 * ��ǰ�߳�ͨ�����Socket��ָ���ͻ��˽���
				 */
				private Socket socket;
				
				/**
				 * Զ�̼������ַ��Ϣ�������ǿͻ��˵�ַ
				 */
				
				private String host;
				
				public ClientHandler(Socket socket){
						this.socket=socket;
						
						/**
						 * ͨ��Soscket���Ի�ȡԶ�˼������ַ��Ϣ
						 */
						
						InetAddress address
								=socket.getInetAddress();
						
						/**
						 * ��ȡԶ�˼����IP��ַ���ַ�����ʽ
						 */
						host=address.getHostAddress();
						
				}
				
				
				public void run(){
						PrintWriter pw=null;
						try {
							
							/**
							 * InputStream  getInputStream()
							 * Socket�ṩ�ĸ÷������Ի�ȡһ����������
							 * ͨ���ÿͻ���ȡ��Զ�˼�������͹���
							 * ������
							 */
							
							InputStream in = socket.getInputStream();
							
							InputStreamReader isr
									=new InputStreamReader(in,"UTF-8");
							
							BufferedReader br
									=new BufferedReader(isr); 
							
							/**
							 * ͨ��Socket��ȡ����������ڽ����ݷ���
							 * ���ͻ���
							 */
							
							OutputStream out = socket.getOutputStream();
							
							OutputStreamWriter osw
									=new OutputStreamWriter(out,"UTF-8");
							
							 pw=new PrintWriter(osw,true);
							
							/**
							 * ���ÿͻ��˵���������뵽��������
							 * 
							 * ���ڶ���̶߳�����øü��ϵ�add����������
							 * ��������������Ϊ�˱�֤�̰߳�ȫ�����Խ�
							 * �ü��ϼ�����
							 */
							synchronized (allout) {
								allout.add(pw);
							}
							
							sendMessage(host+"������,��ǰ����"+allout.size()+"��");
							
							String  message=null;
							
							while((message=br.readLine())!=null){
								
									System.out.println(host+"˵:"+message);
								
								//�ظ�����ǰ�ͻ���

									pw.println(host+"˵:"+message);
								
									sendMessage(host+"˵:"+message);
							}
							
						} catch (Exception e) {
									
						}finally {
								//����ͻ��˶Ͽ������Ժ�Ĺ���
							
								synchronized (allout) {
									//���ÿͻ��˵�������ӹ�������ɾ��
									
									allout.remove(pw);
									
								}
								
								sendMessage(host+"������,��ǰ����"+allout.size()+"��");
								
								if(socket!=null){
										try {
								
											socket.close();
										
										} catch (IOException e) {
										
											e.printStackTrace(); 
										
										}
									
								}
						}
				}
			
		}
		
		
		
		
		
		
		
}
