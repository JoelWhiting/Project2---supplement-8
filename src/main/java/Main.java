import java.time.*;

/**
 * Main class to run and test the TimeUtils utility methods.
 * <p>
 * This class demonstrates:
 * <ul>
 *     <li>Getting the current date and time</li>
 *     <li>Converting a LocalDateTime to ISO 8061 UTC string</li>
 *     <li>Calculating the number of days between two dates</li>
 * </ul>
 * </p>
 */
public class Main {

    /**
     * The main method to run TimeUtils methods interactively.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Demonstrate getCurrentDateTime
        LocalDateTime now = TimeUtils.getCurrentDateTime();
        System.out.println("Current Date and Time: " + now);

        // Demonstrate convertToISO8061UTC
        String isoDateTime = TimeUtils.convertToISO8061UTC(now);
        System.out.println("ISO 8061 UTC Time: " + isoDateTime);

        // Demonstrate daysBetween
        LocalDate startDate = LocalDate.of(2024, 12, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 7);
        long days = TimeUtils.daysBetween(startDate, endDate);
        System.out.println("Days Between " + startDate + " and " + endDate + ": " + days);
    }
}
