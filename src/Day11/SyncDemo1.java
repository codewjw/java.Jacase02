package Day11;
/**
 * ���̲߳�����ȫ����
 * ������߳�ͬʱ����ͬ����Դʱ�������"��"�����
 * ���ڶ��߳��л�ʱ�����������ܵ��´���ִ��˳�����
 * ���ң��в��ڳ�����Ƶ�ִ��˳��������߼���������
 * ʱ���ܵ���ϵͳ̱��
 * 
 * @author �������ؼ
 *
 */
public class SyncDemo1 {
		public static void main(String[] args) {
				final Table table=new  Table();
				
				Thread t1=new Thread(){
						public void run() {
								while(true){
										int bean=table.getBean();
										//ģ���߳��л�
										Thread.yield();
										System.out.println(getName()+":"+bean);
								}
							
						}
				};
				Thread t2=new Thread(){
					public void run() {
							while(true){
									int bean=table.getBean();
									//ģ���߳��л�
									Thread.yield();
									System.out.println(getName()+":"+bean);
								}
						
						}
				};
				t1.start();
				t2.start();
		}
}

class  Table{
		private int beans=20;
		/**
		 * ��һ��������synchronized���κ󣬸÷�����Ϊ
		 * ͬ����������:����̲߳���ͬ��ִ�и÷�������
		 * 
		 * �ڷ�����ʹ��synchronized,��ô�����Ķ������
		 * �÷����������󣬼�:this
		 * @return
		 */
		public synchronized int getBean(){
				if (beans==0) {
						throw new RuntimeException("û�ж���");
				}
				//ģ���߳��л�
				Thread.yield();
				return beans--;
		}
}






