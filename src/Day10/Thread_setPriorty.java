package Day10;
/**
 * �߳����ȼ�
 * 
 * �̶߳��̵߳��ȵĹ����ǲ��ɿصģ���:
 * �߳�ֻ�ܱ�������CPUʱ�䣬������������ȡ����
 * 
 * �̵߳��Ȼᾡ���ܵĽ�CPUʱ�����ļ����������ȡ�����
 * ����̲߳������У������ܱ�֤һ���߳�һ��������������
 * 
 * ����ͨ�������̵߳����ȼ����Ʒ���CPUʱ�伸��
 * �������߳����ȼ�Խ�ߵ��̣߳���ȡCPUʱ��Ĵ����Ͷ�
 * 
 * �̵߳����ȼ���10�����ֱ�������1-10��ʾ
 * ����1��ͣ�5Ĭ�ϣ�10���
 * @author �������ؼ
 *
 */
public class Thread_setPriorty {
		public static void main(String[] args) {
				Thread  max=new Thread(){
						public void run(){
								for (int i = 0; i < 10000; i++) {
										System.out.println("max");
								}
						}
				};
				Thread  nor=new Thread(){
					public void run(){
							for (int i = 0; i < 10000; i++) {
									System.out.println("nor");
							}
					}
			};
			Thread  min=new Thread(){
				public void run(){
						for (int i = 0; i < 10000; i++) {
								System.out.println("min");
						}
				}
		};
		
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		
		min.start();
		nor.start();
		max.start();
		}
}















