package Day09;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字符流
 * 缓冲字符流是一对高级流，特点是可以按行读写字符串
 * java.io.BufferedWriter:缓冲字符输出流
 * java.io.BufferedReader:缓冲字符输入流
 * 
 * 
 * java.io.PrintWriter
 * 常用缓冲字符输出流，内部使用BufferedWriter作为
 * 其缓冲功能，PW本身还具有子哦对那个刷新，所以常用这个流
 * 
 * @author 逐忆成书丶
 *
 */
public class PWDemo1 {
		public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
				/**
				 *  java.io.PrintWriter提供可较多的构造方法
				 *  可以方便创建它
				 *  其中有两个直接针对文件做出字符串操作的
				 *  构造方法:
				 *  PrintWriter(String path)
				 *  PrintWriter(File file)
				 *  
				 *  若希望按照指定的字符集写出字符串，那么上述两个
				 *  针对文件写出操作的构造方法都支持第二个参数
				 *  该参数为字符串，用来指定字符集的名称
				 *  
				 */
//			PrintWriter pw=new PrintWriter("pw.txt");
			
			
				PrintWriter pw=new PrintWriter("pw.txt","UTF-8");
				
				pw.println("改配合你演出的我你视而不见");
				pw.println("别逼我");
				
				System.out.println("写出完毕");
				pw.close();
				
				
			
			
			
			
			
			
			
			
			
		}
}












