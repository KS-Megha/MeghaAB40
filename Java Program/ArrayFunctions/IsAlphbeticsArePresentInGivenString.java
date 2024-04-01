package ArrayFunctions;

import java.util.Arrays;

public class IsAlphbeticsArePresentInGivenString {

	public static void main(String[] args) {
		int count_of_alphabets=0;
       String name = "HarinakshShasty";
       int size = name.length();
       System.out.println(size);
       
       char[] a1 = name.toCharArray();
       System.out.println(Arrays.toString(a1));
       
       for (int i=0;i<name.length();i++)
       {
    	   boolean ans = Character.isAlphabetic(a1[i]);
    	   System.out.println(ans);
    	   if(ans==true)
    	   {
    		   count_of_alphabets++;
    	   }
       }
       int b1 = count_of_alphabets;
       System.out.println(b1);
       if(size==b1)
       {
    	   System.out.println("Alphabets are present in the string");
       }
       else
       {
    	   System.out.println("Alphabets are not present in the string");
       }


	}

}
