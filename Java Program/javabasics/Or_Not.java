package javabasics;

public class Or_Not {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int sum = (a+b);
		System.out.println(sum);
		if (!(sum==c || sum==a)){
			System.out.println("print 1");
		}
		else {
			System.out.println("print 3");
		}
	}

}
