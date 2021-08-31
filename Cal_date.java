package morning;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cal_date {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String date="15/11/2019";
		Date d=new Date();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date expectedDate = dateFormat.parse(date);
		String day1=new SimpleDateFormat("dd").format(expectedDate);
		String month=new SimpleDateFormat("MMMM").format(expectedDate);
		System.out.println("Date is:"+date);  //
		System.out.println("Day value is:"+day1);  //
		System.out.println("month is:"+month);   //
		String year=new SimpleDateFormat("yyyy").format(expectedDate);

		//System.out.println("Date is:"+date);
		System.out.println("Day value is:"+day1);
		System.out.println("month is:"+month);
		System.out.println("Year is:"+year);


		//System.out.println("Expected month year:"+ expected);
		
		String day = new SimpleDateFormat("dd").format(expectedDate);
		//String month = new SimpleDateFormat("MMMM").format(expectedDate);//
		//String year = new SimpleDateFormat("yyyy").format(expectedDate);//
		
		String expectedMonthYear = month + "" + year;	

	}

}
