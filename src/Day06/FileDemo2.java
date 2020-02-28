package Day06;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个新文件
 * @author 逐忆成书丶
 *
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		/**
		 * 在当前目录下创建一个名为test.txt的文件
		 */
		File file = new File("."+File.separator+"test.txt");
		boolean exists = file.exists();
		
	/**
	 * boolean exists()
	 * 判断当前file标识的文件或目录是否真实存在
	 */
		System.out.println("文件是否存在："+exists);
		
		if(!file.exists()){
			//创建文件
			file.createNewFile();
			System.out.println("文件创建完毕");
		}else {
			System.out.println("该文件已存在");
		}
		

		
		
		
		
		
		
		
	}
}











