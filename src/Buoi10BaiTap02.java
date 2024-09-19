import java.util.Scanner;

public class Buoi10BaiTap02 {
    public static long solve(int n) {
        if( n == 1) return 1;
        return (long)Math.pow(n,2) + solve(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solve(n));
    }
}
