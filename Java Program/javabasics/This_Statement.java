package javabasics;

public class This_Statement 
{
	   This_Statement()
	{ 
		this('w') ;  
		System.out.println("this calling statement");
	}
	This_Statement(char b)
	{ 
		this("Harinaksh");
		System.out.println("this is my alpha letter");
	}
	This_Statement(String a)
	{ 
		this(20,true,78.90f);
		System.out.println("this is my name");
	}
	This_Statement(int a, boolean w,float d)
	{   
		this(67.45f);
		System.out.println("this is my integer, my boolean and my salary");
	}
	This_Statement(float u)
	{
		this(23, 89);
		System.out.println("this is my float number");
	}
	This_Statement(int a,int b)
	{ 
		
		System.out.println("this is my two numbers");
	}

   public static void main(String[] args) {
		//This_Statement t1 = new This_Statement(30,40);
		new This_Statement();




		
		
		
	}


	
}
	
	
	


