import java.util.Scanner;

public class Buoi04BaiTap09 {
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

        System.out.print("Enter number 1 : ");
        int numberOne = scanner.nextInt();
        System.out.print("Enter number 2 : ");
        int numberTwo = scanner.nextInt();
        for(int i = numberOne; i <= numberTwo; i++) {
            if(checkPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
