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
		//У�������
		System.out.println("У��");
		Object result = method.invoke(target, args);
		//��־������
		System.out.println("��־");
		System.out.println("----");
		return result;
	}

}
