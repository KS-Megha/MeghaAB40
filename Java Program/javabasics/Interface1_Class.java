package javabasics;
interface College_name
{
	void GlobalCol();
	void RNSITCol();
}

abstract class one implements College_name
{
	abstract void sirname();
	abstract void studentname();
	static void princialname()
	{
		System.out.println("Principal name is shastry");
	}
}

public class Interface1_Class extends one  {
	
	static void DegreeCol()
	{
		System.out.println("Degree col name is MLA");
	}

	public static void main(String[] args) 
	{
      
       DegreeCol();
       Interface1_Class I2 = new Interface1_Class();
       I2.GlobalCol();
       I2.RNSITCol();
       I2.studentname();
       I2.sirname();
       
       

	}

	@Override
	public void GlobalCol() {

      System.out.println("my col name is Global col");
		
	}

	@Override
	public void RNSITCol() {

		
      System.out.println("My col name is RNSIT");
		
	}

	@Override
	void sirname() {
		System.out.println("my sir name is Shastry");
		
	}

	@Override
	void studentname() {
		System.out.println("my student name is Harinaksh");
		
	}

}
