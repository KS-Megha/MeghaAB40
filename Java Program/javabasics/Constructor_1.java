package javabasics;

public class Constructor_1 {
	static void add()
	{
		int a1=34;
		int a2=67;
		int sum = a1+a2;
		System.out.println("sum:"+sum);
				
	}
	static void sub()
	{
		int a1=34;
		int a2=67;
		int subtraction = a1-a2;
		System.out.println("sub:"+subtraction);
				
	}

	static void mul()
	{
		int a1=34;
		int a2=67;
		int multi = a1*a2;
		System.out.println("mul:"+multi);
				
	}
	static void div()
	{
		int a1=34;
		int a2=67;
		int division = a1/a2;
		System.out.println("div:"+division);
				
	}
	static int add1()
	{
		int a1=34;
		int a2=78;
		int sum = a1+a2;
		System.out.println("sum:"+sum);
		return 0;
				
	}
	void add2()
	{
		int a3=89;
		int a4=99;
		int sum1=a3+a4;
		System.out.println(a3+a4);
				
	}
	int add3()
	{
		int a3=89;
		int a4=235;
		int sum1=a3+a4;
		System.out.println(a3+a4);
		return 0;
	}
	byte add4()
	{
		int a3=89;
		int a4=76;
		int sum1=a3+a4;
		System.out.println(a3+a4);
		return 0;
				
	}
	short add5()
	{
		int a3=89;
		int a4=345;
		int sum1=a3+a4;
		System.out.println(a3+a4);
		return 0;

}
	boolean add6()
	{
		int a3=23;
		int a4=90;
		int sum1=a3+a4;
		System.out.println(a3+a4);
		return true;
		
}
	public static void main(String[] args) {
		Constructor_1 c1=new Constructor_1();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
		c1.add1();
		c1.add2();
		c1.add3();
		c1.add4();
		c1.add5();
		c1.add6();
		
		
		
	}
}
