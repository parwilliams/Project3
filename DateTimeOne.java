import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

public class DateTimeOne extends MesoDateTimeOneAbstract {

	private Calendar calendar;
	private SimpleTimeZone cdt;
	private int milliseconds;
	private static final int MILLI_CONVERSION = 1000;
	private int seconds;

	public DateTimeOne() {
		calendar = new GregorianCalendar();

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

	}

	public void dateTimeOfOtherCity() {
		// TODO:Implement Method
	}

	public void dateTimeDifferentZone() {
		// TODO:Implement Method
	}

	public void timeZoneHashMap() {
		// TODO:Implement Method
	}
}