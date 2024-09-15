import java.util.Scanner;

public class Buoi04BaiTap08 {

    public static boolean checkThuanNghich(int n) {
        int reverse = 0, original = n;
        while(n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return reverse == original;
    }
    public static int sumOfDigit(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of digit: ");
        int n = scanner.nextInt();
        //initial
        int firstNumber = 1;
        for(int i = 1; i < n; i++) {
            firstNumber *= 10;
        }
        int count = 0;
        for(int i = firstNumber; i < firstNumber * 10; i++) {
            if(checkThuanNghich(i) && sumOfDigit(i) == 10) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
