import java.util.Scanner;

public class Buoi03BaiTap15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Count the number of even digit and odd digit!");
        System.out.print("Enter N: ");
        long n = scanner.nextLong();
        int countEven = 0;
        int countOdd =0;
        while(n > 0) {
            if((n % 10) % 2 == 0) countEven++;
            else countOdd ++;
            n /= 10;
        }
        System.out.println("Sum of even digit is " + countEven);
        System.out.println("Sum of odd digit is " + countOdd);
    }
}
