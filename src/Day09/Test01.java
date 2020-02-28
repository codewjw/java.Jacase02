package Day09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 记事本功能
 * 使用PW涌流链接的i形式创建.然后用户每输入一行字符串
 * 就按行写入到文件中
 * @author 逐忆成书丶
 *
 */
public class Test01 {
		public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
				Scanner scanner=new Scanner(System.in);
				
				System.out.println("请输入文件名");
				String fileName=scanner.nextLine();
				
				FileOutputStream fos
						=new FileOutputStream(fileName);
				
				OutputStreamWriter osw
						=new OutputStreamWriter(fos,"UTF-8");
				
				/**
				 * 当创建PW时第一个参数为流的时候，就支持一个
				 * 可以传入第二个参数的构造方法，该参数为boolean
				 * 值，若该值为ture，则具有自定行刷新，即:
				 * 每当用户println方法写出一行字符串后就会
				 * 自动flush。
				 */
				
				PrintWriter pw
						=new PrintWriter(osw,true);
				
				System.out.println("请开始输入内容");
				
				String line=null;
				
				while(true){
						line=scanner.nextLine();
						if("exit".equals(line)){
								break;
							
						}
						pw.println(line);
//						pw.flush();
					
				}
				System.out.println("再见");
				pw.close();
				
		}
}









