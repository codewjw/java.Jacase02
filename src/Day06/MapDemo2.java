package Day06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map�ı���
 * Map�ı��������ַ�ʽ
 * �������е�Key���������е�value������ÿһ���ֵ��
 * ���б������е�value��Բ�����
 * @author �������ؼ
 *
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> map
			=new HashMap<String,Integer>();//����  LinkedHasMap<String Integer>
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		map.put("��ѧ", 99);
		System.out.println(map);
		
		/*
		 * ��������Key
		 * Set<K> KeySet()
		 * �÷����Ὣ��ǰMap�����е�Key���뵽һ��
		 * Set���Ϻ��䷵�ء����Ա������Set����
		 * ���൱�ڱ��������е�Key
		 */
		
		Set<String> keySet=map.keySet();
		for (String key : keySet) {
			System.out.println("key:"+key);
		}
		
		/*
		 *����Map�е�ÿһ���ֵ��
		 *Map��һ���ڲ���Entry������ÿһ��ʵ�����ڱ�ʾ
		 *Map�е�һ���ֵ��
		 *
		 *Set<Entry> entrySet()
		 *�÷����Ὣ��ǰMap��ÿһ���ֵ��(����Entryʵ��)
		 *���뵫һ��Set���Ϻ󷵻�
		 *
		 */
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();//Entry �еķ��ͺ�map��һ��
		
		for (Entry<String, Integer> e : entrySet) {
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println(key+":"+value);
			
		}
		
		
		/*
		 * �������е�value
		 * Collection<V> values()
		 * ����ǰMap�����е�value����һ�����Ϸ���
		 * 
		 */
		
		Collection<Integer> values=map.values();
		
		for (Integer value : values) {
			System.out.println("value:"+value);
		}
		
		
	}
}







