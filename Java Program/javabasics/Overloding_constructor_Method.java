package javabasics;

public class Overloding_constructor_Method {
	void add() {
		System.out.println("my name is ram");
	}
		void add1(int a) {
			System.out.println("my name is sita");
			
		}
		static void mul (String w) {
			System.out.println("print 3");
		}
		void leep(int a, boolean b, String c) {
			System.out.println("print 5");
		}
		void add(char u) {
			System.out.println("print 7");
		}
		public static void main(String[] args) {
			Overloding_constructor_Method over=new Overloding_constructor_Method();
			over.add('H');
			over.mul("Rama");
			over.add1(10);
			over.leep(20, false, "Megha");
			
		}
	}


