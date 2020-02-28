package Day06;

import java.io.File;

/**
 * 编写一段代码，要求计算1+2+3...+100
 * 并输出结果
 * 在这段代码中不呢个出现for while关键字
 * 
 * 
 * 一个人去买水，1块钱1瓶，3个瓶盖可以换一瓶，2个空瓶可以换一瓶
 * 请问 20块钱能买多少瓶水
 * 
 * @author 逐忆成书丶
 *
 */
public class Test {
	public static void main(String[] args) {
		File file=new File("a");
		delete(file);
	}
	
	/**
	 * 将给定的File对象表示的文件或目录删除
	 * @param file
	 */
	
	public static void delete(File file){
		if(file.isDirectory()){
			//将该目录中所有子项删除
			
			File[] listFiles = file.listFiles();
			for(File sub:listFiles){
				delete(sub);
			}
		}
		file.delete();
	}

}




