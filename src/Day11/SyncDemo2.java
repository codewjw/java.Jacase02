package Day11;
/**
 * ��Ч��Сͬ����Χ�����ڱ�֤������ȫ��ǰ�������
 * ����ִ��Ч��
 * ʹ��ͬ������Ը�׼ȷ��������Ҫͬ���Ĵ���Ƭ�Σ�������
 * ��һ�������������������������Ч����Сͬ����Χ
 * @author �������ؼ
 *
 */
public class SyncDemo2 {
		public static void main(String[] args) {
				final Shop shop=new Shop();
				Thread t1=new Thread(){
						public void run(){
								shop.buy();
						}
				};
				Thread t2=new Thread(){
					public void run(){
							shop.buy();
						}
				};
				t1.start();
				t2.start();
		}
}

class Shop{
		public  void buy(){
				try {
					Thread t=Thread.currentThread();
					System.out.println(t.getName()+"������ѡ�·�������");
					Thread.sleep(5000);
					
					/**
					 * ͬ����
					 * synchronized(ͬ��������){
					 * 			��Ҫͬ���Ĵ���Ƭ��
					 * }
					 * 
					 * ͬ����������java���κ�һ�����ʵ�����ɣ�����
					 * ���뱣֤�ö������߳̿�������"ͬһ��"�ſ���
					 */
					
					synchronized (this) {
						System.out.println(t.getName()+"�������·�������");
						Thread.sleep(5000);
						
					}
					
					System.out.println(t.getName()+"�����뿪��");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
}




