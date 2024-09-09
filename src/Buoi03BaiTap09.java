import java.util.Scanner;

public class Buoi03BaiTap09 {
    public static void main(String[] args) {
        System.out.println("Calculate S = 1^3 + 2^3 + ... + n^3");
        System.out.print("Enter N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long result = 0;
        for(int i = 1; i <= n; i++) {
            result += (long)Math.pow(i,3);
        }
        System.out.println("Result= " + result);

    }
}
