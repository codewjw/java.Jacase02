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
 * �������������һ���߼����������ǿ��Խ�java���κ�
 * ����ת��Ϊһ���ֽں�д��
 * @author �������ؼ
 *
 */
public class OOSDemo {
		public static void main(String[] args) throws IOException {
				String name="����ʦ";
				int age=18;
				String gender="Ů";
				List<String> otherInfo=new ArrayList<String>();
				otherInfo.add("�����ձ�");
				otherInfo.add("��һ��һ����Ա");
				otherInfo.add("��Ҫ������̨�ʶ��Ƚ���");
				otherInfo.add("����д����");
				otherInfo.add("�ٽ������Ļ�����");
				otherInfo.add("�������ͬ����������ʦ");
				Person person=new Person(name, age, gender, otherInfo);
				System.out.println(person);
				
				FileOutputStream fos
						=new FileOutputStream("Person.obj");
				
				ObjectOutputStream oss
						=new ObjectOutputStream(fos);
				/**
				 * ����������ṩ��һ��ר������дjava����ķ���:
				 * void  weiteObject(Object obj)
				 * �÷����Ὣ�����Ķ����е���������ת��Ϊһ���ֽں�
				 * д��
				 * 
				 * weiteObject����Ҫ��д���Ķ������������ʵ��
				 * ���򻯽ӿ�:java.io.Serializable
				 * 
				 * ������д���ļ��о������������� 
				 * 1:����������ת��Ϊһ���ֽ�---�������л�
				 * 2:�ٽ������ֽ�д�뵽�ļ���---���ݳ־û�
				 */
				oss.writeObject(person);
				System.out.println("д�����");
				
				oss.close();
				
				
				
				
				
				
				
				
				
		}
}
