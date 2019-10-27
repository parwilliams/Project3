import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class MesoLexicographicalTest {
	private MesoEquivalent mesoEqual = new MesoEquivalent("OKCE");
	private HashMap<String, Integer> testVal = mesoEqual.calAsciiEqual();
	
	@Test
	public void testMesoLexicographical() {
		MesoLexicographical expected = new MesoLexicographical(testVal);	
		MesoLexicographical actual = new MesoLexicographical(mesoEqual.calAsciiEqual());	
		assertEquals(expected, actual);
	}

	@Test
	public void testSortedMap() {
		MesoLexicographical actualLex = new MesoLexicographical(mesoEqual.calAsciiEqual());
		TreeMap<String, Integer> expected = new TreeMap<>(testVal);
		Map<String, Integer> actual = actualLex.sortedMap(testVal);
		
		assertEquals(expected, actual);
	}
}
