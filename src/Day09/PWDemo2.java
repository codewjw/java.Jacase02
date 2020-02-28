package Day09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * PrintWriter在流链接中常用创建形式以及自动型刷新
 * @author 逐忆成书丶
 *
 */
public class PWDemo2 {
		public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
				/**
				 * PrintWriter(Writer writer)
				 * PrintWriter(OutputStream out)
				 * 构造方法允许链接字节流也可以是字符流
				 */
				
				FileOutputStream fos
						=new FileOutputStream("pw2.txt");
				
				/**
				 * 若需要按照指定的字符集写出字符串，需要自行
				 * 创建转换流并指定字符集
				 */
				
				OutputStreamWriter osw
						=new OutputStreamWriter(fos, "UTF-8");
				
				PrintWriter pw	=new PrintWriter(osw);
			
				pw.println("你好");
				pw.println("呵呵");
				
				 System.out.println("写出完毕");
				 pw.close();
				
			
			
			
			
			
			
			
			
		}
}













