package Day04;


/**
 * 增强新for循环
 * 又称为：新循环， for each
 * 新循环是jdk1.5之后推出的特性，作用是遍历集合过数组
 */
public class NewForDemo1 {
	public static void main(String[] args) {
		String[] array={"one","two","three","four","five"};

        for (int i = 0; i <array.length ; i++) {
            String str=array[i];
            System.out.println("第"+i+"个元素是："+str);
        }

        for ( String str:array) {//不认可  改变为传统for循环语法
            /**
             * 编译器会将新循环遍历数组改变为使用传统循环进行
             * 遍历
             */
            System.out.println(str);
        }
	}
}
