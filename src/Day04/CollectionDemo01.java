package Day04;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合包含提供了方法用于判断指定元素是否被
 * 集合所包含
 * boolean contains(E e)
 * 当指定元素被集合包含则返回true
 * */
public class CollectionDemo01 {
	public static void main(String[] args){
        Collection c=new ArrayList();

        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        System.out.println(c);
        Point p=new Point(1,2);
        boolean contains=c.contains(p);
        /**
         * contains 的判断表准是通过给定的元素与集合中
         * 现有元素逐一进行equals比较，只要元素比较
         * 为true，则认为包含。所以元素的equals方法直接
         * 影响contains的返回结果
         */
        System.out.println("包含"+contains);


    }
}
