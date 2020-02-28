package Day08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制操纵
 * @author 逐忆成书丶
 *
 */
public class CopyDemo1 {
		public static void main(String[] args) throws IOException {
				/**
				 * 使用文件输入流读取源文件
				 * 使用文件输出流向目标文件中写入
				 * 
				 */
			
				FileInputStream fis
						=new FileInputStream("movie.mp4");
				
				FileOutputStream fos
						=new FileOutputStream("movie_cp2.mp4");
				
				int len=-1;
				byte[] data=new byte[1024*10];
				while((len=fis.read())!=-1){
						fos.write(data,0,len);
					
				}
			System.out.println("完成");
			
			fis.close();
			fos.close();
			
			
		}
}
