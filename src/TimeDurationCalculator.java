import java.util.Scanner; // Calling in Scanner to get some user input.
import java.time.LocalDate; // Importing LocalDate
import java.time.Period; // Importing Period

class TimeDurationCalculator {

	// Creating a main method!
	public static void main(String[] args) {

		System.out.println("DIFFERENCE IN TIME CALCULATOR v 0.00.000.0002");
		System.out.println("BY: Matt Anderson for Grand Circus Detroit's Java Bootcamp");
		System.out.println("");
		System.out.println("About This Program: This program will calcuate the difference in");
		System.out.println("two user specified dates in terms of months, days, and years.");
		System.out.println("");

		// Prompt for oldest date input by user.
		System.out.print("Enter the oldest date in YYYY-MM-DD format: ");

		// Creating a Scanner object
		Scanner scanner = new Scanner(System.in);

		String oldestDateString = scanner.nextLine();

		LocalDate oldestDate = LocalDate.parse(oldestDateString);

		System.out.println("You entered " + oldestDate + " for your oldest date.");
		System.out.print("Enter the most recent date in YYYY-MM-DD format: ");

		String newestDateString = scanner.nextLine();
		LocalDate newestDate = LocalDate.parse(newestDateString);
		System.out.println("You entered " + newestDate + " for your most recent date.");

		Period difference = oldestDate.until(newestDate);

		int days = difference.getDays();
		int months = difference.getMonths();
		int years = difference.getYears();
		scanner.close();

		System.out.println("Your time difference is: " + months + " Months, " + days + " Days, and " + years + " Years.");
	}
}