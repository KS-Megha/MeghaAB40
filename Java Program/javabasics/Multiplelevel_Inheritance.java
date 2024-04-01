package javabasics;
class FirstClass
{
    static void first()
    {
    	System.out.println("Fist class");
    }
}
class SecondClass extends FirstClass
{
	static void add()
	{
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println("adition of two numbers:"+ c);
	}
}
class ThirdClass extends SecondClass
{
	static void sub()
	{
		int a1= 90;
		int b2= 40;
		int sub = a1-b2;
		System.out.println("substraction of two numbers:" +sub);
	}
}
class FourthClass extends ThirdClass
{
	static void multiplication()
	{
		int x=78;
		int y=90;
		int mul = x*y;
		System.out.println("multi of two numbers is :"+mul);
	}
}
class FifthClass extends FourthClass
{
	static void modulus()
	{
		int c = 89;
		int d = 45;
		int mod = c/d;
		System.out.println("modu of two numbers is :"+ mod);
				
	}
}

public class Multiplelevel_Inheritance extends FifthClass {

	public static void main(String[] args) {
		first();
		add();
		sub();
		multiplication();
		modulus();
		
		
		
		



	}

}
