package Day05;

import java.util.ArrayList;
import java.util.List;

/**
 * List���ؿ�һ��add��remove����
 * ֧��ʹ���±����Ԫ��
 * @author �������ؼ
 *
 */
public class List_add_remove {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		
		/**
		 * void add(int index,E e)
		 * ��ָ��λ�ò���ָ��Ԫ��
		 */
		
		list.add(1,"2");
		System.out.println(list);
		/**
		 * E remove(int index)
		 * ɾ��ָ��λ�ô���Ӧ��Ԫ��
		 */
		String old=list.remove(2);
		System.out.println(list);
		System.out.println("old:"+old);
		
	}
}
