package Day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ļ��ж�ȡһ���ֽ�
 * @author �������ؼ
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			=new RandomAccessFile("raf.bat","r");
		
		/**
		 * int read()
		 * ���ļ��ж�ȡһ���ֽڣ�����intֵ����ʽ����
		 * ��intֵ��"�Ͱ�λ"���Ƕ�ȡ�����ֽ����ݡ�
		 * �����ص�intֵΪ-1 �����ʾ��ȡ�����ļ�ĩβ
		 */
		
		int d=raf.read();
		System.out.println(d);
		raf.close();
	}
}
