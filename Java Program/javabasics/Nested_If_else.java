package javabasics;

public class Nested_If_else {
	public static void main(String[] args) {
		   int age = 19; // Customer's age
	        boolean isWeekend = false; // Is it a weekend?
		if (age  <  13) {
            if (isWeekend=true) {
                System.out.println("Ticket Price: Rs. 120");
            } else {
                System.out.println("Ticket Price: Rs. 100");
            }
        } else if (age  < 64) {
            if (isWeekend=false) {
                System.out.println("Ticket Price: Rs. 180");
            } else {
                System.out.println("Ticket Price: Rs. 150");
            }
        } else {
        	 if (isWeekend) {
                 System.out.println("Ticket Price: Rs. 150");
             } else {
                 System.out.println("Ticket Price: Rs. 130");
             }
         }
     }
 }
        