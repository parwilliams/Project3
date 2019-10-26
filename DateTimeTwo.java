import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class DateTimeTwo extends MesoDateTimeOneAbstract {
	private static final int TENTH_DAY_OF_MONTH = 10;
	private static final int FIFTEENTH_DAY_OF_MONTH = 15;
	private static final int EIGHTEENTH_DAY_OF_MONTH = 18;
	private LocalDateTime currentDate;
	private Calendar calendar;
	private HashMap<LocalDate, Integer> fileDates = new HashMap<LocalDate, Integer>();
	
	public DateTimeTwo() {
		currentDate = LocalDateTime.now();
		calendar = new GregorianCalendar();
	}

	public void daysOfCurrentMonth() {
		int month = currentDate.getMonthValue();
		int year = currentDate.getYear();
		LocalDate tenthDay = LocalDate.of(year, month, TENTH_DAY_OF_MONTH);
		LocalDate eighteenthDay = LocalDate.of(year, month, EIGHTEENTH_DAY_OF_MONTH);
		
		System.out.println("The tenth day of this month is " + tenthDay.getDayOfWeek() + 
				" and eighteenth is " + eighteenthDay.getDayOfWeek());
	}
	
	public void daysOfAnyMonth(int month, int year) {
		LocalDate fifteenthDate = LocalDate.of(year, month, FIFTEENTH_DAY_OF_MONTH);
		int lastDay = fifteenthDate.lengthOfMonth();
		LocalDate lastDate = LocalDate.of(year, month, lastDay);
		
		System.out.println("For the year (" + year + ") and month (" + month + "), the fifteenth day is "
				+ fifteenthDate.getDayOfWeek() + " and the last day is " + lastDate.getDayOfWeek());
	}
	
	public void compareYear() {
		// TODO:Implement Method
		try {
			BufferedReader br = new BufferedReader(new FileReader("Dates.txt"));
			String fileString;
			boolean isLeapYear;
			int hashmapIndex = 1;
			while((fileString = br.readLine()) != null) {
				int month = Integer.parseInt(fileString.substring(0, 2));
				int day = Integer.parseInt(fileString.substring(3, 5));
				int year = Integer.parseInt(fileString.substring(6, 10));
				LocalDate date = LocalDate.of(year, month, day);
				LocalDate now = LocalDate.now();
				fileDates.put(date, hashmapIndex);
				hashmapIndex++;
				
				isLeapYear = date.isLeapYear();
				if(isLeapYear == true) {
					System.out.print(year + " is a leap year, and Difference: ");
				}
				else
					System.out.print(year + " is not a leap year, and Difference: ");
				findDifferenceInTime(date, now);
			}
		}
		catch(Exception e){
			System.out.println("File Does Not Exist");
		}
	}
	
	public void dateHashMap() {
		for(Map.Entry<LocalDate, Integer> entry: fileDates.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
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
	
	private void findDifferenceInTime(LocalDate fileDate, LocalDate dateToday) {
		Period periodDifference;
		if(fileDate.isAfter(dateToday)) {
			periodDifference = Period.between(dateToday, fileDate); //Shouldn't get here with current file
		}
		else
			periodDifference = Period.between(fileDate, dateToday);
		
		System.out.println(periodDifference.getYears() + " years, " + periodDifference.getMonths() + " months, and " + periodDifference.getDays() + " days.");
	}
	
	public int findYearsBetweenDates(LocalDate dateA, LocalDate dateB) {
		boolean compareDates = dateA.isAfter(dateB);
		if(compareDates == true) {
		}
		return 0;
	}
	
	public int findMonthsBetweenDates(LocalDate dateA, LocalDate dateB, int yearsDifference) {
		return 0;
	}
	
	public int findDaysBetweenDates(LocalDate dateA, LocalDate dateB, int yearsDifference, int monthsDifference) {
		return 0;
	}
}
