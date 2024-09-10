import java.util.Scanner;

public class Buoi03BaiTap14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate sum of even digit and odd digit!");
        System.out.print("Enter n: ");
        long n = scanner.nextLong();
        int sumOdd = 0;
        int sumEven = 0;
        while(n > 0) {
            int temp = (int)n % 10;
            if(temp % 2 == 0) {
                sumEven += temp;
            }
            else sumOdd += temp;
            n /= 10;
        }
        System.out.println("Sum of even digit: " + sumEven);
        System.out.println("Sum of odd digit: " + sumOdd);
    }
}
