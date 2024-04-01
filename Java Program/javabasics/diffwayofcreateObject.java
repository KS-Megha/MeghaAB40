package javabasics;

public class diffwayofcreateObject {
	public int m1()
	{
		System.out.println("8");
		return 0;
	}
	 static float m3()
	{
		System.out.println("10");
		return 0;
	}
	 void m4()
	 {
		 System.out.println(45);
	 }
	 private void m5()
	 
	 {
		 System.out.println(78);
	 }
	 protected boolean m6()
	 {
		 System.out.println("hi");
		 return true;
	 }
	 diffwayofcreateObject()
	 {
		 System.out.println("this is my constructor");
	 }

	public static void main(String[] args) {
		 new diffwayofcreateObject();
//		 new diffwayofcreateObject().m3();
//		 new diffwayofcreateObject().m4();
//		 new diffwayofcreateObject().m5();
//		 new diffwayofcreateObject().m6();
//		

	}

}
