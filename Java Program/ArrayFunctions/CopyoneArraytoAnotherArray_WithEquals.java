package ArrayFunctions;

import java.util.Arrays;

public class CopyoneArraytoAnotherArray_WithEquals {

	public static void main(String[] args) {
      int[] a1 =new int[4];
      int[] b1 = new int[4];
      a1[0]=12;
      a1[1]=90;
      a1[2]=78;
      a1[3]=45;
      for(int i=0;i<a1.length;i++)
      {
    	  b1[i]=a1[i];
      }
      System.out.println("The first array is " + Arrays.toString(a1));
      System.out.println("The copied array is " + Arrays.toString(b1));
      
      boolean a3 = Arrays.equals(a1, b1);
      if(a3==true)
      {
    	  System.out.println("two arrays are equals to eachother");
      }
      else
      {
    	  System.out.println("two arrays are not equals to eachother");
      }


	}

}
