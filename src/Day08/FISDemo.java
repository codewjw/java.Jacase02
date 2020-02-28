package Day08;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * java.io.FileInputStream
 * 文件输入流
 * 用于从文件中读取数据
 * @author 逐忆成书丶
 *
 */
public class FISDemo {
		public static void main(String[] args) throws IOException {
			FileInputStream fis
					=new FileInputStream("fos.txt");
			
			byte[] data=new byte[100];
			int len=fis.read(data);
			
			String str=new String(data, 0, len,"UTF-8");
			System.out.println(str);
			
			fis.close();
			
			
			
			
			
		}
	
	
	
	
	
	

}
