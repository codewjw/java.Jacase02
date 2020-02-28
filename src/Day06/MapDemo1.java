package Day06;

import java.util.HashMap;
import java.util.Map;

/**
 * javautil.Map
 * 查找表
 * 以Key-value对的形式存储元素
 * 常用实现类:java.util.HasMap(由散列算法实现的Map)
 * 
 * 
 * @author 逐忆成书丶
 *
 */
public class MapDemo1 {

	public static void main(String[] args) {
		Map<String,Integer>map
			=new HashMap<String,Integer>(10);
		//HasMap容量最好不超过四分之三
		/*
		 *V put(K k,V v)
		 *将给定的一组键值对存入到Map中。
		 *由于Map要求Key不允许重复，所以若使用Map中
		 *已经存在的Key存储新元素，则是替换Value操作
		 *那么put方法的返回值就是被替换的value，否则
		 *返回null
		 *Map判断Key是否重复是依靠Key自身的equals方法
		 *比较的结果，为true则认为重复
		 */
		
		/*Integer num = map.put("语文", 99);//不能写 int 写Integer
		System.out.println(num);*/
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("物理", 96);
		map.put("化学", 99);
		System.out.println(map);
		//相同的Key是替换value操作
		int num = map.put("语文", 70);
		System.out.println(map);
		System.out.println(num);
		
		
		/*
		 * V get(K k)
		 * 根据给定的Key获取对应的value，若指定的Key
		 * 在Map中不存在，则返回值为null
		 */
		
		//获取数学成绩
		num=map.get("数学");
		System.out.println(num);
		
		System.out.println("体育："+map.get("体育"));
		
		/*
		 * V remove(K k)
		 * 根据给定的Key将Map中对应的这组键值对删除
		 * 返回值为该Key对应的value
		 */
		System.out.println("将语文删除");
		num=map.remove("语文");
		System.out.println(num);
		
		
		
	}
	
	
	
	
	
	
	
	
	
}

















