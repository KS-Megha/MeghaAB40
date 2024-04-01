package javabasics;
class parent_class
{
	void add()
	{
		System.out.println("adding 3 numbers");
	}
}

public class Method_Overriding extends parent_class
{
	void add()
	{
		super.add();
		
		System.out.println("adding 2 numbers");
	}


	public static void main(String[] args) {
		Method_Overriding m1 = new Method_Overriding();
		m1.add();
		
}

	}
	
