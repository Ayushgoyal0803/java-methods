import java.util.Scanner;

class LeapYear{

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        
        if (year < 1582) {
            return false;
        }

        // Leap year is divisible by 4, but not divisible by 100 or divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}