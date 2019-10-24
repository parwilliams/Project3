import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import javafx.util.converter.LocalDateStringConverter;

public class DateTimeOne extends MesoDateTimeOneAbstract {

	private static final int CST_CONVERSION = -5 * 60 * 60 * 1000;
	private static final int BST_CONVERSION = 6 * 60 * 60 * 1000;
	private Calendar calendar;
	private int valueOfSecondNow;
	private SimpleDateFormat dateFormat;
	private SimpleDateFormat hourFormat;
	private SimpleDateFormat minuteFormat;
	private SimpleDateFormat hourMinuteFormat;
	private SimpleTimeZone gmt;
	private SimpleTimeZone bst;
	private SimpleTimeZone cst;
	private HashMap<String, String> times = new HashMap<String, String>();
	private GregorianCalendar gmtCalendar;
	private GregorianCalendar bstCalendar;
	private GregorianCalendar cstCalendar;
	private LocalDateTime secondsTime;
	private LocalDate astDate;
	private LocalDate zstDate;
	private	LocalTime astTime;
	private LocalTime zstTime;
	
	public DateTimeOne() {
		calendar = new GregorianCalendar();
		dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm a");
		hourFormat = new SimpleDateFormat("HH");
		minuteFormat = new SimpleDateFormat("mm");
		hourMinuteFormat = new SimpleDateFormat("HH:mm");
		gmt = new SimpleTimeZone(0, "GMT");
		bst = new SimpleTimeZone(BST_CONVERSION, "BST");
		cst = new SimpleTimeZone(CST_CONVERSION, "CST");
		gmtCalendar = new GregorianCalendar(gmt);
		bstCalendar = new GregorianCalendar(bst);
		cstCalendar = new GregorianCalendar(cst);
	}

	public int getValueOfSecond() {
		secondsTime = LocalDateTime.now();
		valueOfSecondNow = secondsTime.getSecond();
		System.out.println("The value of Second now: " + valueOfSecondNow);
		return valueOfSecondNow;
	}

	public void sleepForFiveSec() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("System did not sleep!");
		}
	}

	public void dateTimeNow() {
		// TODO: Print Present Date and Time
		System.out.println("Current Date/Time: " + dateFormat.format(calendar.getTime())); //could need to only have integer for hour, depending
	}

	public void dateTimeOfOtherCity() { //Need Help
		// TODO:Implement Method
		
		//gmtCalendar.computeTime();
		
		/*
		System.out.println(gmtCalendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(bstCalendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(cdtCalendar.get(Calendar.HOUR_OF_DAY));
		*/
		
		System.out.println("Time on Server: " + hourMinuteFormat.format(calendar.getTime()));
		otherCityToString(gmtCalendar, gmt, "");
		otherCityToString(bstCalendar, bst, " (90E)");
		otherCityToString(cstCalendar, cst, " (90W)");
		
		/*System.out.println(timeZoneToString("Time on Server", hourFormat.format(calendar.getTime())));
		System.out.println(timeZoneToString("GMT", hourFormat.format(gmtCalendar.getTime())));
		System.out.println(timeZoneToString("BST", hourFormat.format(bstCalendar.getTime())));
		System.out.println(timeZoneToString("CDT", hourFormat.format(cdtCalendar.getTime())));
		*/
		
		//System.out.println("Time on Server: " + timeFormat.format(calendar.getTime()));
		//System.out.println("GMT: " + timeFormat.format(gmtCalendar.getTime()));
		//System.out.println("BST (90E): " + timeFormat.format(bstCalendar.getTime()));
		//System.out.println("CDT (90W): " + timeFormat.format(cdtCalendar.getTime()));
	}
	
	private void otherCityToString(Calendar calendar, TimeZone timezone, String degrees) {
		System.out.print(timezone.getID() + degrees + ": ");
		System.out.println(findHour(calendar, timezone) + ":" + findMinute(calendar, timezone));
	}

	
	public void dateTimeDifferentZone() {
		// TODO:Implement Method
		times.put("GMT", dateTimeDifferentZoneToString(gmtCalendar, gmt));
		times.put("BST", dateTimeDifferentZoneToString(bstCalendar, bst));
		times.put("CST", dateTimeDifferentZoneToString(cstCalendar, cst));
		System.out.println(times.get("GMT"));
		System.out.println(times.get("BST"));
		System.out.println(times.get("CST"));
	}

	private String dateTimeDifferentZoneToString(Calendar calendar, TimeZone timezone) {
		String str = timezone.getID() + ": " + findCalendarMonth(calendar, timezone) + "/" + calendar.get(Calendar.DAY_OF_MONTH) + "/"
				+ calendar.get(Calendar.YEAR) + " " + findHour(calendar, timezone) + ":" + findMinute(calendar, timezone);
		return str;
	}
	
	public void timeZoneHashMap() {
		// TODO:Implement Method
		astDate = LocalDate.of(2020, 10, 01);
		astTime = LocalTime.of(19, 59);
		zstDate = LocalDate.of(2018, 11, 05);
		zstTime = LocalTime.of(19, 59);
		
		times.put("AST", localDateAndTimeToString(astDate, astTime, "AST"));
		times.put("ZST", localDateAndTimeToString(zstDate, zstTime, "ZST"));
		
		System.out.println("Print Style 1:");
		System.out.println(times.get("AST"));
		System.out.println(times.get("BST"));
		System.out.println(times.get("CST"));
		System.out.println(times.get("GMT"));
		System.out.println(times.get("ZST"));
		
		HashMap<String, String> times2 = new HashMap<String, String>();
		
		
		
	}
	
	private String localDateAndTimeToString(LocalDate date, LocalTime time, String id) {
		String str = id + ": " + date.getMonthValue() + "/" + date.getDayOfMonth() + "/" + date.getYear() + " " +
						time.getHour() + ":" + time.getMinute();
		return str;
	}
	
	
	
	
	
	
	/*private void timeZoneToString(String timeZoneName, String formatedTime) {
		String str = timeZoneName;
		str = str.concat(": " + formatedTime);
		return str;
		}
	*/
		
	private String findCalendarMonth(Calendar calendar, TimeZone timezone) {
		String str;
		int month;
		if(calendar.get(Calendar.MONTH) < 9) {
			month = calendar.get(Calendar.MONTH) + 1;
			str = "0" + Integer.toString(month);
			return str;
		}
		else
			month = calendar.get(Calendar.MONTH) + 1;
			str = Integer.toString(month);
			return str;
	}
	
	private String findHour(Calendar calendar, TimeZone timezone) {
		String str;
		if(calendar.get(Calendar.HOUR_OF_DAY) < 10) {
			str = "0" + calendar.get(Calendar.HOUR_OF_DAY);
			return str;
		}
		else
			str = Integer.toString(calendar.get(Calendar.HOUR_OF_DAY));
			return str;
	}
	
	private String findMinute(Calendar calendar, TimeZone timezone) {
		String str;
		if(calendar.get(Calendar.MINUTE) < 10) {
			str = "0" + calendar.get(Calendar.MINUTE);
			return str;
		}
		else
			str = Integer.toString(calendar.get(Calendar.MINUTE));
			return str;
	}
	
}