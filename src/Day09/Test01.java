package Day09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * ���±�����
 * ʹ��PWӿ�����ӵ�i��ʽ����.Ȼ���û�ÿ����һ���ַ���
 * �Ͱ���д�뵽�ļ���
 * @author �������ؼ
 *
 */
public class Test01 {
		public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
				Scanner scanner=new Scanner(System.in);
				
				System.out.println("�������ļ���");
				String fileName=scanner.nextLine();
				
				FileOutputStream fos
						=new FileOutputStream(fileName);
				
				OutputStreamWriter osw
						=new OutputStreamWriter(fos,"UTF-8");
				
				/**
				 * ������PWʱ��һ������Ϊ����ʱ�򣬾�֧��һ��
				 * ���Դ���ڶ��������Ĺ��췽�����ò���Ϊboolean
				 * ֵ������ֵΪture��������Զ���ˢ�£���:
				 * ÿ���û�println����д��һ���ַ�����ͻ�
				 * �Զ�flush��
				 */
				
				PrintWriter pw
						=new PrintWriter(osw,true);
				
				System.out.println("�뿪ʼ��������");
				
				String line=null;
				
				while(true){
						line=scanner.nextLine();
						if("exit".equals(line)){
								break;
							
						}
						pw.println(line);
//						pw.flush();
					
				}
				System.out.println("�ټ�");
				pw.close();
				
		}
}









