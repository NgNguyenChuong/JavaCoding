import java.util.Scanner;

public class Buoi03BaiTap13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfDigit = 0;
        System.out.print("Enter n: ");
        long n = scanner.nextLong();
        while(n > 0) {
            sumOfDigit += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits is " + sumOfDigit);
    }
}
