package date6june2021;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import jdk.internal.dynalink.beans.StaticClass;

public class Execution1 {

	public static void main(String[] args) throws Exception, Exception {

		
	Class cls =	SampleClass.class;
	
	Method[] methods = cls.getMethods();
	
	for(int i=0; i < methods.length; i++) {
		System.out.println(methods[i].getName());
	}
	
	Method m1 = cls.getDeclaredMethod("staticMethod1");
	m1.invoke(cls);
	
	Method m2 = cls.getDeclaredMethod("staticMethod2", int.class);
		m2.invoke(SampleClass.class, 1000);
		
	
	Field[] fields = cls.getFields();
	System.out.println(fields.length);
	for(int i=0; i < fields.length; i++) {
		System.out.println(fields[i].getName());
	}
	
	}
	
	

}
