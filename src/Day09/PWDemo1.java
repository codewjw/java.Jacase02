package Day09;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * �����ַ���
 * �����ַ�����һ�Ը߼������ص��ǿ��԰��ж�д�ַ���
 * java.io.BufferedWriter:�����ַ������
 * java.io.BufferedReader:�����ַ�������
 * 
 * 
 * java.io.PrintWriter
 * ���û����ַ���������ڲ�ʹ��BufferedWriter��Ϊ
 * �仺�幦�ܣ�PW����������Ŷ���Ǹ�ˢ�£����Գ��������
 * 
 * @author �������ؼ
 *
 */
public class PWDemo1 {
		public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
				/**
				 *  java.io.PrintWriter�ṩ�ɽ϶�Ĺ��췽��
				 *  ���Է��㴴����
				 *  ����������ֱ������ļ������ַ���������
				 *  ���췽��:
				 *  PrintWriter(String path)
				 *  PrintWriter(File file)
				 *  
				 *  ��ϣ������ָ�����ַ���д���ַ�������ô��������
				 *  ����ļ�д�������Ĺ��췽����֧�ֵڶ�������
				 *  �ò���Ϊ�ַ���������ָ���ַ���������
				 *  
				 */
//			PrintWriter pw=new PrintWriter("pw.txt");
			
			
				PrintWriter pw=new PrintWriter("pw.txt","UTF-8");
				
				pw.println("��������ݳ��������Ӷ�����");
				pw.println("�����");
				
				System.out.println("д�����");
				pw.close();
				
				
			
			
			
			
			
			
			
			
			
		}
}












