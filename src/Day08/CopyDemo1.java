package Day08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ�������ļ��ĸ��Ʋ���
 * @author �������ؼ
 *
 */
public class CopyDemo1 {
		public static void main(String[] args) throws IOException {
				/**
				 * ʹ���ļ���������ȡԴ�ļ�
				 * ʹ���ļ��������Ŀ���ļ���д��
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
			System.out.println("���");
			
			fis.close();
			fos.close();
			
			
		}
}
