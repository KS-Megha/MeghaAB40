package TypeCasting;
class Student
{
	void Student_Name()
	{
		System.out.println("Name of the student is : Megha");
	}
	void Student_Number()
	{
		System.out.println("Student phone number is : 98654");
	}
	void Student_Address()
	{
		System.out.println("Student home address is : Mallathalli");
	}
}


public class Upcasting extends Student
{
	 void Information_All()
	 {
		 System.out.println("Information of all the students");
	 }

	public static void main(String[] args) {
		
		Student s1 = new Upcasting();
		s1.Student_Name();
		s1.Student_Number();
		s1.Student_Address();
		System.out.println("--------------");
		Upcasting c1 = (Upcasting) s1;
		c1.Student_Name();
		c1.Student_Number();
		c1.Student_Address();
		c1.Information_All();
	

}

}
