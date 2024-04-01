package javabasics;

import java.util.*;

public class Scanner_Class_LocalVariable {
	 static void add(int add1, int add2)
	   {
	      int addition;
          addition = add1 + add2;
	      System.out.println("Addition of two numbers : " + addition);
	   }
	 static void sub(int sub1, int sub2)
	   {
	      int subtraction; 
          subtraction = sub1 - sub2;
	      System.out.println("Subtraction of two numbers : " + subtraction);
	   }
	
	  static void mul(int mul1, int mul2){
	      int multiplication; 
          multiplication = mul1 * mul2;
	      System.out.println("multiplication of two numbers : " + multiplication);
	   }
	 static void div(int div1, int div2){
	      int division; 
          division = div1 / div2;
	      System.out.println("division of two numbers : " + division);
	   }
	 static void mod(int mod1, int mod2){
	      int moduls; 
        moduls = mod1 % mod2;
	      System.out.println("Moduls of two numbers : " + moduls);
	   }
		public static void main(String[] args) {
			Scanner s1=new Scanner(System.in);
			int     number1, number2; 
		      
		      System.out.print("Enter first integer : ");
		      number1 = s1.nextInt();
		      System.out.print("Enter second integer : ");
		      number2 = s1.nextInt();
		      add(number1, number2);
		      sub(number1, number2);
		      mul(number1, number2);
		      div(number1, number2);
		      mod(number1, number2);
		}




}
