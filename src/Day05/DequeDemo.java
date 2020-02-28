package Day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列
 * 两端都可以进出队列
 * @author 逐忆成书丶
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque=new LinkedList<String>();
		deque.offer("one");
		deque.offer("two");
		System.out.println(deque);
		
		deque.offerLast("three");
		System.out.println(deque);
		
		deque.offerFirst("four");
		System.out.println(deque);
		
		String str = deque.poll();
		System.out.println(str);//four
		System.out.println(deque);
		
		str=deque.pollLast();
		System.out.println(str);//three
		System.out.println(deque);
		
		
		
		
	}
}
