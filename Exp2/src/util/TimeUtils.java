package util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TimeUtils {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    public static LocalTime parseTime(String timeStr) throws IllegalArgumentException {
        try {
            return LocalTime.parse(timeStr, formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid time format. Use HH:mm.");
        }
    }
}
