package Day10;
/**
 * �߳����첽���е�
 * �첽:��ִ�и��ģ���������
 * ͬ��:���Ⱥ�˳���ִ��
 * 
 * ��Щҵ����Ҫ�ö���̼߳�ͬ�����У���ʱ����Խ���
 * �̵߳�join���������
 * 
 * join ��������һ���سǽ�������״̬��ֱ����ȴ�����һ��
 * �̹߳����������ټ�������
 * @author �������ؼ
 *
 */
public class Thread_join {
		//��ʾͼƬ�Ƿ��������
		public static boolean isfinish=false;
		public static void main(String[] args) {
				final Thread download=new Thread(){
						public void run(){
								System.out.println("��ʼ����ͼƬ");
								for (int i = 0; i <=100; i++) {
										System.out.println("down:"+i+"%");
										try {
											Thread.sleep(50);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
								}
								System.out.println("ͼƬ�������");
								isfinish=true;
						}
				};
				
				Thread show=new Thread(){
						public void run(){
								System.out.println("show:��ʼ��ʾͼƬ������");
								
								/**
								 * �ȵȴ������߳̽�ͼƬ������ϡ��ڼ���
								 */
								
								try {
									download.join();
								} catch (InterruptedException e) {
										e.printStackTrace();
								}
								
								if (!isfinish) {
										throw new RuntimeException("ͼƬ����ʧ��");
								}
								System.out.println("show:��ʾͼƬ���");
						}
				};
				
				
				
				download.start();
				show.start();
		}
}
