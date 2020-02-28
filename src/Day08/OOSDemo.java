package Day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * java.io.ObjectOutputStream
 * 对象输出流，是一个高级流，作用是可以将java中任何
 * 对象转换为一组字节后写出
 * @author 逐忆成书丶
 *
 */
public class OOSDemo {
		public static void main(String[] args) throws IOException {
				String name="苍老师";
				int age=18;
				String gender="女";
				List<String> otherInfo=new ArrayList<String>();
				otherInfo.add("来自日本");
				otherInfo.add("是一名一线演员");
				otherInfo.add("主要代表作台词都比较少");
				otherInfo.add("爱好写大字");
				otherInfo.add("促进中日文化交流");
				otherInfo.add("广大男性同胞的启蒙老师");
				Person person=new Person(name, age, gender, otherInfo);
				System.out.println(person);
				
				FileOutputStream fos
						=new FileOutputStream("Person.obj");
				
				ObjectOutputStream oss
						=new ObjectOutputStream(fos);
				/**
				 * 对象输出流提供了一个专门用于写java对象的方法:
				 * void  weiteObject(Object obj)
				 * 该方法会将给定的对象中的所有内容转换为一组字节后
				 * 写出
				 * 
				 * weiteObject方法要求写出的对象所属类必须实现
				 * 可序化接口:java.io.Serializable
				 * 
				 * 将对象写入文件中经历了两个操作 
				 * 1:将给定对象转换为一组字节---对象序列化
				 * 2:再将这组字节写入到文件中---数据持久化
				 */
				oss.writeObject(person);
				System.out.println("写出完毕");
				
				oss.close();
				
				
				
				
				
				
				
				
				
		}
}
