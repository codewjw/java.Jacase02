package Day08;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ������д�������ǵĻ���������
 * @author �������ؼ
 *
 */
public class Bos_flush {
	public static void main(String[] args) throws IOException {
			FileOutputStream fos
					=new FileOutputStream("bos.txt");
			BufferedOutputStream bos
					=new BufferedOutputStream(fos);
			
			String  str="Ħ��Ħ��";
//			fos.write(str.getBytes());
			bos.write(str.getBytes());
			/**
			 * ��������flush��������ǿ�ƻ�����������
			 * ����һ����д��
			 */
//			bos.flush();//ֱ��һ����д���������Ķ���
			System.out.println("д�����");
			
			bos.close();
			
	}

}
