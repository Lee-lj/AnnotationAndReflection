package 注解与反射;


//测试反射
public class TestReflect {

	public static void main(String[] args) throws ClassNotFoundException {
		//通过反射获取类的class对象
		Class forName = Class.forName("注解与反射.User");
		System.out.println(forName);//class 注解与反射.User  得到这个对象
		
		//forName.xxx(获取这个类中的对象，方法，以及它的父类等等)
		Class x1 = Class.forName("注解与反射.User");
		Class x2 = Class.forName("注解与反射.User");
		Class x3 = Class.forName("注解与反射.User");
		//可以发现得到的三个hashcode相同，因为一个类只有一个对象，获取到的一直就是这一个对象
		//一个类被加载后，类的整个结构都会被封装在class对象中
		System.out.println(x1.hashCode());
		System.out.println(x2.hashCode());
		System.out.println(x3.hashCode());
	}
}


//实体类  pojo/entity
class User{
	private String name;
	private int id;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User() {
	}
	public User(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	
	
	
}