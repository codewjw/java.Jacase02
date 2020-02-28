package Day05;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 数组转换为集合
 * 使用数组的工具类Arrays的方法asList
 * 需要注意，只能转换为List集
 * @author 逐忆成书丶
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
		 * 对集合元素操作就是对原数组对应元素的操作
		 */
		for (String str : array) {
			System.out.println(str);
		}
		/**
		 * 从数组转换过来的集合是不能添加新元素的
		 * 否则会抛出不受支持操作的异常
		 * 应为对集合元素操作就是对原始数组操作，添加
		 * 元素会导致数组扩容，从而表示不了原数组
		 */
		//list.add("six");
		/**
		 * 想添加新元素，需要自行创建一个集合 
		 */
		List<String> list1=new ArrayList<String>(list);
//		list1.addAll(list);                                             
		System.out.println("list1:"+list1);
		list1.add("six");
		System.out.println("list1:"+list1);
			
	}
}
