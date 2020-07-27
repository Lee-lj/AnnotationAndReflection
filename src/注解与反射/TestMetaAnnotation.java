package 注解与反射;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//测试元注解   自定义一个注解
public class TestMetaAnnotation {
	//注解是显式赋值，如果没有默认值，就必须给注解赋值
	@MyAnnotation(name="sss")
	public void test() {
		
	}
	
}

//定义一个注解
@Target(value= {ElementType.METHOD,ElementType.TYPE})//定义这个注解可以被用在什么地方method为方法上，要定义多个的话在大括号中逗号隔开,TYPE为类上
@Retention(RetentionPolicy.RUNTIME)//表示注解在什么时候才有效
@interface MyAnnotation{
	//注解的参数:参数类型+参数名
	String name();
	int id() default 0;//设置默认值
	//String value();只有参数名为value，才可以直接输入参数值
	
}