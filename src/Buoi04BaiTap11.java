import java.util.Scanner;

public class Buoi04BaiTap11 {
    public static int giaiThua(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 6;
        if(n == 4) return 24;
        if(n == 5) return 120;
        if(n == 6) return 720;
        if(n == 7) return 5040;
        if(n == 8) return 40320;
        if(n == 9) return 362880;
        return 0;
    }
    public static boolean check(int n) {
        int original = n;
        int sum = 0;
        while(n > 0) {
            int temp = n % 10;
            sum += giaiThua(temp);
            n /= 10;
        }
        return sum == original;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        for(int i = n1; i <= n2; i++) {
            if(check(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
