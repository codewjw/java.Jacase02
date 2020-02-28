package Day11;
/**
 * ������
 * ��synchronized���ζ�β�ͬ���룬������������ͬʱ
 * ��Щ������л����ԣ���:����̲߳���ͬʱִ����Щ
 * ����
 * 
 * 
 * @author �������ؼ
 *
 */
public class SyncDemo4 {
		public static void main(String[] args) {
				final Boo boo=new Boo();
				
				Thread t1=new Thread(){
						public void run(){
								boo.methodA();
							
						}
						
				};
				
				Thread t2=new Thread(){
					public void run(){
							boo.methodB();
						
					}
					
			};
			
			t1.start();
			t2.start();
				
				
				
		}
}
class Boo{
		public synchronized void methodA(){
				Thread t=Thread.currentThread();
				System.out.println(t.getName()+":����ִ��A����");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(t.getName()+":ִ��A�������");
				
		}
		public synchronized void methodB(){
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+":����ִ��B����");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(t.getName()+":ִ��B�������");
			
		
	}
}