package javabasics;
abstract class Twitter
{
	abstract void Registration();
	abstract void SignUp();
	void add()
	
	{
		int a= 10;
		int b= 20;
		int sum =a+b;
		System.out.println("Addition of two numbers is:"+sum);
		
	}
}
abstract class facebook
{
	abstract void CreateAccount();
	abstract void Login();
}


  class Concrete extends Twitter {
	abstract class Gmail
	{
		abstract void SignIn();
		abstract void logout();
	}
	abstract class Insta
	{
		abstract void TakePictures();
		abstract void LikePictures();
		
	
	void subtract()
	{
		int a1 = 90;
		int a2 = 80;
		int sub = a1 - a2;
		System.out.println("Subtraction of two numbers:"+ sub);
		
	}
	}
	
	public class Abstract_Class extends Gmail
	{

		@Override
		void SignIn() 
		{
			
			System.out.println("SignIn logic");
		}

		@Override
		void logout() 
		{

          System.out.println("Logout Logic");
			
		}
		
	}

	public static void main(String[] args) {
		Concrete c1 = new Concrete();
		c1.Registration();
		c1.SignUp();
		c1.add();
		}

	@Override
	void Registration() 
	{

     System.out.println("Registration logic");
		
	}

	@Override
	void SignUp() 
	{
		System.out.println("SignUp Logic");
		
	}

  }
