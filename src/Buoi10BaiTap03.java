import java.util.Scanner;

public class Buoi10BaiTap03 {
    public static long fibo(int n) {
        if(n == 1 || n == 2) return 1;
        return fibo(n - 1) + fibo(n - 2);

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sequence number of fibo: ");
        int n = scanner.nextInt();
        System.out.println("Result = " + fibo(n));
    }
}
