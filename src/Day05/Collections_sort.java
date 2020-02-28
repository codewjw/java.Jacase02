package Day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 集合提供了一个工具类
 * java.util.Collections
 * 该类提供了很多静态方法都是便于操作集合的方法
 * 
 * 其中sort方法用于对集合元素进行自然排序（从小到大）、
 * 
 * @author 逐忆成书丶
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
