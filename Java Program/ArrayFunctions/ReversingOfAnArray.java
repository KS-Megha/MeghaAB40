package ArrayFunctions;

import java.util.Arrays;

public class ReversingOfAnArray {
	public static void main(String[] args) {
		int[] num1= new int[5];
		int[] num2 = new int[5];
		num1[0]=23;
		num1[1]=89;
		num1[2]=80;
		num1[3]=8;
		num1[4]=49;
		int k = num2.length-1;
		for (int i=0;i<num1.length;i++)
		{
			num2[k]=num1[i];
			k--;
		}
		System.out.println("the first array is " + Arrays.toString(num1));
		System.out.println("the reversed array is " + Arrays.toString(num2));
		
	}

}
