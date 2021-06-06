package date6june2021;

public class SampleClass {
	
	public String name;
	public int year;
	public static String sName;
	
	public SampleClass(String var) {
		System.out.println("Constructor - 1");
	}
	
//	public SampleClass(String var, int n) {
//		System.out.println("Constructor - 2");
//	}
//	
	
	public void method1() {
		System.out.println("I am method - 1");
	}
	
	private void method2() {
		System.out.println("I am method - 2");
	}
	
	void method3(String value) {
		System.out.println("Value passed from call: " + value);
	}
	
	
	public static void staticMethod1() {
		System.out.println("I am static method - 1");
	}
	
	public static void staticMethod2(int number) {
		System.out.println("Received value: " + number);
	}

}
