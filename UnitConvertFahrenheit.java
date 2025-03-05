class UnitConvertFahrenheit {

    //Method to convert Farhenheit To Celsius
    public static double farhenheitToCelsius(double farhenheit) {
        double farhenheitTocelsius = (farhenheit - 32) * 5 / 9;
        return farhenheitTocelsius;
    }

    //Method to convert celsius to farhenheit
    public static double celsiusToFarhenheit(double celsius) {
        double celsiusTofarhenheit = (celsius * 9 / 5) + 32;
        return celsiusTofarhenheit;
    }

    //Method to convert pounds to kilograms
    public static double poundsTokilograms(double pounds) {
        double poundsTokilograms = 0.453592;
        return pounds*poundsTokilograms;
    }

    //Method to convert kilograms to pounds
    public static double kilogramsTopounds(double kilograms) {
        double kilogramsToPounds = 2.20462;
        return kilograms * kilogramsToPounds;
    }

    //Method to convert gallon to Liters
    public static double gallonToLiters(double gallon) {
        double galonToLiters = 3.78541 ;
        return galonToLiters*gallon;
    }

    //Method to convert liters to gallon
    public static double litersToGallon(double liters) {
        double litersToGallon = 0.264172;
        return litersToGallon*liters;
    }

    public static void main(String[] args) {
        
        double farhenheit = 10.0;  
        double farhenheitTocelsius =  farhenheitToCelsius(farhenheit) ;
        System.out.println( farhenheit + " farhenheit is equal to " + farhenheitTocelsius + " celcius.");

        double celcius = 10.0;
        double celsiusToFarhenheit = celsiusToFarhenheit(celcius);
        System.out.println(celcius + " celcius is equal to " + celsiusToFarhenheit + " farhenheit.");

        double pounds = 10.0;
        double poundsToKg = poundsTokilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + poundsToKg + " kilograms.");

        double kilograms = 10.0;
        double kgToPounds = kilogramsTopounds(kilograms);
        System.out.println(kilograms + " kilograms is equal to " + kgToPounds + " pounds.");

        double gallons = 10.0;
        double gallonsToLiters = gallonToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + gallonsToLiters + " liters.");

        double liters = 10.0;
        double litersToGallon = litersToGallon(liters);
        System.out.println(liters + " liters is equal to " + litersToGallon + " gallons.");
        
    }
}