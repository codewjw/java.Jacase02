package Day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 流
 * 流是用来读写数据的
 * 流根据方向分为输入流与输出流
 * 输入流是用来从外界"读取"数据到程序中
 * 输出流是用来将程序中的数据"写出"到外界的
 * 
 * java.io.InputStream
 * 所有字节驶入流的父类，是一个抽象类，定义了相关的
 * 读取方法
 * 
 * java.io.OutputStream
 * 所有字节输出流的父类，是一个抽象类，定义了相关的
 * 写出方法
 * 
 * 流又分为：
 * 节点流(低级流):读写一定基于节点流，节点流是正式负责
 * 读写数据的流
 * 
 * 处理流(高级流):不能独立存在，需要处理其他流，作用是
 * 使用他们可以简化读写使局势的复杂处理
 * 
 * 
 * 
 * java.io.FileOutputStream
 * 文件输出流，继承自OutputStream，用来向文件中写出
 * 数据流，是一个低级流
 * @author 逐忆成书丶
 *
 */
public class FOSDemo {
		public static void main(String[] args) throws IOException {
			
			/**
			 * 默认创建文件流时覆盖写模式，即:
			 * 若文件流发现该文件已经存在，那么会先将文件
			 * 中所有数据清除
			 * 
			 * FileOutputStream提供了另一类构造方法，该方法
			 * 要求传入第二个参数，是一个boolean值，若该值
			 * 为true则是追加写模式，即:
			 * 若该文件存在，则文件数据全部保留，本次通过流
			 * 写入的数据都会被追加在文件末尾
			 */
			
				FileOutputStream fos
						=new FileOutputStream("fos.xtx",true);
				
				String  str="我在湖北职业技术学院，想着你";
				byte[] data = str.getBytes("UTF-8");
				fos.write(data);
				
				str="我在湖北职业技术学院，看着你";
				data = str.getBytes("UTF-8");
				fos.write(data);
			
				System.out.println("完成");
				fos.close();
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	

}














