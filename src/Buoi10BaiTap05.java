import java.util.Scanner;

public class Buoi10BaiTap05 {
    public static long solve(int n) {
        if(n == 1) return 1;
        return n * solve(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N to calculate: ");
        int n = scanner.nextInt();
        System.out.println("Result = " + solve(n));

    }
}
