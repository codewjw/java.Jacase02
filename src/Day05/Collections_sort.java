package Day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * �����ṩ��һ��������
 * java.util.Collections
 * �����ṩ�˺ܶྲ̬�������Ǳ��ڲ������ϵķ���
 * 
 * ����sort�������ڶԼ���Ԫ�ؽ�����Ȼ���򣨴�С���󣩡�
 * 
 * @author �������ؼ
 *
 */
public class Collections_sort {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		Random random=new Random();
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(100));
			
		}
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
	}
}
