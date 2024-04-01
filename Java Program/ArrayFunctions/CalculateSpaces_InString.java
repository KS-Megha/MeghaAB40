package ArrayFunctions;

import java.util.Arrays;

public class CalculateSpaces_InString {

	public static void main(String[] args) {
		int count_of_spaces = 0;
		String name = "Megha Shastry Hari Naksh Nibha 7897 &*^%";
		char[] a1= name.toCharArray();
		System.out.println(Arrays.toString(a1));
		for ( int i=0;i<name.length();i++)
		{
			boolean b1 = Character.isSpaceChar(a1[i]);
			System.out.println(b1);
			if(b1==true)
			{
				count_of_spaces++;
			}
		}
		System.out.println("the number of spaces present in the given string is "+count_of_spaces);

	}

}
