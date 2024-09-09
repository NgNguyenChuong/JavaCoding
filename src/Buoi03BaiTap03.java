import java.util.Scanner;

public class Buoi03BaiTap03 {
    public static void main(String[] args) {
        System.out.println("Sum of number divisible by 3 less than N!");
        System.out.print("Enter N:");
        Scanner scanner = new Scanner(System.in);
        long result = 0;
        int n = scanner.nextInt();
        for(int i = 3; i <= n; i+=3) {
            result +=i;
        }
        System.out.println("Result = " + result);

    }
}
