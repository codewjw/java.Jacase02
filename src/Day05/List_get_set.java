package Day05;

import java.util.List;

import javax.jws.Oneway;

import java.util.ArrayList;

/**
 * java.util.List
 * List是Collection的一个子接口
 * List除了可重复外，还有一个特点就是有序，所以提供了
 * 一套可以通过下标操作元素的方法
 * 常用实现类：
 * java.util.ArrayList：数组实现，查询更快
 * java.util.LinkedList:链表实现，增删更快，尤其是首尾增删
 * @author 逐忆成书丶
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
		 * 获取指定下标元素
		 */
		
		String str=list.get(1);
		System.out.println(str);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		/**
		 * E set(int index,E e)
		 * 将指定的元素设置到指定位置上，返回值为原
		 * 位置对应的元素。所以set方法也是替换元素
		 * 操作
		 */
		
		//[one,2,three,four,five,six]
		String old=list.set(1, "2");
		System.out.println(list);
		System.out.println("old:"+old);
		
	}
}
