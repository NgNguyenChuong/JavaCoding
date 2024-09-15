import java.util.Scanner;

public class Buoi04BaiTap16 {
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
        System.out.print("Enter N ");
        int number = scanner.nextInt();
        for(int i = 2; i < number; i++) {
            if(checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
