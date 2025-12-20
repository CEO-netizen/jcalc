public final class Time {

    private Time() {}

    // ---- Small units ----
    public static double nanosecondsToMicroseconds(double v) {
        return v / 1_000.0;
    }

    public static double microsecondsToNanoseconds(double v) {
        return v * 1_000.0;
    }

    public static double microsecondsToMilliseconds(double v) {
        return v / 1_000.0;
    }

    public static double millisecondsToMicroseconds(double v) {
        return v * 1_000.0;
    }

    public static double millisecondsToSeconds(double v) {
        return v / 1_000.0;
    }

    public static double secondsToMilliseconds(double v) {
        return v * 1_000.0;
    }

    // ---- Seconds ----
    public static double secondsToMinutes(double v) {
        return v / 60.0;
    }

    public static double minutesToSeconds(double v) {
        return v * 60.0;
    }

    public static double secondsToHours(double v) {
        return v / 3_600.0;
    }

    public static double hoursToSeconds(double v) {
        return v * 3_600.0;
    }

    // ---- Minutes / Hours ----
    public static double minutesToHours(double v) {
        return v / 60.0;
    }

    public static double hoursToMinutes(double v) {
        return v * 60.0;
    }

    // ---- Days ----
    public static double hoursToDays(double v) {
        return v / 24.0;
    }

    public static double daysToHours(double v) {
        return v * 24.0;
    }

    public static double daysToWeeks(double v) {
        return v / 7.0;
    }

    public static double weeksToDays(double v) {
        return v * 7.0;
    }

    // ---- Larger units (documented averages) ----
    public static double daysToMonths(double v) {
        return v / 30.44; // average month
    }

    public static double monthsToDays(double v) {
        return v * 30.44;
    }

    public static double daysToYears(double v) {
        return v / 365.25;
    }

    public static double yearsToDays(double v) {
        return v * 365.25;
    }

    public static double yearsToDecades(double v) {
        return v / 10.0;
    }

    public static double decadesToYears(double v) {
        return v * 10.0;
    }

    public static double yearsToCenturies(double v) {
        return v / 100.0;
    }

    public static double centuriesToYears(double v) {
        return v * 100.0;
    }

    public static double yearsToMillennia(double v) {
        return v / 1_000.0;
    }

    public static double millenniaToYears(double v) {
        return v * 1_000.0;
    }
}
