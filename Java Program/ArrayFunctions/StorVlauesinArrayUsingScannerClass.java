package ArrayFunctions;

import java.util.Arrays;
import java.util.Scanner;

public class StorVlauesinArrayUsingScannerClass {

	public static void main(String[] args) {
       int[] number = new int[5];
       Scanner s1 = new Scanner(System.in);
       int a1 = s1.nextInt();
       number[0]=a1;
       int a2 = s1.nextInt();
       number[1]=a2;
       int a3 = s1.nextInt();
       number[2]=a3;
       int a4 = s1.nextInt();
       number[3]=a4;
       int a5 = s1.nextInt();
       number[4]=a5;
       Arrays.sort(number);
       System.out.println(Arrays.toString(number));
       


	}

}
