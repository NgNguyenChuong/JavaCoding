import java.util.Scanner;

public class Buoi04BaiTap14 {
    public static void calculate(int n) {
        long result = 1;
        while(n > 0) {
            result *= (n % 10);
            n /= 10;
        }
        System.out.println("Result = " + result );
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        calculate(n);
    }
}
