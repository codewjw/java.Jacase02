package Day04;

public class Demo {
	public static void main(String[] args){
        StringBuilder a=new StringBuilder("a");
        StringBuilder b=new StringBuilder("b");
        append(a,b);
        System.out.println("main a:"+a);
        System.out.println("main b:"+b);

        int i=1;
        add(i);
        System.out.println(i);//1
    }
    public static void add(int i){
        i++;
    }
    public static void append(StringBuilder a,StringBuilder b){
        a.append("b");
        System.out.println("append a"+a);
        b=a;
        System.out.println("append b"+b);
    }
}
