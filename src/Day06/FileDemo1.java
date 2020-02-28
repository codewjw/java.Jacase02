package Day06;

import java.awt.event.MouseWheelEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.io.File
 * 
 * File的每一个实例用于表示文件系统中的一个文件或目录
 * 使用File可以:
 * 1:访问期表示的文件或目录的属性信息(名字，大小等信息)
 * 2:操作文件或目录(创建，删除)
 * 3:访问目录子项
 * 但不能访问文件数据
 * @author 逐忆成书丶
 *
 */
public class FileDemo1 {
	public static void main(String[] args) {
		File file=new File("."+File.separator+"demo.txt");
		//D:/eclipse/工作空间/JAVASE01/demo.txt
		
		//获取文件名字
		String name=file.getName();
		System.out.println("name:"+name);
		
		
		//获取文件大小
		long length=file.length();
		System.out.println("len:"+length);
		
		boolean canWrite = file.canWrite();
		System.out.println("可写："+canWrite);
		
		boolean canRead=file.canRead();
		System.out.println("可读："+canRead);

		
		boolean hidden = file.isHidden();
		System.out.println("是否隐藏："+hidden);
		
		long lastModified = file.lastModified();
		
		Date date=new Date(lastModified);
//		date.setTime(lastModified);
		SimpleDateFormat sdf
			=new SimpleDateFormat("yyyy年M月d日,HH:mm:ss");
		System.out.println("修改i时间："+sdf.format(date));
		
		
		
		
		
	}

}
