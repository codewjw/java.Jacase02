package Day04;

public class PS {
	public static void main(String[] args) {
		Person pstu = new Student();
		System.out.println("name=" + pstu.name);
		pstu.sayHi();
	}

}

class Person {
	String name; // 例子属性，表示一个人的名字

	public Person() {
		name = "Person"; // 初始化一个值
		System.out.println(name);
		System.out.println("I'm Person!");
	}

	 //定义sayHi()方法，默认输出HelloWorld
	protected void sayHi() {
		System.out.println("Person->sayHi");
		System.out.println("HelloWorld!");
	}

}

class Student extends Person {
	String className; // 班级名

	public Student() {
		name = "haydn"; // 为父类里的name重新赋值
		className = "菜鸟营一班"; // 为className赋值
		System.out.println("Student Name"+name);
		System.out.println("Student ClassName"+className);
		System.out.println("I'm Student");
	}

	// 这里重写了父类的sayHi方法
	protected void sayHi() {
		System.out.println("从写");
		System.out.println("stuName=" + name);
		System.out.println("stuClassName=" + className);
	}

	public void stuTalk() {
		System.out.println("I like Java");
	}
}
