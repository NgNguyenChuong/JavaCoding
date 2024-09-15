import java.util.Scanner;

public class Buoi04BaiTap20 {
    public static void solve(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                int count = 0;
                while(n % i == 0) {
                    count ++;
                    n /= i;
                }
                System.out.printf("%d^%d ",i , count);
            }

        }
        if (n > 1) {
            System.out.printf("%d^1", n); // n tự chia cho chính nó, bậc mũ là 1
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        solve(n);
    }
}
