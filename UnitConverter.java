public class UnitConverter {

    //Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double kmTomiles = 0.621371;
        return km * kmTomiles;
    }

    //Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double milesTokm = 1.60934;
        return miles * milesTokm;
    }

    //Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double metersTofeet = 3.28084;
        return meters * metersTofeet;
    }

    //Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feetTometers = 0.3048;
        return feet * feetTometers;
    }

    public static void main(String[] args) {
        
        double km = 10.0;  
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        double milesInput = 10.0;
        double kmOutput = convertMilesToKm(milesInput);
        System.out.println(milesInput + " miles is equal to " + kmOutput + " kilometers.");

        double meters = 100.0; 
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        double feetInput = 100.0; 
        double metersOutput = convertFeetToMeters(feetInput);
        System.out.println(feetInput + " feet is equal to " + metersOutput + " meters.");
    }
}