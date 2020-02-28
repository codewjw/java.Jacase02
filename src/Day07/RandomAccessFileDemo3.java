package Day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 写出字符串
 * @author 逐忆成书丶
 *
 */
public class RandomAccessFileDemo3 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile ref
			=new RandomAccessFile(".txt","re");
		
		
		/**
		 * byte[] getBytes()
		 * 字符串提供了可以将当前字符串转换为一组字节
		 * 的方法:
		 * 
		 * byte[] getBytes()
		 * 将当前字符串按照系统默认字符集转换为一组字节
		 * 
		 * 字符串提供了一个重载的getBytes方法，可以按照
		 * 指定的字符集写出字符串
		 * byte[] getBytes(String csn)
		 * 
		 * 传入的字符串为指定的字符集名称，不区分大小写
		 * GBK,UTF-8
		 */
		
		String str="简单点，说话的方式简单点.";
		byte[] data=str.getBytes("GBK");
		ref.write(data);
		
		str="递进的情绪情深略";
		data=str.getBytes("GBK");
		ref.write(data);
		
		System.out.println("写出完毕");
		
		ref.close();
		
		
		
	}
}
