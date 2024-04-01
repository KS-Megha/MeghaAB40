package StringFunctions;

public class Trim {

	public static void main(String[] args) {
		{ 
	        // String declared 
	        String s1 = "   Geeks For Geeks   "; 
	  
	        // Before Trim() method 
	        System.out.println("Before Trim() - "); 
	        System.out.println("String - " + s1); 
	        System.out.println("Length - " + s1.length()); 
	  
	        // applying trim() method on string s1 
	        String s2 = s1.trim(); 
	     // After Trim() method 
	        System.out.println("\nAfter Trim() - "); 
	        System.out.println("String - " + s2); 
	        System.out.println("Length - " + s2.length()); 
	  
	          // Comparing both the strings 
	        if (s1 == s2) { 
	            System.out.println("\nEqual"); 
	        } 
	        else { 
	            System.out.println("\nNot Equal"); 
	        } 
	    } 
	}
}
	
	  
    



