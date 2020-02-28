package Day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ¶ÁÈ¡×Ö·û´®
 * @author ÖðÒä³ÉÊéØ¼
 *
 */
public class RandomAccessFileDemo4 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile ref
			=new RandomAccessFile("raf.txt", "r");
		
		byte[] data=new byte[200];
		
		int len=ref.read(data);
		
		String str=new String(data,0,len,"GBK");//.trim()
		
		System.out.println(str);
		
		ref.close();
		
		
		
	}
}
