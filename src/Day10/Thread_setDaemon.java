package Day10;
/**
 * �ػ��̣߳��ֳ�Ϊ:��̨�߳�
 * ʹ������ǰ̨�̲߳������������߳�Ĭ�ϴ�����������
 * ǰ̨�̣߳����Ϊ�ػ��߳���Ҫ��������
 * 
 * ���ǽ���ʱ������һ�㲻ͬ:
 * �����̽���ʱ�������������е��ػ��̶߳��ᱻǿ�ƽ���
 * ��һ������������ǰ̨�߳̽��������̾ͻ����
 * @author �������ؼ
 *
 */
public class Thread_setDaemon {
		public static void main(String[] args) {
				/**
				 * rose:ǰ̨�߳�
				 */
				Thread rose=new Thread(){
						public void run(){
								for (int i = 0; i < 5; i++) {
										System.out.println("rose:let me go");
										try {
											Thread.sleep(1000);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
								}
								System.out.println("rose: ������");
								System.out.println("��Ч: ��ͨ");
						}
				};
				Thread jack=new Thread(){
						public void run(){
								while(true){
										System.out.println("jack:you jump!i jump");
										try {
											Thread.sleep(1000);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
								}
						}
				};
				
				rose.start();
				
				//�����ػ��̱߳������߳�����ǰ����
				jack.setDaemon(true);
				jack.start();
				
//				System.out.println("mian����������");
				
		}
}









