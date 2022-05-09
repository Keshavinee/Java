package mypack.converter;

public class TimeConverter {
    public static double hrsToMin(double hrs) {
        return (double) hrs*60;
    }

    public static double MinToHrs(double min) {
        return (double) min/60;
    }

    public static double minToSec(double min) {
        return (double) min*60;
    }

    public static double secToMin(double sec) {
        return (double) sec/60;
    }
}
