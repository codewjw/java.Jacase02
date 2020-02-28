package Day11;
/**
 * 静态方法使用sybcgronized修饰后，该方法一定具有同步
 * 效果
 * 
 * 静态方法同步后锁的是类对象，即Class的实例
 * JVM在加载每一个类的时候，都会实例化一个Class的实例
 * 用于表示这个类，而且每个都有且只有一个Class的实例
 * 静态方法锁的就是这个实例
 * 
 * @author 逐忆成书丶
 *
 */
public class SyncDemo3 {
		public static void main(String[] args) {
				Thread t1=new Thread(){
						public void run(){
								Foo.sodme();
						}
				};
				Thread t2=new Thread(){
					public void run(){
							Foo.sodme();
					}
			};
			t1.start();
			t2.start();
		}
}

class Foo{
		public synchronized static void sodme(){
				Thread t=Thread.currentThread();
				System.out.println(t.getName()+":正在运行dosme");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(t.getName()+":运行dosme完毕");
				
				
				
				
				
			
		}
	
}




