package Day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * д���ַ���
 * @author �������ؼ
 *
 */
public class RandomAccessFileDemo3 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile ref
			=new RandomAccessFile(".txt","re");
		
		
		/**
		 * byte[] getBytes()
		 * �ַ����ṩ�˿��Խ���ǰ�ַ���ת��Ϊһ���ֽ�
		 * �ķ���:
		 * 
		 * byte[] getBytes()
		 * ����ǰ�ַ�������ϵͳĬ���ַ���ת��Ϊһ���ֽ�
		 * 
		 * �ַ����ṩ��һ�����ص�getBytes���������԰���
		 * ָ�����ַ���д���ַ���
		 * byte[] getBytes(String csn)
		 * 
		 * ������ַ���Ϊָ�����ַ������ƣ������ִ�Сд
		 * GBK,UTF-8
		 */
		
		String str="�򵥵㣬˵���ķ�ʽ�򵥵�.";
		byte[] data=str.getBytes("GBK");
		ref.write(data);
		
		str="�ݽ�������������";
		data=str.getBytes("GBK");
		ref.write(data);
		
		System.out.println("д�����");
		
		ref.close();
		
		
		
	}
}
