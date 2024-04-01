package ArrayFunctions;

import java.util.Arrays;

public class Numeric_Valuein_String {

	public static void main(String[] args) {
		String name = "Hari45678naksh900^5";
		char[] a1 = name.toCharArray();
		System.out.println(Arrays.toString(a1));
		for (int i=0; i<name.length();i++)
		{
			boolean ans = Character.isDigit(a1[i]);
			System.out.println(ans);
			if(ans==true)
			{
				System.out.println("numeric is presnt at the index = "+i);
			}
			else
			{
				System.out.println("numeric is not present");
			}
		}

 

	}

}
