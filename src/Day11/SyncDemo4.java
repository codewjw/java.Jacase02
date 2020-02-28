package Day11;
/**
 * 互斥锁
 * 当synchronized修饰多段不同代码，但是锁对象相同时
 * 这些代码间有互斥性，即:多个线程不能同时执行这些
 * 代码
 * 
 * 
 * @author 逐忆成书丶
 *
 */
public class SyncDemo4 {
		public static void main(String[] args) {
				final Boo boo=new Boo();
				
				Thread t1=new Thread(){
						public void run(){
								boo.methodA();
							
						}
						
				};
				
				Thread t2=new Thread(){
					public void run(){
							boo.methodB();
						
					}
					
			};
			
			t1.start();
			t2.start();
				
				
				
		}
}
class Boo{
		public synchronized void methodA(){
				Thread t=Thread.currentThread();
				System.out.println(t.getName()+":正在执行A方法");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(t.getName()+":执行A方法完毕");
				
		}
		public synchronized void methodB(){
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+":正在执行B方法");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(t.getName()+":执行B方法完毕");
			
		
	}
}