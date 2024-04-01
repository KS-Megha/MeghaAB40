package ArrayFunctions;

public class Segragegation_of_0_and_1 {
	static void segregating0sand1s(int arr[], int n)
	{
		int count = 0; // to count the no of zeros in arr
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0)
				count++;
             }
 
		for (int i = 0; i < count; i++)
			arr[i] = 0; // loop to fill the arr with 0 until count
		for (int i = count; i < n; i++)
			arr[i] = 1; // loop to fill remaining arr space with 1
	}
	
	static void print(int arr[], int n)
	{
		System.out.print("Array after segregating 0s and 1s is ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
	
	// driver function
	public static void main(String[] args)
	{
		int arr[] = new int[]{ 1, 1, 0, 0, 1, 1 };
		int n = arr.length;
		segregating0sand1s(arr, n);
		print(arr, n);
		
	}
}

