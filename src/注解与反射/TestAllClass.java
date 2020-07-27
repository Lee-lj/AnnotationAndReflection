package 注解与反射;

import java.lang.annotation.ElementType;

//测试所有类型的class
public class TestAllClass {

	public static void main(String[] args) {
         Class c1=Object.class;//类的Class
         Class c2=Comparable.class;//接口的Class
         Class c3=int[].class;//数组的Class
         Class c4=int[][].class;//二维数组的class
         Class c5=Override.class;//注解类型的Class
         Class c6=ElementType.class;//枚举类型的Class
         Class c7=Integer.class;//基本类型的Class
         Class c8=void.class;//空类型的Class void
         Class c9=Class.class;//Class本身
         
         System.out.println(c1);
         System.out.println(c2);
         System.out.println(c3);
         System.out.println(c4);
         System.out.println(c5);
         System.out.println(c6);
         System.out.println(c7);
         System.out.println(c8);
         System.out.println(c9);
         
         int[] a=new int[10];
         int[] b=new int[1000];
         System.out.println(a.getClass());
         System.out.println(b.getClass());
         //class [I
         //class [I  两个长度不等的数组输出的是同一个类，说明一个类只有一个对象
         
	}
}

