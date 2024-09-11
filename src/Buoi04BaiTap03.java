import java.util.Scanner;

public class Buoi04BaiTap03 {
    public static int check(int n) {
        int flag = 0;
        int lastNumber = n % 10;
        int secondLastNumber = (n / 10) % 10;
        int prevDigit = secondLastNumber;
        n /= 100;
        if(lastNumber < secondLastNumber) {
            flag = 1;
            while(n > 0) {
                int temp = n % 10;
                if(temp <= prevDigit) return 0;
                prevDigit = temp;
                n /=10;
            }
        }
        else if(lastNumber > secondLastNumber) {
            flag = 1;
            while(n > 0) {
                int temp = n % 10;
                if(temp >= prevDigit) return 0;
                prevDigit = temp;
                n /=10;
            }
        }
        else {
            return 0;
        }
        return 1;
    }
    public static boolean checkPrime(int n) {
        if(n < 2) return false;
        if(n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Kiem tra so nguyen to tang giam! ");
        System.out.print("Enter N: ");
        Scanner scanner = new Scanner(System.in);
        short lengthOfNumber = scanner.nextShort();
        int temp = 1;
        for(int i = 1; i < lengthOfNumber; i++) {
            temp *= 10;
        }
        int count = 0;
        if(lengthOfNumber == 2) {
            for(int i = temp; i < temp * 10; i++) {
                if(checkPrime(i) && i%10 != i/10)  count++;
            }
        }
        for(int i = temp; i < temp * 10; i++) {
            if(checkPrime(i) && check(i) == 1)  count++;
        }
        System.out.println(count);
    }
}
// flag = 1 giam dan
// flag = -1 tang dan