package javabasics;
interface parent1
{
	void Registration();
	void SingUp();
}
interface parent2
{
	void login();
	void logout();
}
interface parent3
{
	void fillform();
	void Submit();
}
interface parent4
{
	void verified_details();
	void Execution();
	
}

public class multilevelInheritance implements parent1,parent2,parent3,parent4
{

	public static void main(String[] args) {
		multilevelInheritance m1 = new multilevelInheritance();
		m1.verified_details();
		m1.Execution();
		m1.fillform();
		m1.Submit();
		m1.login();
		m1.logout();
		m1.Registration();
		m1.SingUp();
		}
   public void verified_details() {

      System.out.println("verified details correctly");
		
	}

	@Override
	public void Execution() {

     System.out.println("Execution passed");
		
	}

	@Override
	public void fillform() {

     System.out.println("filled the form accurately");
		
	}

	@Override
	public void Submit() {

     System.out.println("submitted the details on time");
		
	}

	@Override
	public void login() {

      System.out.println("logged in successfully");
		
	}

	@Override
	public void logout() {

      System.out.println("not logged up yet");
		
	}

	@Override
	public void Registration() {

      System.out.println("Registration done successfully");
		
	}

	@Override
	public void SingUp() {

       System.out.println("signed up with correct username and password");
		
	}

}
