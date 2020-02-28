package Day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序自定义类型元素
 * @author 逐忆成书丶
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
		 * sort方法要求排序的集合必须实现
		 * Compable接口才可以排序
		 */
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
		
	}
}
