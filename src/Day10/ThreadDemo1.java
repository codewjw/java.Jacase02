package Day10;
/**
 * �߳�
 * �߳���������ִ�ж�δ��룬�й�����"ͬʱ����"��ʵ����
 * �����̶߳�������ͣͣ�ģ�����ִ�������Ϊ������
 * 
 * �߳������ֳ��õĴ�����ʽ
 * ��ʽһ��
 * �̳�Thread����дrun������run�������������嵱ǰ�߳�
 * Ҫִ�е��������
 * 
 * 
 * @author �������ؼ
 *
 */
public class ThreadDemo1 {
		public static void main(String[] args) {
				Thread t1=new MyThread1();
				Thread t2=new MyThread2();
				
				/**
				 * �����߳�Ҫ����start����������run����
				 * ��start����������Ϻ�run������ܿ�ı�
				 * �Զ�ִ��
				 */
				
				t1.start();
				t2.start();
		}
}
/**
 * �̳��߳���дrun������������������������
 * 1:����java�ǵ��̳У���͵��¼̳���Thread�Ͳ��ܼ̳�
 * ������
 * 2:������дrun�������̵߳������������̵߳��У����
 * �����̵߳������Ա�úܲ�߳�������Ӧ�б�Ȼ��
 * ��Ϲ�ϵ
 * 
 * @author �������ؼ
 *
 */
class MyThread1 extends Thread{
		public void run(){
			for (int i = 0; i < 1000; i++) {
				System.out.println("����˭");
		}
		}
	
}
class MyThread2 extends Thread{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println("��ˮ��");
	}
	}

}





















