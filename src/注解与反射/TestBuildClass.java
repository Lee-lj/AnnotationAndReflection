package 注解与反射;

/*测试class类的几种创建方式
 * 366712642
   366712642
   366712642 hashcode一致，是同一个Class对象
 */
public class TestBuildClass {

	public static void main(String[] args) throws ClassNotFoundException {
		Person p=new Student();
		System.out.println("I'm"+p.name);//直接new

		//方式1.通过对象获得Class对象
		Class c1=p.getClass();
		System.out.println(c1.hashCode());
		
		//方式2.forName获得
		Class c2 = Class.forName("注解与反射.Student");
		System.out.println(c2.hashCode());
		
		//方式3.通过类名.class获得
		Class c3=Student.class;
		System.out.println(c3.hashCode());
		
		//方法4.内置基本数据类型可以直接用类名.Type  输出 int
		Class<Integer> c4 = Integer.TYPE;
		System.out.println(c4);
		
		//获得父类类型
		Class superclass = c1.getSuperclass();
		System.out.println(superclass);
	}

}

class Person{
	String name;

	public Person(String name) {
		this.name = name;
	}

	public Person() {
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}

class Student extends Person{
	public Student() {
		this.name="学生";
	}
}

class Teacher extends Person{
	public Teacher() {
		this.name="老师";
	}
}