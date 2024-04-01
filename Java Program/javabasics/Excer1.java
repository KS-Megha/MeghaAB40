package javabasics;
public class Excer1 
{
	String name;
	int age;
	double salary;
	void student_details(String manish,int age,double salary)
	{
		
		System.out.println("I am "+name + " and my age is "+ age + " and my heavy salary is "+ salary);
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	public static void main(String[] args) 
	{
		Excer1 e1=new Excer1();
		e1.student_details("Ram", 21, 98765.98);
		System.out.println(e1.name); //null
		System.out.println(e1.age);//0
		System.out.println(e1.salary);//o.o
	}

}
