package Day04;
import java.util.ArrayList;
import java.util.Collection;

/**
 * ʵ����ѭ����������
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
	             * ��ѭ�������µ��﷨�����������֧����ѭ���﷨
	             * ��ѭ���Ǳ������Ͽɵġ����������ڱ���Դ����
	             * ʱ����ʵ����ѭ����������ʱ���Ὣ����ı�Ϊ
	             * ʹ�õ�������������
	             * ����ʵ����ѭ����������ʱ��Ҫͨ�����ϵķ���
	             * ��ɾԪ�أ����ܻᷢ���쳣��
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
