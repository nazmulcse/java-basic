import java.text.*;

public class UtilToSqlDateConversion{
	public static void main(String[] args){
		java.util.Date utilDate = new java.util.Date();
		System.out.println("java.util.Date is: " + utilDate);
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());	// Conver util date to SQL formated date
		System.out.println("java.sql.Date is: " + sqlDate);
		// Formate a util date to any format
		DateFormat df = new SimpleDateFormat("dd-MM-YYYY");
		System.out.println("dateFormated date is : " + df.format(utilDate));
	}
}
