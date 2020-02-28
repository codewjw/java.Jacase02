package Day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ϣ����߶�дЧ�ʣ�Ӧ�����ÿ�ζ�д������������
 * ��д�������ﵽ
 * @author �������ؼ
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
		 * ����������ȡ�������ֽ������ܳ��ȵ��ֽ�������
		 * ������Щ�ֽڴ��뵽�������Ϸ���ֵΪʵ��
		 * ��ȡ�����ֽ�����������ֵΪ-1 ���ʾ����
		 * û�ж����κ��ֽ�(�ļ�ĩβ)
		 */
		
		 byte[] data=new byte[1024*10];//10K
		 int len=-1;
		 long stert=System.currentTimeMillis();
		 while((len=src.read(data))!=-1){
			 /**
			  * void write(byte[] data)
			  * ���������ֽ������������ֽ�һ����д��
			  * 
			  * void write(byte[] data ,int offset,int len)
			  * ���������ֽ������д��±�offset��������len��
			  * һ����д��
			  */
			 desc.write(data,0,len);
		 }
		 long end=System.currentTimeMillis();
		 System.out.println("�������!��ʱ��"+(end-stert)+"ms");
		 src.close();
		 desc.close();
		
		
	}
}
