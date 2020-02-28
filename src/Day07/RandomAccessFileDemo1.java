package Day07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * ������д�ļ����ݵ��ࡣ��д��ʽʱ�����ļ�ָ�룬����
 * RAF������ָ�뵱ǰָ��λ�ö�д�ֽڡ�ÿ����д�ֽں�
 * ָ����Զ�����ƶ�����һ���ֽ�
 * RAF�ṩ�˺ܶ෽���д������ط���
 * @author �������ؼ
 *
 */
public class RandomAccessFileDemo1 {
	public static void main(String[] args) throws IOException {
		/**
		 * RandomAccessFile����������ģʽ
		 * 1.ֻ��ģʽ(r)
		 * 2.��дģʽ(rw)
		 * 
		 * RandomAccessFile �ṩ���������õĹ��췽��:
		 * RandomAccessFile(String path,String mode)
		 * RandomAccessFile(File file,String mode)
		 * ��һ����������ָ��Ҫ��д���ļ�
		 */
		
		RandomAccessFile ref
			=new RandomAccessFile("raf.dat","rw");
		
		/**
		 * void write(int d)
		 * ���ļ���д��һ���ֽڣ�д���Ǹ�����intֵ��Ӧ
		 * �Ķ����Ƶ�"�Ͱ�λ"
		 *                                                 vvvvvvvv
		 * 00000000 00000000 00000000 00000001
		 * 
		 */
		ref.write(1);
		
		System.out.println("д�����");
		
		ref.close();
	
		
		
	}
}



