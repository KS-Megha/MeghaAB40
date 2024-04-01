
public class Access_specifier {
	void main1() {
		System.out.println("print 1");
	}
	private void main2()
	{
		System.out.println("print 2");
	}
	protected void main3()
	{
		System.out.println("print 3");
	}
	public void main4()
	{
		System.out.println("print 4");
	}

	public static void main(String[] args) {
		Access_specifier a1 = new Access_specifier();
		a1.main1();
		a1.main2();
		a1.main3();
		a1.main4();
		
	}

}
