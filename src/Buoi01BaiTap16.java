import java.util.Scanner;

public class Buoi01BaiTap16 {
    public static void main(String[] args) {
        System.out.println("Check leap year!");
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        while(year < 1 ) {
            System.out.print("Enter year: ");
            year = scanner.nextInt();
        }
        if(year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)) {
            System.out.println("Leap year!");
        }
        else System.out.println("Not a leap year!");

    }
}
