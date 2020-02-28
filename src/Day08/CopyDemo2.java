package Day08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.tools.FileObject;

/**
 * ��������һ�Ը߼�������������߶�дЧ��
 * ʹ�û�����������߶�дЧ�ʴӶ�����˸���Ч��
 * 
 * java.io.BufferedInputStream
 * �����ֽ�����������߶�ȡ�ֽڵ�Ч��
 * 
 * java.io.BufferedOutputStream
 * �����ֽ�����������д���ֽڵ�Ч��
 * 
 * @author �������ؼ
 *
 */
public class CopyDemo2 {
		public static void main(String[] args) throws IOException {
				FileInputStream fis
						=new FileInputStream("music.mp3");
				BufferedInputStream bis
						=new BufferedInputStream(fis);
		
				FileOutputStream fos
						=new FileOutputStream("music_cp2.mp3");
				
				BufferedOutputStream bos
						=new BufferedOutputStream(fos);
				
				long  statr=System.currentTimeMillis();
				
				int d=-1;
				while((d=bis.read())!=-1){
					fos.write(d);
					
					/**
					 * �������ڲ�ά����һ���ֽ�������Ϊ������
					 * ����:
					 * ������ʹ�û�������������ȡ��һ���ֽڵ�ʱ��
					 * ʵ���ϻ�������һ���Է�ȥһ���ֽڻ���������
					 * ���ڲ����ֽ������У�Ȼ�󽫵�һ���ֽڷ��ء�
					 * ��ʱ�������ٴ�ͨ��������ȡһ���ֽ�ʱ������
					 * ����ֱ�ӽ������еĵڶ����ֽڷ��أ���������ȥ��
					 * ȡ�����Ի�����ʵ����Ҳ��ͨ�����ÿ�ζ�д��������
					 * ���ٶ�д��������߶�дЧ��
					 */
				}
				
				long  end=System.currentTimeMillis();
				
				System.out.println("�������,��ʱ��"+(end-statr)+"ms");
				
				bis.close();
				bos.close();
				
				
		}
}












