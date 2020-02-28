package Day06;

import java.io.File;

/**
 * 删除文件
 * @author 逐忆成书丶
 *
 */
public class FileDemo3 {
	public static void main(String[] args) {
		/**
		 * 将当前目录文件的test.txt 文件删除
		 */
		File file = new File("test.txt");
		// 同级目录下
		//"."+File.separator+"test.txt"
		
		if (file.exists()) {
			file.delete();
			System.out.println("删除完毕");
		}else {
			System.out.println("该文件不存在");
		}

	}
}
