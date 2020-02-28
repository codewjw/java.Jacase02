package Day08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.tools.FileObject;

/**
 * 缓冲流是一对高级流，作用是提高读写效率
 * 使用缓冲流可以提高读写效率从而提高了复制效率
 * 
 * java.io.BufferedInputStream
 * 缓冲字节输入流，提高读取字节的效率
 * 
 * java.io.BufferedOutputStream
 * 缓冲字节输出流，提高写出字节的效率
 * 
 * @author 逐忆成书丶
 *
 */
public class CopyDemo2 {
		public static void main(String[] args) throws IOException {
				FileInputStream fis
						=new FileInputStream("music.mp3");
				BufferedInputStream bis
						=new BufferedInputStream(fis);
		
				FileOutputStream fos
						=new FileOutputStream("music_cp2.mp3");
				
				BufferedOutputStream bos
						=new BufferedOutputStream(fos);
				
				long  statr=System.currentTimeMillis();
				
				int d=-1;
				while((d=bis.read())!=-1){
					fos.write(d);
					
					/**
					 * 缓冲流内部维护了一个字节数组作为缓冲区
					 * 例如:
					 * 当我们使用缓冲流输入流读取第一个字节的时候
					 * 实际上缓冲流会一次性拂去一组字节会来并存入
					 * 到内部的字节数组中，然后将第一个字节返回。
					 * 这时当我们再次通过该流读取一个字节时，缓冲
					 * 流会直接将数字中的第二个字节返回，而不是在去读
					 * 取。所以缓冲流实际上也是通过提高每次都写得数据量
					 * 减少读写次数来提高读写效率
					 */
				}
				
				long  end=System.currentTimeMillis();
				
				System.out.println("复制完毕,耗时："+(end-statr)+"ms");
				
				bis.close();
				bos.close();
				
				
		}
}












