package Day04;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 实用新循环遍历集合
 */
public class NewForDemo2 {
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
	        for (Object o:c) {
	            /*//Itertor it c.itertor();
	            // while(it.hasNext()){Object o= it.next() String str=(String) o;
	            System.out.println(str);
	            if ("#".equals(str)) {
	                c.remove(str);
	            }*/
	            /**
	             * 新循环并非新的语法，虚拟机并不支持新循环语法
	             * 新循环是编译器认可的。当编译器在编译源程序
	             * 时发现实用新循环遍历集合时，会将代码改变为
	             * 使用迭代器遍历集合
	             * 所以实用新循环遍历集合时不要通过集合的方法
	             * 增删元素，可能会发生异常。
	             */
	            String str=(String) o;
	            System.out.println(str);
	            if ("#".equals(str)) {
	                c.remove(str);
	            }
	        }
	        System.out.println(c);
	    }
}
