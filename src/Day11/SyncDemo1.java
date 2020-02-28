package Day11;
/**
 * 多线程并发安全问题
 * 当多个线程同时操作同体资源时，会出现"抢"的情况
 * 由于多线程切换时机不定，可能导致代码执行顺序出现
 * 混乱，有勃于程序设计的执行顺序而出现逻辑错误，严重
 * 时可能导致系统瘫痪
 * 
 * @author 逐忆成书丶
 *
 */
public class SyncDemo1 {
		public static void main(String[] args) {
				final Table table=new  Table();
				
				Thread t1=new Thread(){
						public void run() {
								while(true){
										int bean=table.getBean();
										//模拟线程切换
										Thread.yield();
										System.out.println(getName()+":"+bean);
								}
							
						}
				};
				Thread t2=new Thread(){
					public void run() {
							while(true){
									int bean=table.getBean();
									//模拟线程切换
									Thread.yield();
									System.out.println(getName()+":"+bean);
								}
						
						}
				};
				t1.start();
				t2.start();
		}
}

class  Table{
		private int beans=20;
		/**
		 * 当一个方法被synchronized修饰后，该方法称为
		 * 同步方法，即:多个线程不能同步执行该方法内容
		 * 
		 * 在方法上使用synchronized,那么上锁的对象就是
		 * 该方法所属对象，即:this
		 * @return
		 */
		public synchronized int getBean(){
				if (beans==0) {
						throw new RuntimeException("没有豆子");
				}
				//模拟线程切换
				Thread.yield();
				return beans--;
		}
}






