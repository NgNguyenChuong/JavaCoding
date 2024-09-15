import java.util.Scanner;

public class Buoi04BaiTap13 {
    public static boolean check(int n) {
        boolean flag = false;
        int count = 0;
        while(n > 0) {
            int temp = n % 10;
            count += temp;
            if(temp != 6 && temp > 2) return false;
            if(temp == 6) flag = true;
            n /= 10;
        }
        if(flag && count == 8) return true;
        return false;
    }
    public static boolean checkThuanNghich(int n) {
        int reverse = 0, original = n;
        while(n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return reverse == original;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N1: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter N2: ");
        int n2 = scanner.nextInt();
        for(int i = n1; i <= n2; i++) {
            if(check(i) && checkThuanNghich(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
