package Day05;

import java.util.ArrayList;
import java.util.List;

/**
 * List subList(int start,int end)
 * ȡ�Ӽ�
 * @author �������ؼ
 *
 */
public class List_subList {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		/**
		 * ��ȡ[3,4,5,6,7]
		 */
		List<Integer> subList=list.subList(3, 3+5);
		System.out.println(subList);
		
		
	/**
	 * ���Ӽ���ÿ��Ԫ������10��
	 * [30��40��50��60��70]
	 */
		for (int i = 0; i <subList.size(); i++) {
			/*int num=subList.get(i);
			num*=10;*/
			subList.set(i, subList.get(i)*10);
		}
		System.out.println(subList);
		
		
		/**
		 * ���Ӽ�Ԫ�ص��޸ľ��Ƕ�ԭ���϶�ӦԪ�ص��޸�
		 */
		System.out.println(list);
		
		/**
		 * ��������2��8��Ԫ��ɾ��
		 */
		
		list.subList(2, 9).clear();
		System.out.println(list);
		
		
	}
}
