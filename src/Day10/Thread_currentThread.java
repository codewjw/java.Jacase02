package Day10;
/**
 * 线程提供了一个静态方法
 * static Thread currentThread()
 * 该方法可以获取运行当前方法的线程
 * @author 逐忆成书丶
 *
 */
public class Thread_currentThread {
		public static void main(String[] args) {
				Thread t=Thread.currentThread();
				System.out.println("运行main方法的线程："+t);
				
				dosome();
				
				Thread mt=new Thread(){
					public void run(){
						Thread t=Thread.currentThread();
						System.out.println("运行自定义的线程："+t);
						dosome();
					}
				};
				mt.start();
			
			
		}
		public static void dosome() {
				Thread t=Thread.currentThread();
				System.out.println("运行dosome方法的线程："+t);
			
		}
}
	


