package ArrayFunctions;

public class ExceptionHandling_1 {

	public static void main(String[] args) {
		try
		{
		int [] arr = new int[3];
		arr[0]=21;
		arr[1]=67;
		arr[2]=23;
		arr[3]=67;
		arr[4]=90;
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("I have handled the exception");
			
		}
		
		
		



	}

}
