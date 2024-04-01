package javabasics;

import java.util.Scanner;

public class SwitchCase_ScannerClass {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		 int num = s1.nextInt();
		 switch(num)
		 {
		 case 1:
			 System.out.println("logic 1");
			 break;
		 case 2:
			 System.out.println("logic 2");
			 break;
		 case 3:
			 System.out.println("logic 3");
			 break;
			 default:
				 System.out.println("we dont have logic");
		 }
		
	}

}
