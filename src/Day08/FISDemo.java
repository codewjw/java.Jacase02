package Day08;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * java.io.FileInputStream
 * �ļ�������
 * ���ڴ��ļ��ж�ȡ����
 * @author �������ؼ
 *
 */
public class FISDemo {
		public static void main(String[] args) throws IOException {
			FileInputStream fis
					=new FileInputStream("fos.txt");
			
			byte[] data=new byte[100];
			int len=fis.read(data);
			
			String str=new String(data, 0, len,"UTF-8");
			System.out.println(str);
			
			fis.close();
			
			
			
			
			
		}
	
	
	
	
	
	

}
