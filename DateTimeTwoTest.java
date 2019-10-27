import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;

public class DateTimeTwoTest {
	private DateTimeTwo dtt = new DateTimeTwo();
	
	@Test
	public void testDaysOfCurrentMonth() {
		dtt.daysOfCurrentMonth();
		LocalDateTime currentDate = LocalDateTime.now();
		LocalDate tenthDay = LocalDate.of(currentDate.getYear(), currentDate.getMonthValue(), 10);
		LocalDate eighteenthDay = LocalDate.of(currentDate.getYear(), currentDate.getMonthValue(), 18);
		equals("The tenth day of this month is " + tenthDay.getDayOfWeek() + 
				" and eighteenth is " + eighteenthDay.getDayOfWeek());
	}
	

	@Test
	public void testDaysOfAnyMonth() {
		dtt.daysOfAnyMonth(10, 2019);
		equals("For the year (2019) and month (10), the fifteenth day is THURSDAY and the last day is Friday");
	}

	@Test
	public void testCompareYear() {
		dtt.compareYear();
		//Ask How to write test for explicitly read Files
	}

	@Test
	public void testDateHashMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testDateHashMapSorted() {
		fail("Not yet implemented");
	}

}
