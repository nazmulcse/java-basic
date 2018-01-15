import java.text.*;
import java.util.*;
import java.time.*;

public class UtilToSqlDateConversion{
	public static void main(String[] args){
		java.util.Date utilDate = new java.util.Date();
		System.out.println("java.util.Date is: " + utilDate);
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());	// Conver util date to SQL formated date
		System.out.println("java.sql.Date is: " + sqlDate);
		// Formate a util date to any format
		DateFormat df = new SimpleDateFormat("dd-MM-YYYY");
		System.out.println("dateFormated date is : " + df.format(utilDate));
		LocalDate ldate = LocalDate.now();
		System.out.println("Local Date is: " + ldate);
		// Creates a date from values
		System.out.println("Another Local Date is: " + LocalDate.of(2017,12,15));
		// Create a date form string
		System.out.println("Date from string : " + LocalDate.parse("2018-01-15"));
		// creates a date from zone
		System.out.println("Another local date from zone: " + LocalDate.now(ZoneId.systemDefault()));
	}
}
