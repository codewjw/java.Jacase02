package Day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Ref;

/**
 * 使用RAF读写基本类型数据以及RAF基于指针的读与写
 * @author 逐忆成书丶
 *
 */
public class RandomAccessFileDemo5 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			=new RandomAccessFile("raf.bat", "rw");
		
		//向文件中写入最大值
		int imax=Integer.MAX_VALUE;
		System.out.println("pos"+raf.getFilePointer());//1
		/**
		 *                            vvvvvvvv
		 * 00000000 00000000 00000000 01111111 11111111 11111111 11111111
		 */
		System.out.println("pos"+raf.getFilePointer());//1
		raf.write(imax>>>24);
		raf.write(imax>>>16);
		raf.write(imax>>>8);
		System.out.println("pos"+raf.getFilePointer());//4
		//一次性给定int值的4个字节全部写出
		
		raf.writeInt(imax);
		System.out.println("pos"+raf.getFilePointer());//8
		
		raf.writeLong(123L);
		System.out.println("pos"+raf.getFilePointer());//16
		
		raf.writeDouble(123.123);
		System.out.println("pos"+raf.getFilePointer());//24
		
		
		System.out.println("写出完毕");
		
		/**
		 * read()                      vvvvvvvv
		 * 00000000 00000000 00000000 11111111//256
		 * -1
		 * 11111111 11111111 11111111 11111111//-1
		 * 
		 * End of File
		 */
		//移动指针到文件最开始
		raf.seek(0);
		System.out.println("pos"+raf.getFilePointer());//0
		
		
		int d=raf.readInt();
		System.out.println(d);//int 最大值
		
		d=raf.read();
		System.out.println(d);
		
		//读取long值?
		raf.seek(8);
		long l=raf.readLong();
		System.out.println(l);//123
		System.out.println("pos"+raf.getFilePointer());//9
		
		//Double
		double dou=raf.read();
		System.out.println(dou);
		System.out.println("pos"+raf.getFilePointer());//24
		
		
		
		
		raf.close();
	}
}
