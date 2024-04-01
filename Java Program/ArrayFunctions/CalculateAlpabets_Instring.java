package ArrayFunctions;

import java.util.Arrays;

public class CalculateAlpabets_Instring {

	public static void main(String[] args) {
		int count_of_alpha=0;
		String name = "Shas89063@56ty9087";
		char[] a1 =name.toCharArray();
		System.out.println(Arrays.toString(a1));
		for (int i=0;i<name.length();i++)
		{
			boolean ans1=Character.isAlphabetic(a1[i]);
			System.out.println(ans1);
			if (ans1==true)
			{
				count_of_alpha++;
			}
		}
		System.out.println("the number of alphabets in the given string is " +count_of_alpha);

	}

}
