package Day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.InputStramReader
 * 字符输入流，转换流，可以按照指定字符集读取字符
 * @author 逐忆成书丶
 *
 */
public class ISRDemo {
		public static void main(String[] args) throws IOException {
				FileInputStream fis
						=new FileInputStream("osw.txt");
				
				InputStreamReader isr
						=new InputStreamReader(fis);
				
				int d=-1;
				while((d=isr.read())!=-1){
						System.out.print((char)d);
					
				}
			
				
				isr.close();
			
			
			
			
			
			
			
			
			
		}
}
















