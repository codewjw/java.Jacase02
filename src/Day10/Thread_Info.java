package Day10;


/**
 * ��ȡ�߳���Ϣ
 * @author �������ؼ
 *
 */
public class Thread_Info {
		public static void main(String[] args) {
				//��ȡ�߳�main�������߳�
				Thread main=Thread.currentThread();
				
				//��ȡID
				long id=main.getId();
				System.out.println("ID:"+id);
				
				//��ȡ�߳���
				String name=main.getName();
				System.out.println("Nmae��"+name);
				
				//��ȡ�߳����ȼ�
				int priority = main.getPriority();
				System.out.println("priority:"+priority);
				
				//�Ƿ��ڻ״̬
				boolean isAlive = main.isAlive();
				System.out.println("isAlive:"+isAlive);
				
				//�Ƿ�Ϊ�ػ��߳�
				boolean isDaemon = main.isDaemon();
				System.out.println("isDaemon:"+isDaemon);
				
				//�Ƿ��ж�
				boolean isInterrupted = main.isInterrupted();
				System.out.println("isInterrupted:"+isInterrupted);
			
		}
}
