package Day05;
/**
 * �����ַ����ǰ���ÿ���ַ���unicode��������
 * �������ľ�û�й�����
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author �������ؼ
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
		list.add("����ʦ");
		list.add("����ʦ");
		list.add("С����ʦ");
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
	}
}
