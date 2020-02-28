package Day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.utol.Queue
 * 队列
 * 队列用于存放一组元素，但是存取元素必须遵循先进先出
 * 原则
 * @author 逐忆成书丶
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		
		/**
		 * boolean offer(E e)
		 * 相对列末尾添加指定元素
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		
		/**
		 * E poll()
		 * 从对首去元素
		 * 获取后元素即从队列中移除
		 */
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		/**
		 * E peek()
		 * 引用对首元素
		 * 获取后该元素还会在队列中
		 */
		str=queue.peek();
		System.out.println(str);
		System.out.println(queue);
		/**
		 * 遍历集合元素，由于队列实现了集合接口，可以使用
		 * 迭代器遍历
		 */
		for (String s : queue) {
			System.out.println(s);
		}
		
		
		
		
	}
}
