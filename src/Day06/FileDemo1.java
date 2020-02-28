package Day06;

import java.awt.event.MouseWheelEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.io.File
 * 
 * File��ÿһ��ʵ�����ڱ�ʾ�ļ�ϵͳ�е�һ���ļ���Ŀ¼
 * ʹ��File����:
 * 1:�����ڱ�ʾ���ļ���Ŀ¼��������Ϣ(���֣���С����Ϣ)
 * 2:�����ļ���Ŀ¼(������ɾ��)
 * 3:����Ŀ¼����
 * �����ܷ����ļ�����
 * @author �������ؼ
 *
 */
public class FileDemo1 {
	public static void main(String[] args) {
		File file=new File("."+File.separator+"demo.txt");
		//D:/eclipse/�����ռ�/JAVASE01/demo.txt
		
		//��ȡ�ļ�����
		String name=file.getName();
		System.out.println("name:"+name);
		
		
		//��ȡ�ļ���С
		long length=file.length();
		System.out.println("len:"+length);
		
		boolean canWrite = file.canWrite();
		System.out.println("��д��"+canWrite);
		
		boolean canRead=file.canRead();
		System.out.println("�ɶ���"+canRead);

		
		boolean hidden = file.isHidden();
		System.out.println("�Ƿ����أ�"+hidden);
		
		long lastModified = file.lastModified();
		
		Date date=new Date(lastModified);
//		date.setTime(lastModified);
		SimpleDateFormat sdf
			=new SimpleDateFormat("yyyy��M��d��,HH:mm:ss");
		System.out.println("�޸�iʱ�䣺"+sdf.format(date));
		
		
		
		
		
	}

}
