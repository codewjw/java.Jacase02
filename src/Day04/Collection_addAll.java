package Day04;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合操作
 */
public class Collection_addAll {
	public static void main(String[] args){
        Collection c=new ArrayList();
        c.add("Java");
        c.add("c");
        c.add(".net");
        Collection c1=new HashSet();//不重复//ArrayList();
        c1.add("php");
        c1.add("android");
        c1.add("oc");//objective C
        c1.add("java");
        c1.addAll(c);//c放到c1里面利用HashSet会去除重复
        /**
         * boolean addAll(Collection c)
         * 将给定集合中的所有元素添加到当前集合中
         * 添加后当集合于那苏发生改变就返回true
         */
        System.out.println(c1);

        Collection c2=new ArrayList();
        c2.add(".net");
        c2.add("android");
        /**
         * boolean containsAll(Collection c)
         * 判断当前集合是否包含给定集合中所有元素
         */
        boolean contains=c1.containsAll(c2);
        System.out.println("全包含"+contains);

        c1.removeAll(c2);//删除交集
        /**
         * 删除当前集合中与指定集合共有的元素
         */
        System.out.println(c1);
    }
}
