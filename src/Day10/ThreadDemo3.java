package Day10;
/**
 * ʹ�������ڲ�����������ַ�ʽ���̴߳���
 * @author �������ؼ
 *
 */
public class ThreadDemo3 {
		public static void main(String[] args) {
				Thread t1=new Thread(){
						public void run(){
								for (int i = 0; i < 1000; i++) {
										System.out.println("����˭����");
								}
						}
				};
				Thread t2 =new Thread(){
						public void run(){
								for (int i = 0; i < 1000; i++) {
										System.out.println("��ˮ���");
								}
							
						}
				};
				
				t1.start();
				t2.start();
				
				
				
				
		}
}
