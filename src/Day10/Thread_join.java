package Day10;
/**
 * 线程是异步运行的
 * 异步:各执行各的，互不妨碍
 * 同步:有先后顺序的执行
 * 
 * 有些业务需要让多个线程间同步运行，这时候可以借助
 * 线程的join方法来完成
 * 
 * join 方法允许一个县城进入阻塞状态，直到其等待的拎一个
 * 线程工作结束后再继续运行
 * @author 逐忆成书丶
 *
 */
public class Thread_join {
		//表示图片是否下载完毕
		public static boolean isfinish=false;
		public static void main(String[] args) {
				final Thread download=new Thread(){
						public void run(){
								System.out.println("开始下载图片");
								for (int i = 0; i <=100; i++) {
										System.out.println("down:"+i+"%");
										try {
											Thread.sleep(50);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
								}
								System.out.println("图片下载完毕");
								isfinish=true;
						}
				};
				
				Thread show=new Thread(){
						public void run(){
								System.out.println("show:开始显示图片。。。");
								
								/**
								 * 先等待下载线程将图片下载完毕。在加载
								 */
								
								try {
									download.join();
								} catch (InterruptedException e) {
										e.printStackTrace();
								}
								
								if (!isfinish) {
										throw new RuntimeException("图片加载失败");
								}
								System.out.println("show:显示图片完毕");
						}
				};
				
				
				
				download.start();
				show.start();
		}
}
