package Day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PrintWriter;

/**
 * 将键盘输入的内容按行写入文件
 * @author 逐忆成书丶
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
				
				System.out.println("请开始输入内容");
				
				String line=null;
				
				while((line=br.readLine())!=null){
						if("exit".equals(line)){
								break;
							
						}
						pw.println(line);
				}
				
				System.out.println("再见");
				
				pw.close();
				
				
				
				
				
				
				
		}
}
