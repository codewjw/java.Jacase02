package Day09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流，以字符为单位读写数据的流，所以字符流只能
 * 读写文本数据
 * 字符流本质还是读写字节
 * Reader:字符输入流的父类，定义了都取得相关方法
 * Writer:字符输出流的父类，定义了写出字符的相关方法
 * 
 * 
 * 转换流:字符输出流的一个实现类
 * java.io.OutputStreamWriter
 * java.io.InputStreamReader
 * 
 * 由于大部分的字符流都只处理其他字符流，不直接处理字节
 * 流，而低级流绝大部分都是字节流，这就导致这些字符流是
 * 不能直接处理这些字节流的，就需要用到ISR，OSW这两个流
 * 因为他们可以处理字节流，而自身优势字符流，所以经常在
 * 流链接中起承上启下的作用
 * @author 逐忆成书丶
 *
 */
public class OSWDemo {
		public static void main(String[] args) throws IOException {
				FileOutputStream fos
						=new FileOutputStream("ows.txt");
//				OutputStreamWriter osw
//						=new OutputStreamWriter(fos);
				/**
				 * OSW 还支持第二个参数，是一个字符串，用来指定
				 * 字符集，当指定后，那么所有使用OSW写出的字符串
				 * 都使用该字符集转换为字节
				 */
				
				OutputStreamWriter osw
						=new OutputStreamWriter(fos,"GBK");
				
				osw.write("和我在成都的街头走一走");
				
				osw.write("知道所有的灯都熄灭了");
				
				System.out.println("写出完毕");
				osw.close();
			
			
			
			
			
			
		}
}






















