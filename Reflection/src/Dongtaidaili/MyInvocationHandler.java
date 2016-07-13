package Dongtaidaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private Object target;

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//校验代码略
		System.out.println("校验");
		Object result = method.invoke(target, args);
		//日志代码略
		System.out.println("日志");
		System.out.println("----");
		return result;
	}

}
