package Day10;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ӱ���
 * 
 * ÿ���ڿ���̨���һ�ε�ǰϵͳʱ��
 * ��ʽ��:17��18��22
 * 
 * @author �������ؼ
 *
 */
public class Test {
		public static void main(String[] args) {
				SimpleDateFormat sdf
						=new SimpleDateFormat("HH:mm:ss");
				while(true){
						System.out.println(sdf.format(new Date()));
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					
				}
		}
}
