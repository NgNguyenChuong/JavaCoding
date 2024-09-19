import java.util.Scanner;

public class Buoi10BaiTap06 {
    static void solve(int n) {
        if(n <= 0) return;
        System.out.print(n % 10);
        solve(n / 10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N to print swap : ");
        int n = scanner.nextInt();
        solve(n);
    }
}
