package Day04;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * ���ϲ���
 */
public class Collection_addAll {
	public static void main(String[] args){
        Collection c=new ArrayList();
        c.add("Java");
        c.add("c");
        c.add(".net");
        Collection c1=new HashSet();//���ظ�//ArrayList();
        c1.add("php");
        c1.add("android");
        c1.add("oc");//objective C
        c1.add("java");
        c1.addAll(c);//c�ŵ�c1��������HashSet��ȥ���ظ�
        /**
         * boolean addAll(Collection c)
         * �����������е�����Ԫ����ӵ���ǰ������
         * ��Ӻ󵱼��������շ����ı�ͷ���true
         */
        System.out.println(c1);

        Collection c2=new ArrayList();
        c2.add(".net");
        c2.add("android");
        /**
         * boolean containsAll(Collection c)
         * �жϵ�ǰ�����Ƿ������������������Ԫ��
         */
        boolean contains=c1.containsAll(c2);
        System.out.println("ȫ����"+contains);

        c1.removeAll(c2);//ɾ������
        /**
         * ɾ����ǰ��������ָ�����Ϲ��е�Ԫ��
         */
        System.out.println(c1);
    }
}
