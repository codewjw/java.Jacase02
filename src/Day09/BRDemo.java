package Day09;

import java.beans.beancontext.BeanContext;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.ioBufferedReader
 * �����ַ������������԰��ж�ȡ�ַ���
 * 
 * @author �������ؼ
 *
 */
public class BRDemo {
		public static void main(String[] args) throws IOException {
				FileInputStream fis
						=new FileInputStream(
								"src"+File.separator+
								"day09"+File.separator+
								"BRDemo.java");
				
				InputStreamReader isr
						=new InputStreamReader(fis);
				
				BufferedReader br
						=new BufferedReader(isr);
				
				/**
				 * String readLine()
				 * �÷�����������ȡ�����ַ���ֱ����ȡ�����з�
				 * Ϊֹ��Ȼ�󽫻��з�֮ǰ�������ַ���һ���ַ���
				 * ����ʽ���ء���Ҫע�⣬���ص��ַ����в��������
				 * ���з���������ֵΪNULL����˵���޷�ͨ��������
				 * ��ȡ��������(���ڶ��ļ����ԣ�����null��ʾ��ȡ��
				 * �ļ�ĩβ)
				 * 
				 */
				
				String line=null;
				while((line=br.readLine())!=null){
						System.out.println(line);
				}
				
				br.close();
				
				
				
				
				
				
				
				
				
				
		}
}
