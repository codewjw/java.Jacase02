package Day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ
 * ջҲ���Դ洢һ��Ԫ�أ����Ǵ�ȡԪ�ر�����ѭ
 * �Ƚ����ԭ��
 * ջ����ͨ���϶˶�����ʵ�֣�ֻ����һ�˽����Եĵķ���
 * ��ʵ����ջ�ṹ
 * ͨ��ʹ��ջ���������"����"������ʹ��
 * @author �������ؼ
 *
 */
public class StaclDemo {
	public static void main(String[] args) {
		Deque<String> stack=new LinkedList<String>();
		
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		System.out.println(stack);
		
		
		String str=stack.pop();
		System.out.println(str);
		System.out.println(stack);
		
		str=stack.peek();
		System.out.println(str);
		System.out.println(stack);
		
		for (String string : stack) {
			System.out.println(string);
		}
		
		
	}
}