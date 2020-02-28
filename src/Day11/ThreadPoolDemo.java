package Day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 	�̳߳�
 * �̳߳�ͨ������
 * 1.�����߳�����
 * 2.�����߳�
 * 
 * @author �������ؼ
 *
 */
public class ThreadPoolDemo {
		public static void main(String[] args) {
				ExecutorService threadPool
						=Executors.newFixedThreadPool(2);
				
				for(int i=0;i<5;i++){
						Runnable runn=new Runnable() {
							public void run() {
									Thread t=Thread.currentThread();
									System.out.println(t.getName()+":����ִ������");
									try {
										Thread.sleep(5000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									System.out.println(t.getName()+":ִ���������");
							}
						};
						threadPool.execute(runn);
						System.out.println("������"+i+"ָ�ɸ��̳߳�");
				}
				//ֹͣ�̳߳�   shutdownNow()����ͣ
				threadPool.shutdownNow();
				System.out.println("ֹͣ���̳߳�");
				 
		} 
}















