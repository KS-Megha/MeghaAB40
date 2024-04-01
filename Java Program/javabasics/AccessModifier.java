package javabasics;

public class AccessModifier {
	  static void add() {
		  System.out.println("Addition");
	  }
	  static void sub() {
		  System.out.println("subtraction");
	  }
	  static void mul() {
		  System.out.println("multiplication");
	  }
	  static void div() {
		  System.out.println("division");
	  }
	
	  public static void main(String[] args) {
		System.out.println("Access Modifiers:");
		add();
		sub();
		mul();
		div();
		
	}

}
