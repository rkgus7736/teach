package date;

import java.util.Calendar;

public class Date3 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar endOfYear = Calendar.getInstance();
		Calendar christmas = Calendar.getInstance();
		
		endOfYear.set(Calendar.MONTH, 11);
		endOfYear.set(Calendar.DAY_OF_MONTH, 31);
		long diff = endOfYear.getTimeInMillis() - today.getTimeInMillis();
		System.out.println(diff/(1000*60*60*24)+"일");
		
		christmas.set(Calendar.MONTH, 11);
		christmas.set(Calendar.DAY_OF_MONTH, 25);
		diff = christmas.getTimeInMillis() - today.getTimeInMillis();
		System.out.println(diff/(1000*60*60*24)+"일");
		
	}

}





