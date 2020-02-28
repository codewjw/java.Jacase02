package Day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 	线程池
 * 线程池通常用于
 * 1.控制线程数量
 * 2.重用线程
 * 
 * @author 逐忆成书丶
 *
 */
public class ThreadPoolDemo {
		public static void main(String[] args) {
				ExecutorService threadPool
						=Executors.newFixedThreadPool(2);
				
				for(int i=0;i<5;i++){
						Runnable runn=new Runnable() {
							public void run() {
									Thread t=Thread.currentThread();
									System.out.println(t.getName()+":正在执行任务");
									try {
										Thread.sleep(5000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									System.out.println(t.getName()+":执行任务完毕");
							}
						};
						threadPool.execute(runn);
						System.out.println("将任务"+i+"指派给线程池");
				}
				//停止线程池   shutdownNow()马上停
				threadPool.shutdownNow();
				System.out.println("停止了线程池");
				 
		} 
}















