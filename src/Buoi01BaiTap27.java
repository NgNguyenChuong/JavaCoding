import java.util.Scanner;

public class Buoi01BaiTap27 {
    public static void main(String[] args) {
        final int numberOfDaysInYear =365;
        final int numberOfDaysInWeek = 7;
        System.out.println("Changing days to year, month, day ");
        System.out.print("Enter the number of days: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfDays = scanner.nextInt();

        int numberOfYears = numberOfDays / numberOfDaysInYear;
        numberOfDays %= numberOfDaysInYear;

        int numberOfWeeks = numberOfDays / numberOfDaysInWeek;
        numberOfDays %= numberOfDaysInWeek;

        System.out.println("Number of Years: " + numberOfYears);
        System.out.println("Number of Weeks: " + numberOfWeeks);
        System.out.println("Number of Days: " + numberOfDays);


    }
}
