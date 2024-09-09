import java.util.Scanner;

public class Buoi03BaiTap02 {
    public static void main(String[] args) {
        System.out.println("Calculate S = 1^2 + 2^2 + ... + n^2");
        System.out.print("Enter N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = 0;
        for(int i = 1; i <= n; i++) {
            result += (long)Math.pow(i, 2);
        }
        System.out.println("Result = "+ result);
    }
}
