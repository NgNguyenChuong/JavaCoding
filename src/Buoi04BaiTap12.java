import java.util.Scanner;

public class Buoi04BaiTap12 {
    public static boolean check(int n) {
        while(n > 0) {
            int temp = n % 10;
            if(temp != 0 && temp != 8 && temp != 6) return false;
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        if(check(n)) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
