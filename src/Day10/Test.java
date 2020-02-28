package Day10;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 电子表功能
 * 
 * 每秒在控制台输出一次当前系统时间
 * 格式如:17：18：22
 * 
 * @author 逐忆成书丶
 *
 */
public class Test {
		public static void main(String[] args) {
				SimpleDateFormat sdf
						=new SimpleDateFormat("HH:mm:ss");
				while(true){
						System.out.println(sdf.format(new Date()));
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					
				}
		}
}
