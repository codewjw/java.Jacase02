package Day10;
/**
 * �߳��ṩ��һ����̬����
 * static Thread currentThread()
 * �÷������Ի�ȡ���е�ǰ�������߳�
 * @author �������ؼ
 *
 */
public class Thread_currentThread {
		public static void main(String[] args) {
				Thread t=Thread.currentThread();
				System.out.println("����main�������̣߳�"+t);
				
				dosome();
				
				Thread mt=new Thread(){
					public void run(){
						Thread t=Thread.currentThread();
						System.out.println("�����Զ�����̣߳�"+t);
						dosome();
					}
				};
				mt.start();
			
			
		}
		public static void dosome() {
				Thread t=Thread.currentThread();
				System.out.println("����dosome�������̣߳�"+t);
			
		}
}
	


