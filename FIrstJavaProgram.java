package com.example;

public class FIrstJavaProgram {

	int a = 10;//instance variable
	static int b = 20;
	static int c = 10;
	int d = 30;
	
	int add() {
	return a+b;
		
	}
	static int sub() {
		return b-c;
	}
	
	/*public FIrstJavaProgram(){
		System.out.println("constructor is called");
	}8*/
	
	/*public FIrstJavaProgram(){
		int c = this.a+d;
		System.out.println("addition is-"+c);

	}*/
	
	{
		System.out.println("hello");//instance block
	}	
	
	static {
		System.out.println("static block");
	}
	
	public static void main(String[] args) {
		
		int b = 30;
		StringBuilder s  = new StringBuilder("abcd");
		StringBuilder s1 = new StringBuilder("abcd");
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.equals(s1));
		FIrstJavaProgram obj = new FIrstJavaProgram();
		FIrstJavaProgram obj1 = new FIrstJavaProgram();

		System.out.println(obj.a);
		System.out.println(b);
		System.out.println(obj.add());
		System.out.println(sub());
		System.out.println(obj.equals(obj1));
		//obj.finalize();
		System.out.println(obj.getClass());
		
		System.out.println(obj.getClass().getName());
		
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}
	@Override
	public String toString() {
		return "FIrstJavaProgram [a=" + a + ", d=" + d + "]";
	}
	

}
