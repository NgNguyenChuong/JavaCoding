import java.util.Scanner;

public class Buoi03BaiTap11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate x^y!");
        System.out.print("Enter X: ");
        int x = scanner.nextInt();
        System.out.print("Enter Y: ");
        int y = scanner.nextInt();
        long result = x;
        for(int i = 1; i < y; i++) {
            result *= x;
        }
        System.out.println("Result= " + result );
    }

}
