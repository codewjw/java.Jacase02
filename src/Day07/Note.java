package Day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 记事本程序
 * 
 * 程序启动后，要求用户输入文件名，然后创建并对文件进行
 * 写操作
 * 之后用户在控制台输入的每一行字符串都要写入到该文件
 * 中
 * 当用户输入exit时程序退出
 * 
 * 
 * @author 逐忆成书丶
 *
 */
public class Note {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入文件名:");
		String fileName=scanner.nextLine();
		
		RandomAccessFile raf
			=new RandomAccessFile(fileName, "rw");
		
		System.out.println("开始输入:");
		while (true) {
			String message=scanner.nextLine();
			if ("exit".equals(message)) {
				break;
				
			}
			raf.write(message.getBytes("GBK"));
	
			
		}
		System.out.println("再见");
		raf.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}



















