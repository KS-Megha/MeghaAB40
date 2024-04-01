package ArrayFunctions;

import java.util.Arrays;

public class CalculateNum_NumericValues {

	public static void main(String[] args) {
		int count_of_numeric=0;
        String name = "123Megha*&%^#KS)(!";
        char[] a1 = name.toCharArray();
        System.out.println(Arrays.toString(a1));
        for (int i =0;i<name.length();i++)
        {
        	 boolean ans1 = Character.isDigit(a1[i]);
        	 System.out.println(ans1);
        	 if (ans1==true)
        	 {
        		 count_of_numeric++;
        	 }
        }
        System.out.println(count_of_numeric);
        
  
	}

}
