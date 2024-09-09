import java.util.Scanner;

public class Buoi03BaiTap10 {
    public static void main(String[] args) {
        System.out.println("Calculate N!");
        System.out.print("Enter N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = 1;
        for(int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println("Result= " + result);
    }
}
