package Day04;

import java.util.ArrayList;
import java.util.Collection;

public class Demo2 {
	public static void main(String[] args){
        //java�ͽ�����ԭ��
        //���̳�������
        //���ܶ�̳�
        test(null);
    }
    public static void test(int i){
        System.out.println("int");
    }
    public static void test(ArrayList arrayList){
        System.out.println("arrayList");
    }
    public static void test(Collection c){
        System.out.println("collection");
    }
    public static void test(Object o){
        System.out.println("object");
    }
}
