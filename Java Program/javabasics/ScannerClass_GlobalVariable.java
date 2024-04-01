package javabasics;

import java.util.Scanner;

public class ScannerClass_GlobalVariable {

	public static void main(String[] args) {
		int num1,num2,sum,sub,mul,div,mod;
		Scanner c1= new Scanner(System.in);
		System.out.println("Enter the first number");
		num1=c1.nextInt();
		System.out.println("Enter the second number");
		num2=c1.nextInt();
		c1.close();
		sum=num1+num2;
		System.out.println("Addition of these numbers: "+sum);
		sub=num1-num2;
		System.out.println("Subtraction of these numbers: "+sub);
		mul=num1*num2;
		System.out.println("Multiplication of these numbers: "+mul);
		div=num1/num2;
		System.out.println("Division of these numbers: "+div);
		mod=num1%num2;
		System.out.println("Moduls of these numbers: "+mod);
		
		

	}

}
