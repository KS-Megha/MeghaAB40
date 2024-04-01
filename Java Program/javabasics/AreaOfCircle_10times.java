package javabasics;

import java.util.Scanner;

public class AreaOfCircle_10times {
	public static void main(String[] args) {
		for ( int i=1;i<=10;i++) {
			int r;
			final double pi = 3.14, area;
			Scanner s1= new Scanner(System.in);
			System.out.println("Enter the radius of the circle");
			r = s1.nextInt();
			area= pi * r * r;
			s1.close();
			System.out.println("Area of the circle is:" +area);
			
			
			
		}
		
	}
	
	
	}



