package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MethodDemo {

	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("Reflect.Person");
		
		Method[] m1 = c1.getMethods();
		for(Method m : m1){
			System.out.println(m);
		}
		System.out.println("-----------------------------------------");
		Method[] m2 = c1.getDeclaredMethods();
		for(Method m : m2){
			System.out.println(m);
		}
		System.out.println("-----------------------------------------");
		
		Constructor con = c1.getConstructor();
		Object obj = con.newInstance();
		Method m4 = c1.getDeclaredMethod("show");
		m4.setAccessible(true);
//		Method m3 = c1.getDeclaredMethod();
		m4.invoke(obj);
		System.out.println("-----------------------------------------");
		Method m3 = c1.getMethod("method", String.class);
		m3.invoke(obj, "ÍõÎå");
		
	}

}
