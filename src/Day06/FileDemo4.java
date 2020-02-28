package Day06;

import java.io.File;

/**
 * 创建一个目录
 * @author 逐忆成书丶
 *
 */
public class FileDemo4 {
	public static void main(String[] args) {
		/**
		 * 在当前目录下创建一个名为"demo"的目录
		 */
		File file = new File("demo");
		if (!file.exists()) {
			file.mkdir();
			System.out.println("创建目录完毕");
		}else {
			System.out.println("该目录以存在");
		}
		
		
		
		
		
		
		
		
		
	}
}













