package Day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * ���±�����
 * 
 * ����������Ҫ���û������ļ�����Ȼ�󴴽������ļ�����
 * д����
 * ֮���û��ڿ���̨�����ÿһ���ַ�����Ҫд�뵽���ļ�
 * ��
 * ���û�����exitʱ�����˳�
 * 
 * 
 * @author �������ؼ
 *
 */
public class Note {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�������ļ���:");
		String fileName=scanner.nextLine();
		
		RandomAccessFile raf
			=new RandomAccessFile(fileName, "rw");
		
		System.out.println("��ʼ����:");
		while (true) {
			String message=scanner.nextLine();
			if ("exit".equals(message)) {
				break;
				
			}
			raf.write(message.getBytes("GBK"));
	
			
		}
		System.out.println("�ټ�");
		raf.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}



















