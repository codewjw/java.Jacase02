package Day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �����Զ�������Ԫ��
 * @author �������ؼ
 *
 */
public class Collections_sort3 {
	public static void main(String[] args) {
		List<Points> list=new ArrayList<Points>();
		list.add(new Points(3, 4));
		list.add(new Points(2, 1));
		list.add(new Points(5, 8));
		list.add(new Points(6, 3));
		list.add(new Points(9, 2));
		list.add(new Points(7, 5));
		System.out.println(list);
		/**
		 * sort����Ҫ������ļ��ϱ���ʵ��
		 * Compable�ӿڲſ�������
		 */
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
		
	}
}
