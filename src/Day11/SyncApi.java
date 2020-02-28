package Day11;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.awt.event.MouseWheelEvent;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/**
 * StringBuilder不是线程安全的，而StringBuffer是线程
 * 安全的。
 * 
 * List中的ArrayList，LinkedList
 * Set中的HashSet
 * Map中的HashMap
 * 以上都不是线程安全的
 * 可以通过集合工具类Collections将他们转换为线程安全的
 * 
 * @author 逐忆成书丶
 *
 */
public class SyncApi {
		public static void main(String[] args) {
				List<String> list=new ArrayList<String >();
				list.add("one");
				list.add("two");
				list.add("three");
				list.add("four");
				System.out.println(list);
				
				/**
				 * 将给定集合转换为线程安全的
				 */
				
				list=Collections.synchronizedList(list);
				System.out.println(list);
				
				/**
				 * 将给定的Set集合转换为线程安全的
				 */
				
				Set<String> set=new HashSet<String>(list);
				System.out.println(set);
				set=Collections.synchronizedSet(set);
				
				Map<String , Integer> map=new HashMap<String,Integer>();
				map.put("语文", 99);
				map.put("数学", 98);
				map.put("英语", 97);
				System.out.println(map);
				
				/**
				 * 将给定的Map转换为线程安全的
				 */
				
				map=Collections.synchronizedMap(map);
				System.out.println(map);
				
				/**
				 * 就算是线程安全的集合，其操作元素的相关方法
				 * 也不与遍历该集合的迭代器互斥。所以需要自行
				 * 维护互斥关系
				 */
				
				
				
		}
}


















