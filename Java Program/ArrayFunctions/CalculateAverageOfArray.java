package ArrayFunctions;

public class CalculateAverageOfArray {
	public static void main(String[] args) {
		int a1[] = new int[5];
		a1[0]=2;
		a1[1]=7;
		a1[2]=10;
		a1[3]=40;
		a1[4]=6;
		int sum= 0;
		for (int i=0;i<a1.length;i++)
		{
			sum = sum + a1[i];
		}
		System.out.println(sum);
		 double average = sum/5;
		 System.out.println(average);
	}

}
