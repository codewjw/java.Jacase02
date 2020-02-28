package Day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 若希望提高读写效率，应当提高每次都写得数据量减少
 * 读写次数来达到
 * @author 逐忆成书丶
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile src
			=new RandomAccessFile("SimpDataFormat.pcf", "r");
		RandomAccessFile desc
			=new RandomAccessFile("SimpDataFormat.mp4", "rw");
		/**
		 * int read(byte[] data)
		 * 尝试连续读取给定的字节数组总长度的字节量，、
		 * 并将这些字节存入到该数组上返回值为实际
		 * 读取到的字节量，若返回值为-1 则表示本次
		 * 没有读到任何字节(文件末尾)
		 */
		
		 byte[] data=new byte[1024*10];//10K
		 int len=-1;
		 long stert=System.currentTimeMillis();
		 while((len=src.read(data))!=-1){
			 /**
			  * void write(byte[] data)
			  * 将给定的字节数组中所有字节一次性写出
			  * 
			  * void write(byte[] data ,int offset,int len)
			  * 将给定的字节数组中从下标offset处的连续len个
			  * 一次性写出
			  */
			 desc.write(data,0,len);
		 }
		 long end=System.currentTimeMillis();
		 System.out.println("复制完成!耗时："+(end-stert)+"ms");
		 src.close();
		 desc.close();
		
		
	}
}
