package ArrayFunctions;

import java.util.Scanner;

public class Divisibleby3_and_5 {
	public static void main(String[] args) {


        Scanner s1 = new Scanner(System.in);
        int a1 = s1.nextInt();
		if(a1%3==0)
		{
			System.out.println("print frog");
		}		else if (a1%5==0)
		{
			System.out.println("print cat");
		}
		if(a1%3==0 && a1%5==0)
		{
			System.out.println("print frog and cat");
		}
		}

}
