import java.util.Scanner;

public class Buoi03BaiTap06 {
    public static void main(String[] args) {
        System.out.println("Calculate S = -1 + 2 -3 +...+ (-1)^n*n");
        System.out.print("Enter N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = n / 2;
        if(n % 2 == 0) {
            System.out.println("Result = " + result );
        }
        else System.out.println("Result = " + (-result - 1));
    }
}
