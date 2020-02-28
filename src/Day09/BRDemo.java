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
 * 缓冲字符输入流，可以按行读取字符串
 * 
 * @author 逐忆成书丶
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
				 * 该方法会连续读取若干字符，直到读取到换行符
				 * 为止，然后将换行符之前的所有字符以一个字符串
				 * 的形式返回。需要注意，返回的字符串中不含有这个
				 * 换行符。若返回值为NULL，则说明无法通过该流在
				 * 读取到数据了(对于读文件而言，返回null表示读取到
				 * 文件末尾)
				 * 
				 */
				
				String line=null;
				while((line=br.readLine())!=null){
						System.out.println(line);
				}
				
				br.close();
				
				
				
				
				
				
				
				
				
				
		}
}
