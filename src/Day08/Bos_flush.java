package Day08;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流写出数据是的缓冲区问题
 * @author 逐忆成书丶
 *
 */
public class Bos_flush {
	public static void main(String[] args) throws IOException {
			FileOutputStream fos
					=new FileOutputStream("bos.txt");
			BufferedOutputStream bos
					=new BufferedOutputStream(fos);
			
			String  str="摩擦摩擦";
//			fos.write(str.getBytes());
			bos.write(str.getBytes());
			/**
			 * 缓冲流的flush方法可以强制缓冲区中现有
			 * 数据一次性写出
			 */
//			bos.flush();//直接一次性写出缓存区的东西
			System.out.println("写出完毕");
			
			bos.close();
			
	}

}
