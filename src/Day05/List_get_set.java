package Day05;

import java.util.List;

import javax.jws.Oneway;

import java.util.ArrayList;

/**
 * java.util.List
 * List��Collection��һ���ӽӿ�
 * List���˿��ظ��⣬����һ���ص�������������ṩ��
 * һ�׿���ͨ���±����Ԫ�صķ���
 * ����ʵ���ࣺ
 * java.util.ArrayList������ʵ�֣���ѯ����
 * java.util.LinkedList:����ʵ�֣���ɾ���죬��������β��ɾ
 * @author �������ؼ
 *
 */
public class List_get_set {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		/**
		 * E get(int index)
		 * ��ȡָ���±�Ԫ��
		 */
		
		String str=list.get(1);
		System.out.println(str);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		/**
		 * E set(int index,E e)
		 * ��ָ����Ԫ�����õ�ָ��λ���ϣ�����ֵΪԭ
		 * λ�ö�Ӧ��Ԫ�ء�����set����Ҳ���滻Ԫ��
		 * ����
		 */
		
		//[one,2,three,four,five,six]
		String old=list.set(1, "2");
		System.out.println(list);
		System.out.println("old:"+old);
		
	}
}
