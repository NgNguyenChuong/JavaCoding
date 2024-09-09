import java.util.Scanner;

public class Buoi01BaiTap09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate S = 1^2 + 2^2 +...+N^2");
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        long result = 0;
        for(int i = 1; i <= N; i++) {
            result += (long)Math.pow(i, 2);
        }
        System.out.println("Result: " + result);
    }
}
