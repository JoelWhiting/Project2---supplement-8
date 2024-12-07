import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * <h1>TimeUtils</h1>
 * The TimeUtils class provides utility methods for handling Java time operations.
 * This includes:
 * <ul>
 *     <li>Getting the current date and time.</li>
 *     <li>Converting a LocalDateTime to an ISO 8061 UTC time string.</li>
 *     <li>Calculating the number of days between two dates.</li>
 * </ul>
 * <p>
 * This class leverages the {@link java.time} package introduced in Java 8.
 * </p>
 *
 * @author YourName
 * @version 1.0
 * @since 2024-12-07
 */
public class TimeUtils {

    /**
     * Returns the current date and time.
     * <p>
     * This method fetches the current local date and time using {@link LocalDateTime#now()}.
     * </p>
     *
     * @return LocalDateTime representing the current date and time.
     * @since 1.0
     */
    public static LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }

    /**
     * Converts a LocalDateTime to an ISO 8061 UTC time string.
     * <p>
     * This method takes a {@link LocalDateTime} object, converts it to UTC time, and formats
     * it as an ISO 8061-compliant string using {@link DateTimeFormatter#ISO_INSTANT}.
     * </p>
     *
     * @param dateTime The LocalDateTime to convert.
     * @return A formatted ISO 8061 UTC string (e.g., "2024-12-03T14:10:31Z").
     * @since 1.0
     */
    public static String convertToISO8061UTC(LocalDateTime dateTime) {
        return dateTime.atOffset(ZoneOffset.UTC)
                       .format(DateTimeFormatter.ISO_INSTANT);
    }

    /**
     * Returns the number of days between two dates.
     * <p>
     * This method calculates the difference in days between two {@link LocalDate} objects.
     * It works by converting the start and end dates to midnight and finding the duration
     * in days using {@link Duration}.
     * </p>
     *
     * @param startDate The start date as a {@link LocalDate}.
     * @param endDate   The end date as a {@link LocalDate}.
     * @return Number of days between the two dates.
     * @since 1.0
     */
    public static long daysBetween(LocalDate startDate, LocalDate endDate) {
        return Duration.between(startDate.atStartOfDay(), endDate.atStartOfDay()).toDays();
    }
}
