package Day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文件中读取一个字节
 * @author 逐忆成书丶
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			=new RandomAccessFile("raf.bat","r");
		
		/**
		 * int read()
		 * 从文件中读取一个字节，并以int值的形式返回
		 * 该int值的"低八位"即是读取到的字节内容。
		 * 若返回的int值为-1 ，则表示读取到了文件末尾
		 */
		
		int d=raf.read();
		System.out.println(d);
		raf.close();
	}
}
