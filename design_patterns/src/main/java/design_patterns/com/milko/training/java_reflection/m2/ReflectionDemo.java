package design_patterns.com.milko.training.java_reflection.m2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		String personClassName = "design_patterns.com.milko.training.java_reflection.m2.model.Person";
		Class<?> personClass = Class.forName(personClassName);
		
		System.out.println("\nPerson class = " +  personClass);
		
		Field[] fields = personClass.getFields();
		System.out.println("\nFields: ");
		System.out.println(Arrays.toString(fields));
		
		Field[] declaredFields = personClass.getDeclaredFields();
		System.out.println("\nDeclaredFields: ");
		System.out.println(Arrays.toString(declaredFields));
		
		System.out.println("\nMethods:");
		Method[] methods = personClass.getMethods();
		for (Method method: methods) {
			System.out.println(method);		
		}
		
		System.out.println("\nDeclared Methods:");
		Method[] declaredMethods = personClass.getDeclaredMethods();
		for (Method method: declaredMethods) {
			System.out.println(method);
		}
		
		System.out.println("\nStatic Declared Methods:");
		Arrays.stream(declaredMethods)
			.filter(m -> Modifier.isStatic(m.getModifiers()))
			.forEach(System.out::println);
		

	}

}
