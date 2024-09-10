import java.util.Scanner;

public class Buoi03BaiTap12 {
    public static void main(String[] args) {
        System.out.println("Count the number of digit!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        long n = scanner.nextLong();
        int countOfDigit = 0;
        while(n > 0) {
            countOfDigit++;
            n /= 10;
        }
        System.out.println("The number of digit is " + countOfDigit);
    }
}
