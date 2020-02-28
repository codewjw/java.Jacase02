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
 * StringBuilder�����̰߳�ȫ�ģ���StringBuffer���߳�
 * ��ȫ�ġ�
 * 
 * List�е�ArrayList��LinkedList
 * Set�е�HashSet
 * Map�е�HashMap
 * ���϶������̰߳�ȫ��
 * ����ͨ�����Ϲ�����Collections������ת��Ϊ�̰߳�ȫ��
 * 
 * @author �������ؼ
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
				 * ����������ת��Ϊ�̰߳�ȫ��
				 */
				
				list=Collections.synchronizedList(list);
				System.out.println(list);
				
				/**
				 * ��������Set����ת��Ϊ�̰߳�ȫ��
				 */
				
				Set<String> set=new HashSet<String>(list);
				System.out.println(set);
				set=Collections.synchronizedSet(set);
				
				Map<String , Integer> map=new HashMap<String,Integer>();
				map.put("����", 99);
				map.put("��ѧ", 98);
				map.put("Ӣ��", 97);
				System.out.println(map);
				
				/**
				 * ��������Mapת��Ϊ�̰߳�ȫ��
				 */
				
				map=Collections.synchronizedMap(map);
				System.out.println(map);
				
				/**
				 * �������̰߳�ȫ�ļ��ϣ������Ԫ�ص���ط���
				 * Ҳ��������ü��ϵĵ��������⡣������Ҫ����
				 * ά�������ϵ
				 */
				
				
				
		}
}


















