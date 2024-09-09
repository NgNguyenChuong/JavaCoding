import java.util.Scanner;

public class Buoi03BaiTap05 {
    public static void main(String[] args) {
        System.out.println("Calculate S = 1 + 1/2 + 1/3 + ... + 1/n");
        System.out.print("Enter N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += 1.0/i;
        }
        System.out.printf("Result = %.2f", result);

    }
}
