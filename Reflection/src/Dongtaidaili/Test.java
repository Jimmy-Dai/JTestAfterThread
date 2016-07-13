package Dongtaidaili;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		MyInvocationHandler handler = new MyInvocationHandler(ud);
		// 返回的其实是Object对象
		UserDao proxy = (UserDao) Proxy.newProxyInstance(ud.getClass().getClassLoader(), ud.getClass().getInterfaces(),
				handler);
		proxy.add();
		proxy.delete();
		proxy.update();
		proxy.find();

		System.out.println("----------------------------------------------");

		StudentDao sd = new StudentDaoImpl();
		MyInvocationHandler handler2 = new MyInvocationHandler(sd);
		StudentDao sp = (StudentDao) Proxy.newProxyInstance(sd.getClass().getClassLoader(),
				sd.getClass().getInterfaces(), handler2);
		sp.login();
		sp.register();
	}
}
