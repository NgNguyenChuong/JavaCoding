import java.util.Scanner;

public class Buoi03BaiTap04 {
    public static void main(String[] args) {
        System.out.println("Calculate S = 1/2 + 1/4 + 1/6 + ... + 1/(2*n)");
        System.out.print("Enter N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double result = 0;
        for(int i = 1; i <= n; i++) {
            result += (double)1/(2*i);
        }
        System.out.printf("Result: %.2f", result);
    }
}
