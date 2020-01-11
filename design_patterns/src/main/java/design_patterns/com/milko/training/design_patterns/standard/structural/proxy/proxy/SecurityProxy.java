package design_patterns.com.milko.training.design_patterns.standard.structural.proxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler{
	
	private Object obj;
	
	public SecurityProxy(Object obj) {
		this.obj = obj;
	}
	
	public static Object newInstance(Object obj) {
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), 
				new SecurityProxy(obj));
	}
	

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result;
		if (method.getName().contains("post")) {
			throw new IllegalAccessException("Posts are currently not allowed");
		} else {
			result = method.invoke(obj, args);	
		}
		return result;
	}

}
