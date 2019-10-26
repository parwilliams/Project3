import java.io.FileInputStream;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class DateSortingUsingAlgorithm {
	private HashMap<LocalDate, Integer> dates;
	private LocalDate[] dateKeys;
	
	public DateSortingUsingAlgorithm() {
		dates = new HashMap<>();
		dateKeys = new LocalDate[20];
		try {
			FileInputStream fis = new FileInputStream("SortingDates.txt");
			Scanner scnr = new Scanner(fis);
			int mapIndex = 1;
			int arrayIndex = 0;
			while (scnr.hasNext()) {
				String dateString = scnr.next();
				if(dateString.endsWith("-")) {
					dateString = dateString.concat(scnr.next());
				}
				LocalDate fileDate = LocalDate.parse(dateString);
				dateKeys[arrayIndex] = fileDate;
				dates.put(fileDate, mapIndex);
				mapIndex++;
				arrayIndex++;
			}
		}
		catch(Exception e) {
			e.toString();
		}
	}

	public void dateHashMapSortedDescending() {
		int mapLength = dates.size();
		for(int i = 0; i < mapLength - 1; i++) {
			for(int j = 0; j < mapLength - i - 1; j++) {
				if(dateKeys[j].isBefore(dateKeys[j + 1])){
					LocalDate hold = dateKeys[j];
					dateKeys[j] = dateKeys[j + 1];
					dateKeys[j + 1] = hold;
				}
			}
		}
		
		for(LocalDate key: dateKeys) {
			System.out.println(key);
		}
		
	}

	public void dateHashMapSorted() {
		int mapLength = dates.size();
		for(int i = 0; i < mapLength - 1; i++) {
			for(int j = 0; j < mapLength - i - 1; j++) {
				if(dateKeys[j].isAfter(dateKeys[j + 1])){
					LocalDate hold = dateKeys[j];
					dateKeys[j] = dateKeys[j + 1];
					dateKeys[j + 1] = hold;
				}
			}
		}
		
		for(LocalDate key: dateKeys) {
			System.out.println(key);
		}
	}
	
	
}
