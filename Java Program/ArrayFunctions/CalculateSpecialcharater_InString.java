package ArrayFunctions;

import java.util.Arrays;

public class CalculateSpecialcharater_InString {

	public static void main(String[] args) {
		int count_of_alpha=0;
		int count_of_numeric=0;
		String name = "123Megha*&%^#KS)(!";
		int size = name.length();
		System.out.println(size +"-->lenght of the given string");
        char[] a1 = name.toCharArray();
        System.out.println(Arrays.toString(a1));
        for (int i =0;i<name.length();i++)
        {
        	 boolean ans1 = Character.isDigit(a1[i]);
        	 //System.out.println(ans1);
        	 if (ans1==true)
        	 {
        		 count_of_numeric++;
        	 }
        }
        System.out.println(count_of_numeric +"--->number of numberic value in the string");
        for (int j =0;j<name.length();j++)
        {
        	 boolean ans2 = Character.isAlphabetic(a1[j]);
        	 //System.out.println(ans2);
        	 if (ans2==true)
        	 {
        		 count_of_alpha++;
        	 }
        }
        System.out.println(count_of_alpha +"--->number of letters in the string");
        int c1=count_of_numeric+count_of_alpha;
        System.out.println(c1 + "-->addition of numbers and letters");
        int specialcharacter=size-c1;
        System.out.println(specialcharacter +"--> number of special character in a given string");
  
	}
}
