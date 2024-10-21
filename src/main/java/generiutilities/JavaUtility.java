package generiutilities;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class JavaUtility {

	
	public int generateRandomNum(int limit)
	{
		Random random= new Random();
		return random.nextInt(limit);
	}
	
	public Object convertStringToAnyDataType(DataType datatype, String value)
	{
		Object obj=null;
		if(datatype.toString().equalsIgnoreCase("int"))
			obj = Integer.parseInt(value);
		else if(datatype.toString().equalsIgnoreCase("long"))
			obj = Long.parseLong(value);
		else if(datatype.toString().equalsIgnoreCase("double"))
			obj = Double.parseDouble(value);
		else if(datatype.toString().equalsIgnoreCase("boolean"))
			obj = Boolean.parseBoolean(value);
		else
			System.out.println("invaild  data type");
		return obj;
	}
	public String getcurrentTime()
	{
		Date date = new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yy_hh-mm-ss");
		return sdf.format(date);
		
	}
	public void await (long time)
	{
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public int convertMonthToNum(String monthName) {
		return DateTimeFormatter
				.ofPattern("MMMM")
				.withLocale(Locale.ENGLISH)
				.parse(monthName)
				.get(ChronoField.MONTH_OF_YEAR);
	}
}
