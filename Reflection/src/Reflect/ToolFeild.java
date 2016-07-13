package Reflect;

import java.lang.reflect.Field;

public class ToolFeild {
	public void setProperty(Object obj, String property, Object value)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		Class c = obj.getClass();
		Field field = c.getDeclaredField(property);
		field.setAccessible(true);
		field.set(obj, value);
	}

}
