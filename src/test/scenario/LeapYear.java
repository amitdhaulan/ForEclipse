package test.scenario;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class LeapYear {
	public static void main(String[] args) {
		int number_of_days = 0;
		int end_year = 2015, start_year = 1970;
		int end_month = 1, start_month = 8;
		double timeDifference = 0;
		
		Date end_time = new java.util.Date();
		String myFormat = "MM/dd/yyyy HH:mm:ss";
		
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
        
        System.out.println("end\t: "+sdf.format(end_time.getTime()));
        
        
        Date start_time = new java.util.Date();
        start_time.setTime(474543423);
        System.out.println("start\t: "+sdf.format(start_time.getTime()));
        
        
        
        
       
        timeDifference = end_time.getTime() - start_time.getTime();
        
        /*int days = (int)((timeDifference/(60*60*1000))/24);*/
        
        timeDifference = 31622400000.0;
        
        int days = (int)((timeDifference/(60*60*1000))/24);
       		
        int years = (days/30)/12+1;
		System.out.println("years: "+years);
		
        System.out.println(days);
		
		
		
		
		
		
		
		
		/*boolean leap_or_not = false;
		int year = 2016;
		int days = 495;
		int numberofdays = 0;
		int numberofyears = 0;

		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			leap_or_not = true;
		} else {
			leap_or_not = false;
		}

		if (leap_or_not) {
			numberofdays = days - 366;
			numberofyears = days / 366;
		} else {
			numberofdays = days - 365;
			numberofyears = days / 365;
		}*/

	/*	System.out.println(leap_or_not);
		System.out.println("days "+numberofdays);
		System.out.println("year "+numberofyears);*/

	}
	
	public static boolean isLeap(int year){
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			return true;
		} else {
			return false;
		}
	}
}
