package Day07;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ��emp.dat �ļ�������Ա������������������Ϊ����Empʵ����
 * ���ϣ�Ȼ������ü�����ÿ��Ա����Ϣ
 * ���ļ�800�ֽڣ�ÿ80�ֽ�Ϊһ��Ա����Ϣ
 * ���У�
 * 		nameΪ�ַ���������Ϊ32�ֽڣ�����Ϊ��UTF-8
 * 		age Ϊint ������Ϊ4�ֽ�
 * 		ganderΪ�ַ���������Ϊ10���ֽڣ�����Ϊ��UTGF-8
 * 		salary Ϊ�ַ���������Ϊ4�ֽ�
 * 		hiredateΪ�ַ���������Ϊ4�ֽ�
 * ��ʾ��
 * 		ʹ��RandomAccessFile��ȡ�ַ���ʱ�����磺name�������ȶ�ȡ
 * 		ת��Ϊ�ַ�������ȡageʱ����ֱ��ʹ��readInt�������Դ�����
 * @author �������ؼ
 *
 */
public class Test {
		public static void main(String[] args) throws URISyntaxException, IOException, ParseException {
				//ʹ������������ص�ǰ���е�emp.bat�ļ�
			File file=new File(Test.class.getClassLoader().getResource("emp.bat").toURI());
			RandomAccessFile raf
					=new RandomAccessFile(file, "r");
			
			List<Emp> empList
					=new ArrayList<Emp>();
			
			SimpleDateFormat sdf
					=new SimpleDateFormat("yyyy-MM-dd");
			
			for (int i = 0; i < 10; i++) {
				//��ȡname
				/*byte[] data=new byte[32];
				raf.read(data);
				String name =new String(data,"UTF-8").trim();*/
				String name=readString(raf, 32);
				System.out.println(name);
				System.out.println("pos:"+raf.getFilePointer());
				
				//��ȡage
				int age=raf.readInt();
				System.out.println(age);
				System.out.println("pos:"+raf.getFilePointer());
				
				//��ȡgender
				/*data=new byte[10];
				raf.read(data);
				String gender=new String(data,"UTF-8").trim();*/
				String gender=readString(raf, 10);
				System.out.println(gender);
				System.out.println("pos:"+raf.getFilePointer());
				
				//��ȡsalary
				int salary=raf.readInt();
				System.out.println(salary);
				System.out.println("pos:"+raf.getFilePointer());
				
				//��ȡdate
				String hiredate=readString(raf, 30);
				System.out.println(hiredate);
				System.out.println("pos:"+raf.getFilePointer());
				
				//��һ��empʵ�������Ա����Ϣ
				//ת�����ڸ�ʽ
				Date date=sdf.parse(hiredate);
				Emp emp=new Emp(name, age, gender, salary, date);
				empList.add(emp);
				
			}
			//���Ա��
			System.out.println(empList.size());
			for(Emp emp:empList){
				System.out.println(emp);
			}
			
			
			
			
			
			
		}
		public static String readString(RandomAccessFile raf,int len) throws IOException{
			byte[] data=new byte[len];
			raf.read(data);
			return new String(data,"UTF-8").trim();
		}
}









