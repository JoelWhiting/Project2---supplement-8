import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.*;

/**
 * <h1>TimeUtilsTest</h1>
 * The TimeUtilsTest class contains unit tests for the {@link TimeUtils} utility class.
 * <p>
 * These tests validate the following methods:
 * <ul>
 *     <li>{@link TimeUtils#getCurrentDateTime()}</li>
 *     <li>{@link TimeUtils#convertToISO8061UTC(LocalDateTime)}</li>
 *     <li>{@link TimeUtils#daysBetween(LocalDate, LocalDate)}</li>
 * </ul>
 * </p>
 *
 * <p>All tests are implemented using JUnit 5.</p>
 *
 * @author YourName
 * @version 1.0
 * @since 2024-12-07
 */
public class TimeUtilsTest {

    /**
     * Tests the {@link TimeUtils#getCurrentDateTime()} method.
     * <p>
     * Validates that the current date and time returned is not null.
     * </p>
     */
    @Test
    public void testGetCurrentDateTime() {
        LocalDateTime now = TimeUtils.getCurrentDateTime();
        assertNotNull(now, "Current date and time should not be null");
    }

    /**
     * Tests the {@link TimeUtils#convertToISO8061UTC(LocalDateTime)} method.
     * <p>
     * Verifies that the method correctly converts a given {@link LocalDateTime}
     * to an ISO 8061 UTC time string.
     * </p>
     */
    @Test
    public void testConvertToISO8061UTC() {
        LocalDateTime dateTime = LocalDateTime.of(2024, 12, 3, 14, 10, 31);
        String result = TimeUtils.convertToISO8061UTC(dateTime);
        assertEquals("2024-12-03T14:10:31Z", result, "ISO 8061 string should match");
    }

    /**
     * Tests the {@link TimeUtils#daysBetween(LocalDate, LocalDate)} method.
     * <p>
     * Checks if the number of days between two dates is calculated accurately.
     * </p>
     */
    @Test
    public void testDaysBetween() {
        LocalDate startDate = LocalDate.of(2024, 12, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 3);
        long days = TimeUtils.daysBetween(startDate, endDate);
        assertEquals(2, days, "Number of days between two dates should be 2");
    }
}
