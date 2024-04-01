package javabasics;

import java.util.Scanner;

public class CircumferenceOfCircle {

	public static void main(String[] args) {
		int r;
		final double pi=3.14, circum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		r=sc.nextInt();
		circum = 2 * pi * r;
		System.out.println("Circumference of the circle : "+circum);

	}

}
