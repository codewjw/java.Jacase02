package Day05;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * ����ת��Ϊ����
 * ʹ������Ĺ�����Arrays�ķ���asList
 * ��Ҫע�⣬ֻ��ת��ΪList��
 * @author �������ؼ
 *
 */
public class ArraytoKistDemo {
	public static void main(String[] args) {
		String[] array={"one","two","three","four","five"};
		
		List<String> list =Arrays.asList(array);
		System.out.println(list.size());
		System.out.println(list);
		
		list.set(1, "2");
		System.out.println(list);
		
		/**
		 * �Լ���Ԫ�ز������Ƕ�ԭ�����ӦԪ�صĲ���
		 */
		for (String str : array) {
			System.out.println(str);
		}
		/**
		 * ������ת�������ļ����ǲ��������Ԫ�ص�
		 * ������׳�����֧�ֲ������쳣
		 * ӦΪ�Լ���Ԫ�ز������Ƕ�ԭʼ������������
		 * Ԫ�ػᵼ���������ݣ��Ӷ���ʾ����ԭ����
		 */
		//list.add("six");
		/**
		 * �������Ԫ�أ���Ҫ���д���һ������ 
		 */
		List<String> list1=new ArrayList<String>(list);
//		list1.addAll(list);                                             
		System.out.println("list1:"+list1);
		list1.add("six");
		System.out.println("list1:"+list1);
			
	}
}
