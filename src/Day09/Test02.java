package Day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PrintWriter;

/**
 * ��������������ݰ���д���ļ�
 * @author �������ؼ
 *
 */
public class Test02 {
		public static void main(String[] args) throws IOException {
				BufferedReader br
						=new BufferedReader(
								new InputStreamReader(
										System.in
								)
				);
				
				PrintWriter pw
						=new PrintWriter("note.txt");
				
				System.out.println("�뿪ʼ��������");
				
				String line=null;
				
				while((line=br.readLine())!=null){
						if("exit".equals(line)){
								break;
							
						}
						pw.println(line);
				}
				
				System.out.println("�ټ�");
				
				pw.close();
				
				
				
				
				
				
				
		}
}
