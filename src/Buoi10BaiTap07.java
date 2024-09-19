import java.util.Scanner;

public class Buoi10BaiTap07 {
    static int UCLN(int a, int b) {
        if(b == 0) return a;
        return UCLN(b, a % b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a b to calculate UCLN(a,b): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Result = " + UCLN(a, b));
    }
}
