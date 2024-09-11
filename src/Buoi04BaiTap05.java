import java.util.Scanner;

public class Buoi04BaiTap05 {
    public static long findFibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return findFibonacci(n-1) + findFibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println("Fibonacci!");
        System.out.print("Enter N to find fibonacci number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Fibonacci thứ n là " + findFibonacci(n));
    }
}
