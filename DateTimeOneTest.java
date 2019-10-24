import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

public class DateTimeOneTest {

	@Test
	public void testConstructor() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetValueOfSecond() {
		fail("Not yet implemented");
	}

	@Test
	public void testSleepForFiveSec() {
		DateTimeOne date = new DateTimeOne();
		int milliseconds = (int)System.currentTimeMillis();
		
		date.sleepForFiveSec();
		int expected = milliseconds + 5000;
		int actual = (int)System.currentTimeMillis();//Not perfect timing
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDateTimeNow() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDateTimeOfOtherCity() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDateTimeDifferentZone() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testTimeZoneHashMap() {
		fail("Not yet implemented");
	}
}
