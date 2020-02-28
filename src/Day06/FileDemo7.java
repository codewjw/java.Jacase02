package Day06;

import java.io.File;

/**
 * 访问一个目录中的所有子项
 * @author 逐忆成书丶
 *
 */
public class FileDemo7 {
	public static void main(String[] args) {
		/**
		 * 查看当前目录中的所有子项
		 */
		
		File file = new File(".");
		
		/**
		 * boolean isDirectory()
		 * 判断当前File对象表示的是否为一个目录
		 * 
		 * 
		 * boolean isFile()
		 * 判断当前File对象表示的是否为一个文件
		 * 
		 */
		if (file.isDirectory()) {
			/**
			 * File[] listFiles()
			 * 获取当前File对象表示的目录中的所有子项
			 */
			
			File[] listFiles = file.listFiles();
			for(File sub:listFiles){
				System.out.println(sub.getName());
			}
		}
		
		
		
		
		
		
		
		
	}
}




