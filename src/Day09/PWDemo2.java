package Day09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * PrintWriter���������г��ô�����ʽ�Լ��Զ���ˢ��
 * @author �������ؼ
 *
 */
public class PWDemo2 {
		public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
				/**
				 * PrintWriter(Writer writer)
				 * PrintWriter(OutputStream out)
				 * ���췽�����������ֽ���Ҳ�������ַ���
				 */
				
				FileOutputStream fos
						=new FileOutputStream("pw2.txt");
				
				/**
				 * ����Ҫ����ָ�����ַ���д���ַ�������Ҫ����
				 * ����ת������ָ���ַ���
				 */
				
				OutputStreamWriter osw
						=new OutputStreamWriter(fos, "UTF-8");
				
				PrintWriter pw	=new PrintWriter(osw);
			
				pw.println("���");
				pw.println("�Ǻ�");
				
				 System.out.println("д�����");
				 pw.close();
				
			
			
			
			
			
			
			
			
		}
}













