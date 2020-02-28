package Day09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 异常捕获机制在io操作中的处理
 * @author 逐忆成书丶
 *
 */
public class Exception_finally2 {
		public static void main(String[] args) {
			BufferedReader br=null;
				try {
					 br=new BufferedReader(
									new InputStreamReader(new FileInputStream(
											"src"+File.separator+
											"day09"+File.separator+
											"Exception_finally2.java"
											)
								)
					);
					String line=null;
					while((line=br.readLine())!=null){
							System.out.println(line);
					}
				} catch(IOException e){
					e.printStackTrace();
				}finally {
						if (br!=null) {
								try {
									br.close();
								} catch (IOException e) {
									e.printStackTrace();
								}
						}
						
				}
				/*catch(Exception e){
					e.printStackTrace();
				}*/
				/*catch (FileNotFoundException e) {
						
						e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}*/
		}
}
