package date6june2021;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Execution {

	public static void main(String[] args) throws Exception, Exception {

		SampleClass sc = new SampleClass("Pune");
		
		//sc.method1();
		
		
		Class cls = sc.getClass();
		
		System.out.println("Name of class: " + cls.getName());
		
		Constructor[] constructor = cls.getConstructors();
		
		for(int i=0; i < constructor.length; i++) {
			System.out.println(constructor[i].getName());
		}
		
		Method[] methods = cls.getMethods();
		
		for(int i=0; i < methods.length; i++) {
			System.out.println(methods[i].getName());
		}
		
		Method m1 = cls.getDeclaredMethod("method1");
		m1.invoke(sc);
		
		Method m2 = cls.getDeclaredMethod("method2");
		m2.setAccessible(true);
		m2.invoke(sc);
		
		Method m3 = cls.getDeclaredMethod("method3", String.class);
		m3.invoke(sc, "Reflection.....!!!!");
		
		
	}

}
