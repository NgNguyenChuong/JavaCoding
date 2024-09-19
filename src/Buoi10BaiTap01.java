import java.util.Scanner;


public class Buoi10BaiTap01 {
    public static int solve(int n) {
        if(n == 1) return 1;
        return n + solve(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("enter the number to calculate S = 1 + 2 + ... + n: ");
        n = scanner.nextInt();
        System.out.println("Result = " + solve(n));
    }
}
