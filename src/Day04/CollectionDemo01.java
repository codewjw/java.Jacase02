package Day04;
import java.util.ArrayList;
import java.util.Collection;

/**
 * ���ϰ����ṩ�˷��������ж�ָ��Ԫ���Ƿ�
 * ����������
 * boolean contains(E e)
 * ��ָ��Ԫ�ر����ϰ����򷵻�true
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
         * contains ���жϱ�׼��ͨ��������Ԫ���뼯����
         * ����Ԫ����һ����equals�Ƚϣ�ֻҪԪ�رȽ�
         * Ϊtrue������Ϊ����������Ԫ�ص�equals����ֱ��
         * Ӱ��contains�ķ��ؽ��
         */
        System.out.println("����"+contains);


    }
}
