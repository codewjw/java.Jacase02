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
 * 将emp.dat 文件中所有员工解析出来，并创建为若干Emp实例存
 * 集合，然后输出该集合中每个员工信息
 * 该文件800字节，每80字节为一个员工信息
 * 其中：
 * 		name为字符串，长度为32字节，编码为：UTF-8
 * 		age 为int ，长度为4字节
 * 		gander为字符串，长度为10个字节，编码为：UTGF-8
 * 		salary 为字符串，长度为4字节
 * 		hiredate为字符串，长度为4字节
 * 提示：
 * 		使用RandomAccessFile读取字符串时，例如：name，可以先读取
 * 		转换为字符串，读取age时可以直接使用readInt方法。以此类推
 * @author 逐忆成书丶
 *
 */
public class Test {
		public static void main(String[] args) throws URISyntaxException, IOException, ParseException {
				//使用类加载器加载当前包中的emp.bat文件
			File file=new File(Test.class.getClassLoader().getResource("emp.bat").toURI());
			RandomAccessFile raf
					=new RandomAccessFile(file, "r");
			
			List<Emp> empList
					=new ArrayList<Emp>();
			
			SimpleDateFormat sdf
					=new SimpleDateFormat("yyyy-MM-dd");
			
			for (int i = 0; i < 10; i++) {
				//读取name
				/*byte[] data=new byte[32];
				raf.read(data);
				String name =new String(data,"UTF-8").trim();*/
				String name=readString(raf, 32);
				System.out.println(name);
				System.out.println("pos:"+raf.getFilePointer());
				
				//读取age
				int age=raf.readInt();
				System.out.println(age);
				System.out.println("pos:"+raf.getFilePointer());
				
				//读取gender
				/*data=new byte[10];
				raf.read(data);
				String gender=new String(data,"UTF-8").trim();*/
				String gender=readString(raf, 10);
				System.out.println(gender);
				System.out.println("pos:"+raf.getFilePointer());
				
				//读取salary
				int salary=raf.readInt();
				System.out.println(salary);
				System.out.println("pos:"+raf.getFilePointer());
				
				//读取date
				String hiredate=readString(raf, 30);
				System.out.println(hiredate);
				System.out.println("pos:"+raf.getFilePointer());
				
				//用一个emp实例保存该员工信息
				//转换日期格式
				Date date=sdf.parse(hiredate);
				Emp emp=new Emp(name, age, gender, salary, date);
				empList.add(emp);
				
			}
			//输出员工
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









