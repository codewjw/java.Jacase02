package Day05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型在集合中的应用是用来约束集合中的元素类型
 * @author 逐忆成书丶
 *
 */
public class CollectionDemo1 {
public static void main(String[] args) {
	Collection<String> c=new ArrayList<String>();
	c.add("one");
	c.add("two");
	c.add("three");
	c.add("four");
//	c.addAll(123);//编译不通过
	System.out.println(c);
	/**
	 * 迭代器的泛型类型与其遍历的集合一致即可
	 */
	Iterator<String> it=c.iterator();
	while (it.hasNext()) {
		String str=it.next();
		System.out.println(str);
		
	}
	
	for (String str : c) {
		System.out.println(str);
	}
	
	
}
}
