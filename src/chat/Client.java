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
 * ������ϵͳ
 */
public class Client {
		/**
		 * java.net.Socket
		 * ��װ��TCPͨѶЭ�飬ʹ������Զ�̼��������
		 * ����ͨѶ
		 */
		private Socket socket;
		/**
		 * ���췽����������ʼ���ͻ���
		 * @throws IOException 
		 * @throws UnknownHostException 
		 */
		public Client() throws UnknownHostException, IOException{
			/**
			 * ʵ����Socket����Ҫ������������
			 * 1.�����ip��ַ
			 * 2.����˶˿�
			 * ͨ��IP��ַ�����ҵ������ϵķ�������ڵļ����
			 * ͨ���˿ڿ������ӵ��ü�����ϵķ����Ӧ�ó���
			 * 
			 * ʵ����Socket�Ĺ��̾��ǽ������ӵĹ��̣�������
			 * ���ӷ����ʧ�ܣ�����ͻ��׳��쳣
			 */
			
				BufferedReader br=new BufferedReader(
						new InputStreamReader(
								new FileInputStream("src/chat/config.txt")
						)
				);

				
				String host=br.readLine();
				
				int port=Integer.parseInt(br.readLine());
			
				System.out.println("���������˽������ӡ�����");
				socket =new Socket(host , port);
				System.out.println("���������ӳɹ���");
		}
		/**
		 * �ͻ��˵����������������￪ʼִ�пͻ����߼�
		 */
		public void start(){
				try {
						Scanner scanner=new Scanner(System.in);
						OutputStream out= socket.getOutputStream();
						
						OutputStreamWriter osw
								=new OutputStreamWriter(out,"UTF-8");
						
						PrintWriter pw
								=new PrintWriter(osw,true);
						
						//������ȡ����˷��͹�����Ϣ���߳�
						ServerHandler handler
								=new ServerHandler();
						
						Thread t=new Thread(handler);
						
						t.start();
						
						String line=null;
						
						System.out.println("��ʼ����ɣ�");
						
						long time=System.currentTimeMillis();
						
						while(true){
							
								line=scanner.nextLine();
								
								long curr=System.currentTimeMillis();
								if (curr-time>2000) {
									pw.println(line);
									time=curr;
								}else {
									System.out.println("˵���ٶ�̫��");
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
						
						System.out.println("�ͻ�������ʧ��");
						
				}
		}
		
		/**
		 * ���߳�����ѭ�����շ���˷��͹�������Ϣ�������
		 * �ͻ����Լ��Ŀ���̨��
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
							System.out.println("����˹ر����ӣ�����");
						}
					
				}
				
			
		}
		
		
		
		
		
}
