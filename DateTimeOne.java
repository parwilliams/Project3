import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class DateTimeOne extends MesoDateTimeOneAbstract {

	private static final int CDT_CONVERSION = -5 * 60 * 60 * 1000;
	private static final int BST_CONVERSION = 6 * 60 * 60 * 1000;
	private Calendar calendar;
	private int milliseconds;
	private static final int MILLI_CONVERSION = 1000;
	private int seconds;
	private SimpleDateFormat dateFormat;
	private SimpleDateFormat hourFormat;
	private SimpleTimeZone gmt;
	private SimpleTimeZone bst;
	private SimpleTimeZone cdt;
	private HashMap<String, String> times = new HashMap<String, String>();
	
	public DateTimeOne() {
		calendar = new GregorianCalendar();
		dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm a");
		hourFormat = new SimpleDateFormat("HH:mm");
		gmt = new SimpleTimeZone(0, "GMT");
		bst = new SimpleTimeZone(BST_CONVERSION, "BST");
		cdt = new SimpleTimeZone(CDT_CONVERSION, "CDT");
	}

	public int getValueOfSecond() {
		milliseconds = (int) System.currentTimeMillis();
		seconds = milliseconds / MILLI_CONVERSION;
		return seconds;
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
		System.out.println("Current Date/Time: " + dateFormat.format(calendar.getTime()));
	}

	public void dateTimeOfOtherCity() { //Need Help
		// TODO:Implement Method
		
		GregorianCalendar gmtCalendar = new GregorianCalendar(gmt);
		GregorianCalendar bstCalendar = new GregorianCalendar(bst);
		GregorianCalendar cdtCalendar = new GregorianCalendar(cdt);
		
		//gmtCalendar.computeTime();
		
		/*
		System.out.println(gmtCalendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(bstCalendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(cdtCalendar.get(Calendar.HOUR_OF_DAY));
		*/
		
		System.out.println("Time on Server: " + hourFormat.format(calendar.getTime()));
		otherCityToString(gmtCalendar, gmt, "");
		otherCityToString(bstCalendar, bst, " (90E)");
		otherCityToString(cdtCalendar, cdt, " (90W)");
		
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

	
	
	public void dateTimeDifferentZone() {
		// TODO:Implement Method
		//times.put("GMT", )
		
	}

	public void timeZoneHashMap() {
		// TODO:Implement Method
	}
	
	
	private void otherCityToString(Calendar calendar, TimeZone timezone, String degrees) {
		System.out.print(timezone.getID() + degrees + ": ");
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE));
	}
	
	
	
	/*private void timeZoneToString(String timeZoneName, String formatedTime) {
		String str = timeZoneName;
		str = str.concat(": " + formatedTime);
		return str;
		}
	*/
		
	
	
	private String timeZone(){
		return "";
	}
}