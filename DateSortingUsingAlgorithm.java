import java.io.FileInputStream;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class DateSortingUsingAlgorithm {
	private HashMap<LocalDate, Integer> dates;
	
	public DateSortingUsingAlgorithm() {
		dates = new HashMap<>();
		try {
			FileInputStream fis = new FileInputStream("SortingDates.txt");
			Scanner scnr = new Scanner(fis);
			int mapIndex = 1;
			while (scnr.hasNext()) {
				String dateString = scnr.next();
				LocalDate fileDate = LocalDate.parse(dateString);
				dates.put(fileDate, mapIndex);
				mapIndex++;
			}
		}
		catch(Exception e) {
			e.toString();
		}
	}

	public void dateHashMapSortedDescending() {
		// TODO Auto-generated method stub
	}

	public void dateHashMapSorted() {
		// TODO Auto-generated method stub
		
	}
	
	
}
