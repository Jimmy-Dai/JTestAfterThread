package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ArrayDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		Class c = arr.getClass();
		Method m = c.getMethod("add", Object.class);

		// Constructor con = c.getConstructor();
		// Object obj = con.newInstance();
		// 根本不需要创建
		m.invoke(arr, "hello");

		System.out.println(arr);

	}

}
