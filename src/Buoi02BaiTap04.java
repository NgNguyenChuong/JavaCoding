import java.util.Scanner;

public class Buoi02BaiTap04 {
    public static void main(String[] args) {
        System.out.println("1077A Frog Jumping in codeforces!");
        System.out.print("Enter a, b, k: ");
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long k = scanner.nextInt();
        long temp = Math.round((float)k / 2);
        System.out.println("Result = " + (temp*a - (k / 2)*b));



    }
}
