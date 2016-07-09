package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class FieldDemo {

	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("Reflect.Person");
		
		Field[] f1 = c1.getFields();
		for(Field f : f1){
			System.out.println(f);
		}
		System.out.println("--------------------------------------");
		Field[] f2 = c1.getDeclaredFields();
		for(Field f : f2){
			System.out.println(f);
		}
		System.out.println("--------------------------------------");
		
		Field f = c1.getField("address");
		Constructor con1 = c1.getConstructor();
//		con1.setAccessible(true);
		Object obj = con1.newInstance();
		f.set(obj,"…œ∫£");
		System.out.println(obj);
		

	}

}
