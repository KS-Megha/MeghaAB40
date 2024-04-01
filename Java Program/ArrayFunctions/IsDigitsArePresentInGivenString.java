package ArrayFunctions;

import java.util.Arrays;

public class IsDigitsArePresentInGivenString {

	public static void main(String[] args) {
		int count_of_Digit=0;
        String name = "7896533";
        int size = name.length();
        System.out.println(size);
        
        char[] a1 = name.toCharArray();
        System.out.println(Arrays.toString(a1));
        
        for (int i=0;i<name.length();i++)
        {
        	boolean answer=Character.isDigit(a1[i]);
        	System.out.println(answer);
        	if(answer==true)
        	{
        		count_of_Digit++;
        	}
        }
        int b1 = count_of_Digit;
        System.out.println(b1);
        if(size==b1)
        {
        	System.out.println("the string consists of Digits");
        }
        else
        {
        	System.out.println("the string doesnot consists of Digits");
        }


	}

}
