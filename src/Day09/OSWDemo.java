package Day09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * �ַ��������ַ�Ϊ��λ��д���ݵ����������ַ���ֻ��
 * ��д�ı�����
 * �ַ������ʻ��Ƕ�д�ֽ�
 * Reader:�ַ��������ĸ��࣬�����˶�ȡ����ط���
 * Writer:�ַ�������ĸ��࣬������д���ַ�����ط���
 * 
 * 
 * ת����:�ַ��������һ��ʵ����
 * java.io.OutputStreamWriter
 * java.io.InputStreamReader
 * 
 * ���ڴ󲿷ֵ��ַ�����ֻ���������ַ�������ֱ�Ӵ����ֽ�
 * �������ͼ������󲿷ֶ����ֽ�������͵�����Щ�ַ�����
 * ����ֱ�Ӵ�����Щ�ֽ����ģ�����Ҫ�õ�ISR��OSW��������
 * ��Ϊ���ǿ��Դ����ֽ����������������ַ��������Ծ�����
 * ����������������µ�����
 * @author �������ؼ
 *
 */
public class OSWDemo {
		public static void main(String[] args) throws IOException {
				FileOutputStream fos
						=new FileOutputStream("ows.txt");
//				OutputStreamWriter osw
//						=new OutputStreamWriter(fos);
				/**
				 * OSW ��֧�ֵڶ�����������һ���ַ���������ָ��
				 * �ַ�������ָ������ô����ʹ��OSWд�����ַ���
				 * ��ʹ�ø��ַ���ת��Ϊ�ֽ�
				 */
				
				OutputStreamWriter osw
						=new OutputStreamWriter(fos,"GBK");
				
				osw.write("�����ڳɶ��Ľ�ͷ��һ��");
				
				osw.write("֪�����еĵƶ�Ϩ����");
				
				System.out.println("д�����");
				osw.close();
			
			
			
			
			
			
		}
}






















