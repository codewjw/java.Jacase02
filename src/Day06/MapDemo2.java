package Day06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map的遍历
 * Map的遍历有三种方式
 * 遍历所有的Key，遍历所有的value，遍历每一组键值对
 * 其中遍历所有的value相对不常用
 * @author 逐忆成书丶
 *
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> map
			=new HashMap<String,Integer>();//有序  LinkedHasMap<String Integer>
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("物理", 96);
		map.put("化学", 99);
		System.out.println(map);
		
		/*
		 * 遍历所有Key
		 * Set<K> KeySet()
		 * 该方法会将当前Map中所有的Key存入到一个
		 * Set集合后将其返回。所以便利这个Set集合
		 * 就相当于遍历了所有的Key
		 */
		
		Set<String> keySet=map.keySet();
		for (String key : keySet) {
			System.out.println("key:"+key);
		}
		
		/*
		 *遍历Map中的每一组键值对
		 *Map有一个内部类Entry，其中每一个实例用于表示
		 *Map中的一组键值对
		 *
		 *Set<Entry> entrySet()
		 *该方法会将当前Map中每一组键值对(若干Entry实例)
		 *存入但一个Set集合后返回
		 *
		 */
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();//Entry 中的泛型和map中一致
		
		for (Entry<String, Integer> e : entrySet) {
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println(key+":"+value);
			
		}
		
		
		/*
		 * 遍历所有的value
		 * Collection<V> values()
		 * 将当前Map中所有的value存入一个集合返回
		 * 
		 */
		
		Collection<Integer> values=map.values();
		
		for (Integer value : values) {
			System.out.println("value:"+value);
		}
		
		
	}
}







