import java.util.Scanner;

public class Buoi04BaiTap01 {
    public static boolean checkPrime(int n) {
        if(n < 2) return false;
        if(n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find prime number is extreme prime between 2 number!");
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        int countExtremePrime = 0;

        for(int i = num1; i <= num2; i++) {
            if(checkPrime(i)) {
                int temp = i;
                int sum = 0;
                boolean flag = true;
                while(temp > 0) {
                    int digit = temp % 10;
                    sum += digit;
                    if(!checkPrime(digit)) {
                        flag = false;
                        break;
                    }
                    temp /= 10;
                }
                if(flag && checkPrime(sum)) countExtremePrime++;
            }
        }
        System.out.println("Result = " +  countExtremePrime);
    }
}