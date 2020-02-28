package Day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.utol.Queue
 * ����
 * �������ڴ��һ��Ԫ�أ����Ǵ�ȡԪ�ر�����ѭ�Ƚ��ȳ�
 * ԭ��
 * @author �������ؼ
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		
		/**
		 * boolean offer(E e)
		 * �����ĩβ���ָ��Ԫ��
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		
		/**
		 * E poll()
		 * �Ӷ���ȥԪ��
		 * ��ȡ��Ԫ�ؼ��Ӷ������Ƴ�
		 */
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		/**
		 * E peek()
		 * ���ö���Ԫ��
		 * ��ȡ���Ԫ�ػ����ڶ�����
		 */
		str=queue.peek();
		System.out.println(str);
		System.out.println(queue);
		/**
		 * ��������Ԫ�أ����ڶ���ʵ���˼��Ͻӿڣ�����ʹ��
		 * ����������
		 */
		for (String s : queue) {
			System.out.println(s);
		}
		
		
		
		
	}
}
