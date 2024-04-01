package javabasics;

import java.util.Scanner;

public class AreaOfACircle {

	public static void main(String[] args) {
		for (int i=1;i<=10;i++) {
		int r;
		final double pi=3.14,area;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the radius of a circle:");
		r=s.nextInt();
		area = pi * r * r;
		System.out.println("Area of a circle:"+area);
		
		

	}

}
}
