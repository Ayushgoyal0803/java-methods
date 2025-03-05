class UnitConverterYards {

    //Method to convert yards to feet
    public static double convertYardToFeet(double yard) {
        double yardToFeet = 3;
        return yard * yardToFeet;
    }

    //Method to convert feet to yard
    public static double convertFeetToYard (double feet) {
        double feetToYard = 0.333333;
        return feet * feetToYard;
    }

    //Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double metersToinches = 39.3701;
        return meters * metersToinches;
    }

    //Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inchesToMeter = 0.0254 ;
        return inches * inchesToMeter;
    }

    //Method to convert inches to cm
    public static double convertInchesToCm(double inches) {
        double inchesToCm = 2.54 ;
        return inches * inchesToCm;
    }

    public static void main(String[] args) {
        
        double yard = 10.0;  
        double feet = convertYardToFeet(yard);
        System.out.println(yard + " yards is equal to " + feet + " feet.");

        double feetInput = 10.0;
        double yardOutput = convertFeetToYard(feetInput);
        System.out.println(feetInput + " feet is equal to " + yardOutput + " yards.");

        double meters = 100.0; 
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inches + " inch.");

        double inchesInput = 100.0; 
        double metersOutput = convertInchesToMeters(inchesInput);
        System.out.println(feetInput + " feet is equal to " + metersOutput + " meters.");
       
        double inchesIn = 100.0; 
        double cmOutput = convertInchesToCm(inchesIn);
        System.out.println(feetInput + " feet is equal to " + cmOutput + " cm.");
    }
}