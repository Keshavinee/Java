package mypack.converter;

public class DistanceConverter {
    public static double meterToKm(double meter){
        return (double)meter/1000;
    }

    public static double kmToMeter(double km){
        return (double)km*1000;
    }

    public static double milesToKm(double mile){
        return (double)mile*1.6;
    }

    public static double kmToMiles(double km){
        return (double)km*0.621;
    }
}
