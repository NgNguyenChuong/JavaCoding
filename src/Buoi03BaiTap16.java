
import java.util.Scanner;

public class Buoi03BaiTap16 {
    public static boolean checkPrime(int n) {
        if (n < 2) return false;
        if(n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Count the number of prime number!");
        System.out.print("Enter N: ");
        long n = scanner.nextLong();
        int countPrime = 0;
        while(n > 0) {
            int temp = (int)n % 10;
            if(checkPrime(temp)) countPrime++;
            n /= 10;
        }
        System.out.println("Result= " + countPrime);

    }
}
