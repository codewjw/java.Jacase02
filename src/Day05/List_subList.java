package Day05;

import java.util.ArrayList;
import java.util.List;

/**
 * List subList(int start,int end)
 * 取子集
 * @author 逐忆成书丶
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
		 * 获取[3,4,5,6,7]
		 */
		List<Integer> subList=list.subList(3, 3+5);
		System.out.println(subList);
		
		
	/**
	 * 将子集中每个元素扩大10倍
	 * [30，40，50，60，70]
	 */
		for (int i = 0; i <subList.size(); i++) {
			/*int num=subList.get(i);
			num*=10;*/
			subList.set(i, subList.get(i)*10);
		}
		System.out.println(subList);
		
		
		/**
		 * 对子集元素的修改就是对原集合对应元素的修改
		 */
		System.out.println(list);
		
		/**
		 * 将集合中2—8的元素删除
		 */
		
		list.subList(2, 9).clear();
		System.out.println(list);
		
		
	}
}
