package Day11;
/**
 * ��̬����ʹ��sybcgronized���κ󣬸÷���һ������ͬ��
 * Ч��
 * 
 * ��̬����ͬ��������������󣬼�Class��ʵ��
 * JVM�ڼ���ÿһ�����ʱ�򣬶���ʵ����һ��Class��ʵ��
 * ���ڱ�ʾ����࣬����ÿ��������ֻ��һ��Class��ʵ��
 * ��̬�������ľ������ʵ��
 * 
 * @author �������ؼ
 *
 */
public class SyncDemo3 {
		public static void main(String[] args) {
				Thread t1=new Thread(){
						public void run(){
								Foo.sodme();
						}
				};
				Thread t2=new Thread(){
					public void run(){
							Foo.sodme();
					}
			};
			t1.start();
			t2.start();
		}
}

class Foo{
		public synchronized static void sodme(){
				Thread t=Thread.currentThread();
				System.out.println(t.getName()+":��������dosme");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(t.getName()+":����dosme���");
				
				
				
				
				
			
		}
	
}




