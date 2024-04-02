package TypeCasting;

public class MathClass_Program {

	public static void main(String[] args) 
	{
		double pivalue = Math.PI;
		System.out.println(pivalue);
		System.out.println(Math.addExact(100, 90));
		System.out.println(Math.subtractExact(100, 900));
		System.out.println(Math.multiplyExact(10, 9));
		System.out.println(Math.max(67.90, 34.89));
		System.out.println(Math.min(90.8, 56.23));
		System.out.println(Math.max(1000, 2000));
		System.out.println(Math.max(89, 100));
		System.out.println(Math.min(89.56, 45.90));
		System.out.println(Math.min(89.78, 34.78));
		
		for (int i=0; i<10;i++)
		{
			System.out.println(Math.random());
		}
    System.out.println(Math.sqrt(100));


	}

}
