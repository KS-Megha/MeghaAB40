package javabasics;

public class And_Not {
public static void main(String[] args) {
	int a=20;
	int b=40;
	int c=40;
	if (!(a==b && b==c )) {
		System.out.println("print 1");
	}
	else {
		System.out.println("print 2");
	}
}
}
