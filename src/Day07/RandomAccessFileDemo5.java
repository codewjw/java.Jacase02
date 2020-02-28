package Day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Ref;

/**
 * ʹ��RAF��д�������������Լ�RAF����ָ��Ķ���д
 * @author �������ؼ
 *
 */
public class RandomAccessFileDemo5 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			=new RandomAccessFile("raf.bat", "rw");
		
		//���ļ���д�����ֵ
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
		//һ���Ը���intֵ��4���ֽ�ȫ��д��
		
		raf.writeInt(imax);
		System.out.println("pos"+raf.getFilePointer());//8
		
		raf.writeLong(123L);
		System.out.println("pos"+raf.getFilePointer());//16
		
		raf.writeDouble(123.123);
		System.out.println("pos"+raf.getFilePointer());//24
		
		
		System.out.println("д�����");
		
		/**
		 * read()                      vvvvvvvv
		 * 00000000 00000000 00000000 11111111//256
		 * -1
		 * 11111111 11111111 11111111 11111111//-1
		 * 
		 * End of File
		 */
		//�ƶ�ָ�뵽�ļ��ʼ
		raf.seek(0);
		System.out.println("pos"+raf.getFilePointer());//0
		
		
		int d=raf.readInt();
		System.out.println(d);//int ���ֵ
		
		d=raf.read();
		System.out.println(d);
		
		//��ȡlongֵ?
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
