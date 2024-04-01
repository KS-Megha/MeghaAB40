package ArrayFunctions;

import java.util.Arrays;

public class CopyoneArraytoAnotherArray_ByIterating {
	public static void main(String[] args) {
		int [] c1 = new int[5];
		int [] c2 = new int[5];
		c1[0]=89;
		c1[1]=8;
		c1[2]=99;
		c1[3]=899;
		c1[4]=9;
		for (int i=0;i<c1.length;i++)
		{
			c2[i]=c1[i];
		}
		System.out.println("the first array is" + Arrays.toString(c1));
		System.out.println("the copied array is" + Arrays.toString(c2));
		
	}

}
