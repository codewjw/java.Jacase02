package Day07;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �����ļ�
 * @author �������ؼ
 *
 */
public class CopyDemo1 {
	public static void main(String[] args) throws IOException {
		/**
		 * ��ԭ�ļ��е�ÿ���ֽ�˳���ȡ������д��
		 * ����һ���ļ��м��ﵽ�����ļ���Ŀ��
		 */
		
		RandomAccessFile src
			=new RandomAccessFile("SimpDataFormat.pcf", "r");
		RandomAccessFile desc
			=new RandomAccessFile("SimpDataFormat.mp4", "rw");
		
		//��ʱ����ÿ�ζ�ȡ����һ���ֽ�
		int d=-1;
		long stert=System.currentTimeMillis();
		while((d=src.read())!=-1){
			desc.write(d);
		}
		long end=System.currentTimeMillis();
		
		System.out.println("�������!��ʱ��"+(end-stert)+"ms");
		src.close();
		desc.close();
			
	}
}
