package Day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

/**
 * java.io.ObjectInputStream
 * @author 逐忆成书丶
 *
 */
public class OISDemo {
		public static void main(String[] args) throws IOException, ClassNotFoundException {
				FileInputStream fis
						=new FileInputStream("person.obj");
				
				ObjectInputStream ois
						=new ObjectInputStream(fis);
				/**
				 * 将一组字节还原为对象的过程称为:对象反序列化
				 */
				Person person=(Person)ois.readObject();
				
				System.out.println(person);
				
				ois.close();
				
				
				
		}
}
