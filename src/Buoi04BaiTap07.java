import java.util.Scanner;

public class Buoi04BaiTap07 {
    public static boolean checkThuanNghich(int number) {
        int reverse = 0, original = number;
        while(number > 0) {
            reverse = reverse * 10 + number % 10;
            number /=10;
        }
        return original == reverse;
    }
    public static boolean checkPrime(int number) {
        if(number < 2) return false;
        if(number == 2) return true;
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0 ) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        for(int i = num1; i <= num2; i++) {
            int count = 0;

            if(checkThuanNghich(i)) {
                for(int k = 2; k <= i / 2; k++) {
                    if(i % k == 0 && checkPrime(k)) {
                        count ++;
                        if(count >= 3) break;
                    }
                }
            }
            if(count >= 3) System.out.print(i + " ");

        }
    }
}
