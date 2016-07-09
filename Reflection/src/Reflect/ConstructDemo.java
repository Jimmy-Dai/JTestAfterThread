package Reflect;

import java.lang.reflect.Constructor;

public class ConstructDemo {

	public static void main(String[] args) throws Exception {
		Person p = new Person();
		Class c1 =  p.getClass();
		Class c2 = Person.class;
		Class c3 = Class.forName("Reflect.Person");
		
//		System.out.println(p);
//		System.out.println(c1);
//		System.out.println(c1==c2);
//		System.out.println(c1==c3);
//		System.out.println(c2==c3);
//		System.out.println("-----------------------------------");
		Constructor[] cons1 = c3.getConstructors();
		for(Constructor con : cons1){
			System.out.println(con);
		}
		System.out.println("-----------------------------------");
		Constructor[] cons2 = c3.getDeclaredConstructors();
		for(Constructor con : cons2){
			System.out.println(con);
		}
		System.out.println("-----------------------------------");
		Constructor con1 = c3.getConstructor(String.class,int.class,String.class);
		Object obj = con1.newInstance("张三",20,"北京");
		System.out.println(obj);
		System.out.println("-----------------------------------");
		Constructor con2 = c3.getDeclaredConstructor(String.class);
		con2.setAccessible(true);
		Object obj2 = con2.newInstance("李四");
		System.out.println(obj2);
	}

}
