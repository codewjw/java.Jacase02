package Day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collection 提供了一个重载的sort方法
 * 该方法更推荐使用，因为有两个优点
 * 1.不要求元素必须实现Comparble接口，减少我们的代码
 * 的侵入性
 * 2.当元素已经实现了Comparble接口如：String这样的类
 * 但是其提供的比较大小规则不满足我们对排序的需求时
 * 也可以使用这个重载的sort方法要求除了传入要排序的集合外，还要传入
 * 一个额外的比较器，使用它来比较集合元素
 * @author 逐忆成书丶
 *
 */
public class Collection_soert4 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("范老师");
		list.add("刘苍松老师");
		list.add("小泽老师");
		System.out.println(list);
		
		/*Comparator<String> com=new Comparator<String>(){
			public int compare(String o1, String o2){
				return o1.length()-o2.length();
			}
			
		};*/
		
		/**
		 * 重载的sort不要求元素实现Comparble接口，若已经
		 * 实现了也不会根据元素的比较大小规则排序
		 */
		Collections.sort(list,new Comparator<String>(){
			@Override
			public int compare(String o1, String o2){
				return o1.length()-o2.length();
			}
			
		});
		
		System.out.println(list);
	}
}

/*class MyCompartor implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
			
		return o1.length()-o2.length();
	}

	
	
}*/








