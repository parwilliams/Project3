
public class MesoAsciiCal extends MesoAsciiAbstract {
	private String stationID;
	private int inputAverage = -1;
	private int fixedAverage = 79; //Set for Station "NRMN"

	public MesoAsciiCal(MesoStation station) {
		stationID = station.getStID();
	}

	public int calAverage() {
		int[] asciiCharacters = new int[4];
		int ceiling = -1;
		int floor = 1000;
		double sumOfCharacters = 0;
		double trueAverage;
		double finalAverage;
		int roundedFinalAverage;
		
		for (int i = 0; i < 4; i++) { // Loop to put character values in array
			asciiCharacters[i] = stationID.charAt(i);
		}

		for (int i = 0; i < 4; i++) { // Add All characters
			sumOfCharacters += asciiCharacters[i];
		}

		trueAverage = sumOfCharacters / 4;

		ceiling = (int) Math.ceil(trueAverage);
		floor = (int) Math.floor(trueAverage);

		if ((sumOfCharacters % 4) >= 2) {
			inputAverage = ceiling;
		} else
			inputAverage = floor;
		
		//Calculate average of input and fixed averages
		finalAverage = ((double) inputAverage + (double) fixedAverage) / 2;
		
		//Reset ceiling and floor values
		ceiling = (int) Math.ceil(finalAverage);
		floor = (int) Math.floor(finalAverage);
		
		//Test to round
		if ((sumOfCharacters % 4) >= 1) {
			roundedFinalAverage = ceiling;
		} else
			roundedFinalAverage = floor;

		return roundedFinalAverage;
	}

}