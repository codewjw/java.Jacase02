package Day07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * 用来读写文件数据的类。读写方式时基于文件指针，即：
 * RAF总是在指针当前指向位置读写字节。每当读写字节后
 * 指针会自动向后移动到下一个字节
 * RAF提供了很多方便读写数据相关方法
 * @author 逐忆成书丶
 *
 */
public class RandomAccessFileDemo1 {
	public static void main(String[] args) throws IOException {
		/**
		 * RandomAccessFile创建有两种模式
		 * 1.只读模式(r)
		 * 2.读写模式(rw)
		 * 
		 * RandomAccessFile 提供了两个常用的构造方法:
		 * RandomAccessFile(String path,String mode)
		 * RandomAccessFile(File file,String mode)
		 * 第一个参数用来指定要读写的文件
		 */
		
		RandomAccessFile ref
			=new RandomAccessFile("raf.dat","rw");
		
		/**
		 * void write(int d)
		 * 向文件中写出一个字节，写的是给定的int值对应
		 * 的二进制的"低八位"
		 *                                                 vvvvvvvv
		 * 00000000 00000000 00000000 00000001
		 * 
		 */
		ref.write(1);
		
		System.out.println("写出完毕");
		
		ref.close();
	
		
		
	}
}



