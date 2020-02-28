package Day06;

import java.io.File;

/**
 * 创建多级目录
 * @author 逐忆成书丶
 *
 */
public class FileDemo5 {
	public static void main(String[] args) {
		/**
		 * 在当前目录下创建a/b/c/d/e/f目录
		 */

		File file = new File(
				"."+File.separator+
				"a"+File.separator+
				"b"+File.separator+
				"c"+File.separator+
				"d"+File.separator+
				"f"
			);
		if (!file.exists()) {
			/**
			 * mkdifs会将所有不存在的父目录一同创建出来
			 */
			file.mkdirs();
			System.out.println("创建目录完毕");
		}else {
			System.out.println("该目录以存在");
		}
		
		
	}
}






