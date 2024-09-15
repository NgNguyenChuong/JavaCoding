import java.util.Scanner;

public class Buoi04BaiTap18 {
    public static void solve(int n) {
        int sum = 0;
        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0 ) sum += i;
        }
        if(sum == n) System.out.println("Yes");
        else System.out.println("No");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        solve(n);
    }
}
