package Day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collection �ṩ��һ�����ص�sort����
 * �÷������Ƽ�ʹ�ã���Ϊ�������ŵ�
 * 1.��Ҫ��Ԫ�ر���ʵ��Comparble�ӿڣ��������ǵĴ���
 * ��������
 * 2.��Ԫ���Ѿ�ʵ����Comparble�ӿ��磺String��������
 * �������ṩ�ıȽϴ�С�����������Ƕ����������ʱ
 * Ҳ����ʹ��������ص�sort����Ҫ����˴���Ҫ����ļ����⣬��Ҫ����
 * һ������ıȽ�����ʹ�������Ƚϼ���Ԫ��
 * @author �������ؼ
 *
 */
public class Collection_soert4 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("����ʦ");
		list.add("��������ʦ");
		list.add("С����ʦ");
		System.out.println(list);
		
		/*Comparator<String> com=new Comparator<String>(){
			public int compare(String o1, String o2){
				return o1.length()-o2.length();
			}
			
		};*/
		
		/**
		 * ���ص�sort��Ҫ��Ԫ��ʵ��Comparble�ӿڣ����Ѿ�
		 * ʵ����Ҳ�������Ԫ�صıȽϴ�С��������
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








