import java.util.Scanner;

public class Buoi04BaiTap15 {
    public static void solve(int n) {
        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) System.out.print(i + " ");
        }
        System.out.print(n);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int number = scanner.nextInt();
        solve(number);
    }
}
