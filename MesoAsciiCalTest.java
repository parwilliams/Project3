import static org.junit.Assert.*;

import org.junit.Test;

public class MesoAsciiCalTest {
	private MesoStation station = new MesoStation("OKCE");
	private MesoAsciiCal mac = new MesoAsciiCal(station);
	@Test
	public void testCalAverage() {
		int expected = 76;
		int actual = mac.calAverage();
		assertEquals(expected, actual);
	}

}
