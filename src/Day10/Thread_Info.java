package Day10;


/**
 * 获取线程信息
 * @author 逐忆成书丶
 *
 */
public class Thread_Info {
		public static void main(String[] args) {
				//获取线程main方法的线程
				Thread main=Thread.currentThread();
				
				//获取ID
				long id=main.getId();
				System.out.println("ID:"+id);
				
				//获取线程名
				String name=main.getName();
				System.out.println("Nmae："+name);
				
				//获取线程优先级
				int priority = main.getPriority();
				System.out.println("priority:"+priority);
				
				//是否处于活动状态
				boolean isAlive = main.isAlive();
				System.out.println("isAlive:"+isAlive);
				
				//是否为守护线程
				boolean isDaemon = main.isDaemon();
				System.out.println("isDaemon:"+isDaemon);
				
				//是否被中断
				boolean isInterrupted = main.isInterrupted();
				System.out.println("isInterrupted:"+isInterrupted);
			
		}
}
