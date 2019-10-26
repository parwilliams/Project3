import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MesoLexicographical extends MesoSortedAbstract
{
	TreeMap<String, Integer> sortedVal;
	
	public MesoLexicographical(HashMap<String, Integer> asciiVal) {
		sortedVal = new TreeMap<>(asciiVal);
		for(Map.Entry<String, Integer> entry: sortedVal.entrySet()) {
			System.out.println(entry.getKey());
		}
		
	}

	@Override
	public Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted) {
		// TODO Auto-generated method stub
		return sortedVal;
	}	
	
}