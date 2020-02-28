package Day05;

import java.util.ArrayList;
import java.util.List;

/**
 * List重载可一对add，remove方法
 * 支持使用下标操作元素
 * @author 逐忆成书丶
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
		 * 向指定位置插入指定元素
		 */
		
		list.add(1,"2");
		System.out.println(list);
		/**
		 * E remove(int index)
		 * 删除指定位置处对应的元素
		 */
		String old=list.remove(2);
		System.out.println(list);
		System.out.println("old:"+old);
		
	}
}
