package Day04;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * �����ṩ��ͳһ��������Ԫ�صķ�����
 * Iteartor iterator()
 * ����һ�����Ա�����ǰ���ϵĵ�����ʵ����
 *
 * java.util.Iterator
 * ��һ���ӿڣ��涨�����е�����ʵ����������ϵ�ͨ��
 * ������
 * ��ͬ�ļ��϶��ṩ��һ��ʵ���࣬�����ס��Щʵ�����
 * ���֣�ֻ�轫���ǵ���Iterator�������ɡ�������Ӧ����
 * ��ȡ����Ԫ��
 * ʹ�õ���������ѭ���ʣ�ȡ��ɾ  ����ɾ�����Ǳ������
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
	         * �������ĸ÷��������ж��ڱ����ļ����Ƿ���
	         * Ԫ����һ������ȡ��
	         */
	        Iterator it=c.iterator();
	        while (it.hasNext()){
	            /**
	             * E next()
	             * ͨ����������ȡ��������һ��Ԫ��
	             */
	            String str=(String) it.next();
	            System.out.println(str);

	            if ("#".equals(str)){
	            	//�����ָ���쳣
	                /**
	                 * ��ʵ�õ������������ϵĹ�������
	                 * ����ͨ�����ϵķ�����ɾԪ�صġ�����
	                 * ���������׳��쳣
	                 */
	                //c.remove(str);
	                /**
	                 * �����������ṩ��һ����ɾ������Ԫ��
	                 * �ķ���remove���÷�������Ҫ���������
	                 * ɾ������ʹ�õ�����next����ȡ����Ԫ��
	                 */
	                it.remove();
	            }
	            System.out.println(c);
	        }

	    }
}
