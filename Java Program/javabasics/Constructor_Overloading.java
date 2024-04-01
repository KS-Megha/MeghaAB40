package javabasics;
public class Constructor_Overloading {
	
	void add()
	{
		System.out.println("print 1");
	}
	void sub(char b) {
		System.out.println("print 2");
		
	}
	static void mul (String w) {
		System.out.println("print 3");
	}
	static void div(boolean j) {
		System.out.println("print 4");
	}
	void leep(int a, boolean b, String c) {
		System.out.println("print 5");
	}
	public static void main(String[] args) {
		Constructor_Overloading con = new Constructor_Overloading();
		con.add();
		con.sub('j');
		con.mul("Megha");
		con.div(false);
		con.leep(89,true,"mmm");
				}
		
	}



