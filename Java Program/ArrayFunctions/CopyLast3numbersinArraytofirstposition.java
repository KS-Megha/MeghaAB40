package ArrayFunctions;

import java.util.Arrays;

public class CopyLast3numbersinArraytofirstposition {

	public static void main(String[] args) {
	     int[] a1 = new int[6];
	     int b1 []= new int[6];
	     a1[0]=10;
	     a1[1]=11;
	     a1[2]=12;
	     a1[3]=13;
	     a1[4]=14;
	     a1[5]=15;
	     System.out.println(Arrays.toString(a1));
	     int k = b1.length-1;
//	     int[] b1 = {a1[3],a1[4],a1[5]};
//	     System.out.println(Arrays.toString(b1));
	     for(int i =0;i<a1.length;i++)
	     {
	    	 b1[k]=a1[i];
	         k--;
	    }
	     System.out.println("the first array" + Arrays.toString(a1));
	     System.out.println("the reversed array" + Arrays.toString(b1));
	}

}
