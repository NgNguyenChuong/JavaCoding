import java.util.Scanner;

public class Buoi01BaiTap11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate S = 2 + 4 + ... + 2*n");
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        long result = 0;
        for(int i = 1; i <= n; i++) {
            result += 2*i;
        }
        System.out.println("Result: " + result);
    }
}
