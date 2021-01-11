package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Format2 {

	public static void main(String[] args) {
		Date day =Calendar.getInstance().getTime();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-EEEE HH:mm:ss");
		System.out.println(format.format(Calendar.getInstance().getTime()));
		try {
			format = new SimpleDateFormat("yyyy-MM-dd");
			Date date = format.parse("2019-03-04");
			System.out.println(date.getYear()+1900);
			System.out.println(date.getMonth());
			System.out.println(date.getDay());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}







