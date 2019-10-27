# Project 3

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

## Problem Solving
To solve many of the issues, I apporached it with the idea of matching the final output. Since the Driver class called methods driectly, I could go line-by-line working to have the correct output. When the final output of the method was correct, I could then move on to the next line of the Driver to solve that problem. 

In reading the file, the first three lines were unnecessary information that I could scan past with the scanner. After that, I could assume that neither the first two or last two stations would be callled upon for this Project because they would not be able to find the staions two above or below them and there was no information about creating a toString() or exception for this case. After this, reading the file was simply scanning for the information given, and then storing the information for later use.


## Class DateTimeOne()
Class Level Variables:
    private static final int CST_CONVERSION = -5 * 60 * 60 * 1000;
    private static final int BST_CONVERSION = 5 * 60 * 60 * 1000;  //Might need to be 6
    private Calendar calendar;
    private int valueOfSecondNow;
    private SimpleDateFormat dateFormat;
    private SimpleDateFormat hourMinuteFormat;
    private SimpleTimeZone gmt;
    private SimpleTimeZone bst;
    private SimpleTimeZone cst;
    private HashMap<String, String> times = new HashMap<String, String>();
    private GregorianCalendar gmtCalendar;
    private GregorianCalendar bstCalendar;
    private GregorianCalendar cstCalendar;
    private LocalDateTime secondsTime;
    private LocalDate astDate;
    private LocalDate zstDate;
    private LocalTime astTime;
    private LocalTime zstTime;
    
Constructor:
    DateTimeOne();

Public Methods:

int getValueOfSecond()
    Returns value of the current second

void sleepForFiveSec()
    If the current second when program is ran is between 55-59, the program waits 5 seconds to help keep minutes the same

void dateTimeNow() {
    Prints current date and time in format "Current Date/Time: mm/dd/yyyy hh:mm AM/PM"

void dateTimeOfOtherCity()
    Prints current time on server and times in GMT, BST, and CST

void dateTimeDifferentZone() 
    Prints date and time of GMT, BST, and CST timezones
    
void timeZoneHashMap()
    Adds GMT, BST, and CST dates and times to Hashmap along with set LocalDateTimes AST and ZST. These are printed once not sorted, but printed in alphabetical order, then sorted by descending date and printed without labels, and then printed by LocalDateTime in descending order

## Class DateTimeTwo()
Class Level Variables 
    private static final int TENTH_DAY_OF_MONTH = 10;
    private static final int FIFTEENTH_DAY_OF_MONTH = 15;
    private static final int EIGHTEENTH_DAY_OF_MONTH = 18;
    private LocalDateTime currentDate;
    private Calendar calendar;
    private HashMap<LocalDate, Integer> fileDates = new HashMap<LocalDate, Integer>();

constructor
    DateTimeTwo()

Public Methods
    void daysOfCurrentMonth()
        Prints String of form "The tenth day of this month is (weekday) and eighteenth is (weekday)"
    
    void daysOfAnyMonth(int month, int year)
        Prints String of form "For the year (year) and month (month), the fifteenth day is (dayOfWeek) and the last day is (lastDayOfWeek)
        
    void compareYear()
        Reads file "Dates.txt", finds difference between given date and current date, and prints each date in the form 
            "(fileYear) is not a leap year, and Difference: (yearDifference) years, (monthDifference) months, and (dayDifference) days."
    
    void dateHashMap()
        Prints HashMap of LocalDateTimes
    
    void dateHashMap()
        Prints sorted HashMap of LocalDateTimes
        
## Class MesoAsciiCal()
Class Level Variables
    private String stationID;
    private int inputAverage = -1;
    private int fixedAverage = 79;
    
contstructor
    MesoAsciiCal(MesoStation station)
        stationID = station.getStID();

Public Methods
    int calAverage()
        Finds average of stationID, then adds it to the average of NRMN, and divides by 2 for final average

## Class MesoEquivalent()
Class Level Variables
    private String setStation;
    private MesoAsciiCal setCalculator;
    private int setAverage;

Constructor
    MesoEquivalent(String stationID)
        setStation = stationID;

Public Methods
    HashMap<String, Integer> calAsciiEqual()
        Reads file "Mesonet.txt" for all station IDs that have the same average as the setStation. All matching stations are stored and returned in the HashMap.
        
## Class MesoLexicographical()
Constructor 
    MesoLexicographical(HashMap<String, Integer> asciiVal)

Public Methods
    Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted)
        Sorts unsorted through a TreeMap and returns the TreeMap
        
## Class DateSortingUsingAlgorithm()
Class Level Variables
    private HashMap<LocalDate, Integer> dates;
    private LocalDate[] dateKeys;
    
Constructor
    DateSortingUsingAlgorithm()
        Reads File "SortingDates.txt" and puts LocalDates into HashMap

Public Methods
    void dateHashMapSortedDescending
        Sorts the HashMap using a Bubble Sort to sort and print the keys in descending order
    
    void dateHashMapSorted()
        Sorts the HashMap using a Bubble Sort to sort and print the keys in ascending order

## Running the tests

Many of these JUnit test were difficult to build due to many of the methods being of return type void. Another challenge was testing methods that were void and read files. With this being said, I used JUnit testing where I could to make this project come together easier. All of the tests that I was able to fully implement were successful. Other tests that I struggled to implement had problems, but did not effect the output of the project. 


## BubbleSort

At the end of the program, I chose to use a bubble sort to iterate through the hashmap. I chose this because I am familiar with it and I understood how this sort operated the best.  How the bubble sort works is it uses a for loop to read the current object and the object ahead. To create ascending order, if the object ahead less than the current object, they are swapped. Once it has been chosen whether or not to be sorted, the sort moves on down the list until it reaches the end. When it reaches the end, it loops back to the beginning and continues the sorting process again unitl there are no more swaps to be done. This is where the difference in time comes from the 2nd case must need to swap more items, which would take more time and cause the program to run very slightly slower. 

## Author

Parker Williams
