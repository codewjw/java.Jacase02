package Day04;

import java.util.ArrayList;
import java.util.Collection;

public class Demo2 {
	public static void main(String[] args){
        //java就近调用原则
        //单继承找子类
        //不能多继承
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
