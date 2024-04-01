package StringFunctions;

public class removeAll {

	public static void main(String[] args) {
         String nam = "Megha";
         String a1 = (nam.replaceAll("[A-Z]", "m"));
         System.out.println(a1);
         String name = "HARInaksh";
         String a2 = (name.replaceAll("[a-z]", " "));
         System.out.println(a2);
         String name1 = "I am6 Student with the Roll number 9";
         String a3=name1.replaceAll("[0-9]"," ");
         System.out.println(a3);
         String input = "I am Megha";
         String a4 = input.replace("Megha", "Manish");
         System.out.println(a4);
         		


        		 


	}

}
