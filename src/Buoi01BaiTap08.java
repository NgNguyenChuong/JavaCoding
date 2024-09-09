import java.util.Scanner;

public class Buoi01BaiTap08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate S = 1 + 2 + 3 + ... + N ");
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        long result = 0;
        for(int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.println("Result: " + result );

    }
}
