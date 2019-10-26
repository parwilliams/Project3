import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class MesoEquivalent{
	private String setStation;
	private MesoAsciiCal setCalculator;
	private int setAverage;
	
	public MesoEquivalent(String stationID) {
		setStation = stationID;
		setCalculator = new MesoAsciiCal(new MesoStation(setStation));
		setAverage = setCalculator.calAverage();
	}
	

	public HashMap<String, Integer> calAsciiEqual() {
		HashMap<String, Integer> asciiMap = new HashMap<String, Integer>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
			String newLine;
			//Read Away top lines of files
			
			for(int i = 0; i < 3; i++) {
				br.readLine();
			}
			
			while((newLine = br.readLine()) != null) {
				newLine = newLine.substring(2, 6);
				MesoAsciiCal calculator = new MesoAsciiCal(new MesoStation(newLine));
				int asciiAverage = calculator.calAverage();
				if(asciiAverage == setAverage) {
					asciiMap.put(newLine, asciiAverage);
				}
				
				/*
				int[] charValues = new int[4];
				
				//Fill Array With Letters
				for(int i = 0; i < 4; i++) {
					charValues[i] = newLine.charAt(0);
				}
				
				//Add Values together to calculate average
				for(int i = 0; i < 4; i++) {
					charValues[i];
				}
				*/
			}
		}
		catch(Exception e) {
			e.toString();
		}
		
		return asciiMap;
	}
}
