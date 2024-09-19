import java.util.Scanner;

public class Buoi10BaiTap04 {
    public static int solve(int n) {
        if(n <= 0) return 0;
        return 1 + solve(n / 10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N to count the number of digit : ");
        int n = scanner.nextInt();
        System.out.println("Result = " + solve(n));
    }
}
