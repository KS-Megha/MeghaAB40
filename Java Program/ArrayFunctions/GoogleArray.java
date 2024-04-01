package ArrayFunctions;

import java.util.Arrays;

public class GoogleArray {

	public static void main(String[] args) {
		int [] a1 = new int [3];
		int [] b1 = new int[3];
		
		a1[0]=50;
		a1[1]=22;
		a1[2]=67;
		System.out.println(Arrays.toString(a1));
		b1[0]=78;
		b1[1]=90;
		
		b1[2]=34;
		System.out.println(Arrays.toString(b1));
		int[] c1 = {a1[0],a1[1],a1[2],b1[0],b1[1], b1[2]};
		System.out.println(Arrays.toString(c1));

		

	}

}
