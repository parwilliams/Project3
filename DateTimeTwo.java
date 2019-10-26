import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTimeTwo extends MesoDateTimeOneAbstract {
	private static final int TENTH_DAY_OF_MONTH = 10;
	private static final int FIFTEENTH_DAY_OF_MONTH = 15;
	private static final int EIGHTEENTH_DAY_OF_MONTH = 18;
	private LocalDateTime currentDate;
	private Calendar calendar;
	
	public DateTimeTwo() {
		currentDate = LocalDateTime.now();
		calendar = new GregorianCalendar();
	}

	public void daysOfCurrentMonth() {
		// TODO:Implement Method
		int month = currentDate.getMonthValue();
		int year = currentDate.getYear();
		LocalDate tenthDay = LocalDate.of(year, month, TENTH_DAY_OF_MONTH);
		LocalDate eighteenthDay = LocalDate.of(year, month, EIGHTEENTH_DAY_OF_MONTH);
		
		System.out.println("The tenth day of this month is " + tenthDay.getDayOfWeek() + 
				" and eighteenth is " + eighteenthDay.getDayOfWeek());
	}
	
	public void daysOfAnyMonth(int month, int year) {
		// TODO:Implement Method
		LocalDate fifteenthDate = LocalDate.of(year, month, FIFTEENTH_DAY_OF_MONTH);
		int lastDay = fifteenthDate.lengthOfMonth();
		LocalDate lastDate = LocalDate.of(year, month, lastDay);
		
		System.out.println("For the year (" + year + ") and month (" + month + "), the fifteenth day is "
				+ fifteenthDate.getDayOfWeek() + " and the last day is " + lastDate.getDayOfWeek());
	}
	
	public void compareYear() {
		// TODO:Implement Method
	}
	
	public void dateHashMap() {
		// TODO:Implement Method
	}

	public void dateHashMapSorted() {
		// TODO:Implement Method
	}

	@Override
	public int getValueOfSecond() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void dateTimeNow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleepForFiveSec() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dateTimeOfOtherCity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dateTimeDifferentZone() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void timeZoneHashMap() {
		// TODO Auto-generated method stub
		
	}
	
}
