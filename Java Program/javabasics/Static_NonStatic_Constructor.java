package javabasics;

public class Static_NonStatic_Constructor {
	static double add()
	{
		double a=1.78;
		double b=8.78;
		System.out.println(a+b);
		return 0;
	}
	void sub()
	{
		int a2=90;
		int b2=60;
		System.out.println(a2-b2);
				
	}
//	Static_NonStatic_Constructor()
//	{
//		System.out.println("hi");
//	}
	public static void main(String[] args) {
		add();
		Static_NonStatic_Constructor s1 = new Static_NonStatic_Constructor();
		s1.sub();
		s1.add();
		
		
	}

}
