package Day06;

import java.io.File;

/**
 * 删除目录
 * 
 * @author 逐忆成书丶
 *
 */
public class FileDemo6 {
	public static void main(String[] args) {
		/**
		 * 将当前目录中的demo目录删除
		 */
		File file = new File("demo");
		
		if (!file.exists()) {
			/**
			 * delete方法在删除目录的时候需要注意
			 * 只有该目录是一个空目录时才能删除
			 */
			file.delete();
			System.out.println("删除目录完毕");
		}else {
			System.out.println("该目录不存在");
		}
		
		
		
		
		
	}
	
}






