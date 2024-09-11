import java.util.Scanner;

public class Buoi04BaiTap02 {

    public static boolean check(int n) {
        int sum = 1;
        for(int i = 2; i <= n/2; i++ ) {
            if(n % i == 0) sum += i;
        }
        if(sum == n) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        boolean flag = false;
        for(int i = num1 + 1; i <= num2; i++) {
            if(check(i)) {
                flag = true;
                System.out.print(i + " ");
            }
        }
        if(!flag) System.out.println(0);
    }
}
