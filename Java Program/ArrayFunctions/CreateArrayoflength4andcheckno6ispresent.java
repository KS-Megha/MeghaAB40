package ArrayFunctions;

public class CreateArrayoflength4andcheckno6ispresent {

	public static void main(String[] args) {
         int age[]= new int[5];
         age[0]=23;
         age[1]=89;
         age[2]=78;
         age[3]=6;
         age[4]=40;
         int check_no = 6;
         for (int i=0;i<age.length;i++)
         {
        	 
        	 if(age[i]==check_no)
        	 {
        		 System.out.println("we found the number " + check_no + " at the index position of " +i);
        	 }
        	 else
        	 {
        		 System.out.println("we didnot found the number " + check_no + " at the index position of " +i);
        	 }
        		 
         }


	}

}
