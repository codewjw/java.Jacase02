package Day04;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合提供了统一遍历集合元素的方法：
 * Iteartor iterator()
 * 返回一个可以遍历当前集合的迭代器实现类
 *
 * java.util.Iterator
 * 是一个接口，规定了所有迭代器实现类遍历集合的通用
 * 方法。
 * 不同的集合都提供了一个实现类，无需记住那些实现类的
 * 名字，只需将他们当作Iterator看待即可。调用相应方法
 * 获取集合元素
 * 使用迭代遍历遵循：问，取，删  其中删除不是必须操作
 */
public class Collection_iterator {
	 public static void main(String[] args){
	        Collection c=new ArrayList();
	        c.add("one");
	        c.add("#");
	        c.add("two");
	        c.add("#");
	        c.add("three");
	        c.add("#");
	        c.add("four");
	        c.add("#");
	        c.add("five");
	        System.out.println(c);
	        /**
	         * boolean hasNext()
	         * 迭代器的该方法用来判断期遍历的集合是否还有
	         * 元素下一个可以取出
	         */
	        Iterator it=c.iterator();
	        while (it.hasNext()){
	            /**
	             * E next()
	             * 通过迭代器获取集合中下一个元素
	             */
	            String str=(String) it.next();
	            System.out.println(str);

	            if ("#".equals(str)){
	            	//避免空指针异常
	                /**
	                 * 在实用迭代器遍历集合的过程中是
	                 * 不能通过集合的方法增删元素的。否则
	                 * 迭代器会抛出异常
	                 */
	                //c.remove(str);
	                /**
	                 * 迭代器自身提供了一个供删除集合元素
	                 * 的方法remove，该方法不需要传入参数，
	                 * 删除的是使用迭代期next方法取出的元素
	                 */
	                it.remove();
	            }
	            System.out.println(c);
	        }

	    }
}
