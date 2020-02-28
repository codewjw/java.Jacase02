package Day05;
/**
 * 排序字符串是按照每个字符的unicode编码排序
 * 但是中文就没有规律了
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author 逐忆成书丶
 *
 */
public class Collections_sort2 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("admin");
		list.add("james");
		list.add("mike");
		list.add("Simth");
		list.add("Alice");
		list.add("Tom");
		list.add("jerry");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		List<String> list1=new ArrayList<String>();
		list.add("范老师");
		list.add("苍老师");
		list.add("小泽老师");
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
	}
}
