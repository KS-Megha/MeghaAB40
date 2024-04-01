package ArrayFunctions;

public class Smallest_Largest_no_in_Array {
	public static void main(String[] args) {
		//int arr[] = {10,20,30,60,67,45};
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=67;
		arr[4]=89;
				
		   int largest = arr[0];
		   int smallest=arr[0];


		   
		   for (int i=0;i<arr.length;i++)
		   {
			   if (smallest>arr[i])
			   {
				   smallest=arr[i];
			   }
			   if(largest<arr[i])
			   {
				   largest=arr[i];
			   }
		   }

	System.out.println("the smallest number is " + smallest);
	System.out.println("the largest number is " + largest);


		}
		   
		
		    
		    
		

	}
		
	
	  

