package Day05;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection�ṩ�˷���toArray
 * ���Խ���ǰ����ת��Ϊһ������
 * @author �������ؼ
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		Collection<String> c2 = c;
		c2.add("one");
		c2.add("two");
		c2.add("three");
		c2.add("four");
		c2.add("five");
		System.out.println(c2);
		//������
		//Object[] array=c.toArray();
		String[] array=c.toArray(new String[c.size()]);
		System.out.println(array.length);
		for (String str : array) {
			System.out.println(str);
		}
	}
}
