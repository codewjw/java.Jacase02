package Day04;

public class PS {
	public static void main(String[] args) {
		Person pstu = new Student();
		System.out.println("name=" + pstu.name);
		pstu.sayHi();
	}

}

class Person {
	String name; // �������ԣ���ʾһ���˵�����

	public Person() {
		name = "Person"; // ��ʼ��һ��ֵ
		System.out.println(name);
		System.out.println("I'm Person!");
	}

	 //����sayHi()������Ĭ�����HelloWorld
	protected void sayHi() {
		System.out.println("Person->sayHi");
		System.out.println("HelloWorld!");
	}

}

class Student extends Person {
	String className; // �༶��

	public Student() {
		name = "haydn"; // Ϊ�������name���¸�ֵ
		className = "����Ӫһ��"; // ΪclassName��ֵ
		System.out.println("Student Name"+name);
		System.out.println("Student ClassName"+className);
		System.out.println("I'm Student");
	}

	// ������д�˸����sayHi����
	protected void sayHi() {
		System.out.println("��д");
		System.out.println("stuName=" + name);
		System.out.println("stuClassName=" + className);
	}

	public void stuTalk() {
		System.out.println("I like Java");
	}
}
