package Day06;

import java.util.HashMap;
import java.util.Map;

/**
 * javautil.Map
 * ���ұ�
 * ��Key-value�Ե���ʽ�洢Ԫ��
 * ����ʵ����:java.util.HasMap(��ɢ���㷨ʵ�ֵ�Map)
 * 
 * 
 * @author �������ؼ
 *
 */
public class MapDemo1 {

	public static void main(String[] args) {
		Map<String,Integer>map
			=new HashMap<String,Integer>(10);
		//HasMap������ò������ķ�֮��
		/*
		 *V put(K k,V v)
		 *��������һ���ֵ�Դ��뵽Map�С�
		 *����MapҪ��Key�������ظ���������ʹ��Map��
		 *�Ѿ����ڵ�Key�洢��Ԫ�أ������滻Value����
		 *��ôput�����ķ���ֵ���Ǳ��滻��value������
		 *����null
		 *Map�ж�Key�Ƿ��ظ�������Key�����equals����
		 *�ȽϵĽ����Ϊtrue����Ϊ�ظ�
		 */
		
		/*Integer num = map.put("����", 99);//����д int дInteger
		System.out.println(num);*/
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		map.put("��ѧ", 99);
		System.out.println(map);
		//��ͬ��Key���滻value����
		int num = map.put("����", 70);
		System.out.println(map);
		System.out.println(num);
		
		
		/*
		 * V get(K k)
		 * ���ݸ�����Key��ȡ��Ӧ��value����ָ����Key
		 * ��Map�в����ڣ��򷵻�ֵΪnull
		 */
		
		//��ȡ��ѧ�ɼ�
		num=map.get("��ѧ");
		System.out.println(num);
		
		System.out.println("������"+map.get("����"));
		
		/*
		 * V remove(K k)
		 * ���ݸ�����Key��Map�ж�Ӧ�������ֵ��ɾ��
		 * ����ֵΪ��Key��Ӧ��value
		 */
		System.out.println("������ɾ��");
		num=map.remove("����");
		System.out.println(num);
		
		
		
	}
	
	
	
	
	
	
	
	
	
}

















