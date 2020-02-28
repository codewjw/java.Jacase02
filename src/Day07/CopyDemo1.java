package Day07;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 复制文件
 * @author 逐忆成书丶
 *
 */
public class CopyDemo1 {
	public static void main(String[] args) throws IOException {
		/**
		 * 将原文件中的每个字节顺序读取出来并写入
		 * 到另一个文件中即达到复制文件的目的
		 */
		
		RandomAccessFile src
			=new RandomAccessFile("SimpDataFormat.pcf", "r");
		RandomAccessFile desc
			=new RandomAccessFile("SimpDataFormat.mp4", "rw");
		
		//临时保存每次读取带的一个字节
		int d=-1;
		long stert=System.currentTimeMillis();
		while((d=src.read())!=-1){
			desc.write(d);
		}
		long end=System.currentTimeMillis();
		
		System.out.println("复制完成!耗时："+(end-stert)+"ms");
		src.close();
		desc.close();
			
	}
}
