package StringFunctions;

import java.util.Date;

public class TimeZone {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		
		String currenttime = d2.toString();
		System.out.println(currenttime);
		Date future_time = new Date (d1.getTime()+(1000*60*60*24*10));
		System.out.println(future_time);
		

		
		String month = currenttime.substring(4, 7);
		System.out.println(month); //which will print only month
		
		String date = currenttime.substring(8, 10);
		System.out.println(date);   //prints only year
		
		String year = currenttime.substring(24);
		System.out.println(year);
		
		String Time = currenttime.substring(11,20);
		System.out.println(Time);
		
		String region = currenttime.substring(20,23);
		System.out.println(region);
		
		System.out.println(month.concat(date).concat(year));
		System.out.println(month.concat(" ").concat(date).concat(" ").concat(year));
		
		

	}

}

