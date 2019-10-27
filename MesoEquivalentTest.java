import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

import org.junit.Test;

public class MesoEquivalentTest {
	private MesoEquivalent mesoE = new MesoEquivalent("OKCE");
	
	@Test
	public void testMesoEquivalent() {
		//TODO: Edit Test
		equals(mesoE);
	}

	@Test
	public void testCalAsciiEqual() {
		HashMap<String, Integer> expectedMap = new HashMap<>();
		int setAverage = 76;
		try {
			BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
			String newLine;
			
			for(int i = 0; i < 3; i++) {
				br.readLine();
			}
			
			while((newLine = br.readLine()) != null) {
				newLine = newLine.substring(2, 6);
				MesoAsciiCal calculator = new MesoAsciiCal(new MesoStation(newLine));
				int asciiAverage = calculator.calAverage();
				if(asciiAverage == setAverage) {
					expectedMap.put(newLine, asciiAverage);
				}
			}
			HashMap<String, Integer> actualMap = mesoE.calAsciiEqual();
			assertEquals(expectedMap, actualMap);
		}
		catch(Exception e) {
			fail("Exception Thrown");
		}
	}

}
