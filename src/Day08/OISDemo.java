package Day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

/**
 * java.io.ObjectInputStream
 * @author �������ؼ
 *
 */
public class OISDemo {
		public static void main(String[] args) throws IOException, ClassNotFoundException {
				FileInputStream fis
						=new FileInputStream("person.obj");
				
				ObjectInputStream ois
						=new ObjectInputStream(fis);
				/**
				 * ��һ���ֽڻ�ԭΪ����Ĺ��̳�Ϊ:�������л�
				 */
				Person person=(Person)ois.readObject();
				
				System.out.println(person);
				
				ois.close();
				
				
				
		}
}
