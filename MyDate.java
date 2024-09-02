public class MyDate {
    private int year;
    private int month; // 0-based
    private int day;

    // Constants for time conversions
    private static final long MILLIS_PER_SECOND = 1000;
    private static final long SECONDS_PER_MINUTE = 60;
    private static final long MINUTES_PER_HOUR = 60;
    private static final long HOURS_PER_DAY = 24;
    private static final long MILLIS_PER_DAY = MILLIS_PER_SECOND * SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAY;

    // No-arg constructor that creates a MyDate object for the current date
    public MyDate() {
        this(System.currentTimeMillis());
    }

    // Constructor that constructs a MyDate object with a specified elapsed time
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // Constructor that constructs a MyDate object with a specified year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month; // 0-based month
        this.day = day;
    }

    // Getter methods
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month; // 0-based month
    }

    public int getDay() {
        return day;
    }

    // Method to set the date based on elapsed time
    public void setDate(long elapsedTime) {
        long daysSinceEpoch = elapsedTime / MILLIS_PER_DAY;

        // Calculate the year
        int year = 1970;
        while (daysSinceEpoch >= daysInYear(year)) {
            daysSinceEpoch -= daysInYear(year);
            year++;
        }
        this.year = year;

        // Calculate the month
        int[] daysInMonth = getDaysInMonthArray(year);
        int month = 0;
        while (daysSinceEpoch >= daysInMonth[month]) {
            daysSinceEpoch -= daysInMonth[month];
            month++;
        }
        this.month = month; // Zero-based month
        this.day = (int) (daysSinceEpoch + 1); // Days are 1-based
    }

    // Check if a year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get the number of days in a year
    private int daysInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    // Get the days in each month for a given year
    private int[] getDaysInMonthArray(int year) {
        return new int[] {
            31, // January
            isLeapYear(year) ? 29 : 28, // February
            31, // March
            30, // April
            31, // May
            30, // June
            31, // July
            31, // August
            30, // September
            31, // October
            30, // November
            31  // December
        };
    }

    @Override
    public String toString() {
        return year + "-" + String.format("%02d", month + 1) + "-" + String.format("%02d", day);
    }

    // Main method to test MyDate class
    public static void main(String[] args) {
        // Create MyDate objects
        MyDate dateCurrent = new MyDate();
        MyDate dateElapsed = new MyDate(34355555133101L);

        // Display their year, month, and day
        System.out.println("The current date is: " + dateCurrent);
        System.out.println("The date for elapsed time 34355555133101L is: " + dateElapsed);
    }
}
