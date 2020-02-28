package Day06;

import java.io.File;
import java.io.FileFilter;

/**
 * File提供了一个重在的listFiles方法
 * 可以返回其表示的目录中满足指定过滤器要求的子项
 * 
 * 
 * File[] listFile(FileFilter file)
 * 
 * java.io.FileFilter  文件过滤器
 * @author 逐忆成书丶
 *
 */
public class FileDemo8 {
	public static void main(String[] args) {
		/**
		 * 获取当前目录中所有文件
		 */
		File file=new File(".");
		
		File[] subs=file.listFiles(new FileFilter() {
			/**
			 * 过滤器要求必须重写accept方法，而该方法的作用
			 * 是定义过滤器Fil对象的规则，若认为给定的File
			 * 满足过滤器要求，则方法返回true
			 */
			@Override
			public boolean accept(File pathname) {
				System.out.println("正在过滤"+pathname.getName());
				return pathname.isFile();
				
			}
		});
		
		for (File sub : subs) {
			System.out.println(sub);
		}
		
		
		
		
	}
}




