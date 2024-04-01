package javabasics;
interface Google_Auth
{
	void login();
	void registration();
}


public class Interface_Class implements Google_Auth 
{
	static void methodname()
	{
		System.out.println("print 1");
	}
	public static void main(String[] args) 
	{
		Interface_Class I1 = new Interface_Class();
		I1.login();
		I1.registration();
		methodname();
		
	}

	@Override
	public void login() {
		System.out.println("print 5");
		
	}

	@Override
	public void registration() {
		System.out.println("print 6");
		
		
	}

}
