package ArrayFunctions;

import java.util.Arrays;

public class IndexOutOfboundException {

	public static void main(String[] args) {
		int age[] = new int[3];
		age[0]=1;
		age[1]=2;
		age[2]=4;
		age[3]=5;
		age[4]=6;
		System.out.println(Arrays.toString(age));
		
		
		}

}
