package Day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈
 * 栈也可以存储一组元素，但是存取元素必须遵循
 * 先进后出原则。
 * 栈可以通过上端队列来实现，只调用一端进出对的的方法
 * 就实现了栈结构
 * 通常使用栈来完成诸如"后退"功能是使用
 * @author 逐忆成书丶
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
