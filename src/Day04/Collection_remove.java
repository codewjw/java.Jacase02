package Day04;
import java.util.ArrayList;
import java.util.Collection;

/**
 * ɾ������Ԫ��
 */
public class Collection_remove {
	 public static void main(String[] args){
	        Collection c=new ArrayList();
	        c.add(new Point(1,2));
	        c.add(new Point(3,4));
	        c.add(new Point(5,6));
	        System.out.println(c);
	        /**
	         * boolean remove(E e)
	         * �Ӽ�����ɾ��ָ��Ԫ��equals�Ƚ�Ϊtrue��
	         * Ԫ�ء���Ҫע�⣬ֻ��ɾ��һ�������ϻ�˳��
	         * �������бȽϣ�ɾ����һ��equals�Ƚ�Ϊture��Ԫ��
	         * ��ֹͣɾ��
	         */
	        Point p=new Point(1,2);
	        c.remove(p);
	        System.out.println(c);
	    }
}
