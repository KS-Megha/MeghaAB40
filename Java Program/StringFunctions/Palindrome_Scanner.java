package StringFunctions;

import java.util.Scanner;

public class Palindrome_Scanner {

	public static void main(String[] args) {
	    Scanner s1 = new Scanner(System.in);
	    String a1 = s1.next();
	    String output = "";
	    for ( int i=a1.length()-1;i>=0;i--)
	    {
	    	char rev = a1.charAt(i);
	    	output = output +rev;
	    }
	    System.out.println(output);
	    if(a1.equals(output))
	    {
	    	System.out.println("its a palindrome");
	    }
	    else
	    {
	    	System.out.println("its not a palindrome");
	    }
	}

}
