package Day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * ��
 * ����������д���ݵ�
 * �����ݷ����Ϊ�������������
 * �����������������"��ȡ"���ݵ�������
 * ������������������е�����"д��"������
 * 
 * java.io.InputStream
 * �����ֽ�ʻ�����ĸ��࣬��һ�������࣬��������ص�
 * ��ȡ����
 * 
 * java.io.OutputStream
 * �����ֽ�������ĸ��࣬��һ�������࣬��������ص�
 * д������
 * 
 * ���ַ�Ϊ��
 * �ڵ���(�ͼ���):��дһ�����ڽڵ������ڵ�������ʽ����
 * ��д���ݵ���
 * 
 * ������(�߼���):���ܶ������ڣ���Ҫ������������������
 * ʹ�����ǿ��Լ򻯶�дʹ���Ƶĸ��Ӵ���
 * 
 * 
 * 
 * java.io.FileOutputStream
 * �ļ���������̳���OutputStream���������ļ���д��
 * ����������һ���ͼ���
 * @author �������ؼ
 *
 */
public class FOSDemo {
		public static void main(String[] args) throws IOException {
			
			/**
			 * Ĭ�ϴ����ļ���ʱ����дģʽ����:
			 * ���ļ������ָ��ļ��Ѿ����ڣ���ô���Ƚ��ļ�
			 * �������������
			 * 
			 * FileOutputStream�ṩ����һ�๹�췽�����÷���
			 * Ҫ����ڶ�����������һ��booleanֵ������ֵ
			 * Ϊtrue����׷��дģʽ����:
			 * �����ļ����ڣ����ļ�����ȫ������������ͨ����
			 * д������ݶ��ᱻ׷�����ļ�ĩβ
			 */
			
				FileOutputStream fos
						=new FileOutputStream("fos.xtx",true);
				
				String  str="���ں���ְҵ����ѧԺ��������";
				byte[] data = str.getBytes("UTF-8");
				fos.write(data);
				
				str="���ں���ְҵ����ѧԺ��������";
				data = str.getBytes("UTF-8");
				fos.write(data);
			
				System.out.println("���");
				fos.close();
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	

}














