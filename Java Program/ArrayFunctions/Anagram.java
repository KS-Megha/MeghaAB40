package ArrayFunctions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a1 = "reed";
		String a2="deer";
		
		 char[] b1 = a1.toCharArray();
		 System.out.println(Arrays.toString(b1));
		 char [] b2= a2.toCharArray();
		 System.out.println(Arrays.toString(b2));
		 
		 Arrays.sort(b1);
		 System.out.println(Arrays.toString(b1));
		 Arrays.sort(b2);
		 System.out.println(Arrays.toString(b2));
		 
		 boolean a3= Arrays.equals(b1, b2);
		 if(a3==true)
		 {
			 System.out.println("they are anagram");
		 }
		 else 
		 {
			 System.out.println("they ae not anagram");
		 }
		 
		

	}

}
