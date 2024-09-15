import java.util.Scanner;

public class Buoi04BaiTap17 {
    public static int countDigit(int n) {
        int count = 0;
        while(n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    public static void solve(int n) {
        int numberOfDigit = countDigit(n);
        int original = n;
        int sum = 0;
        while(n > 0) {
            int temp = n % 10;
            sum += (int)Math.pow(temp, numberOfDigit);
            n /= 10;
        }
        if(sum == original) {
            System.out.print(original + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        for(int i = 1; i < n; i++) {
            solve(i);
        }
    }
}
