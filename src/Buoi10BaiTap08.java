import java.util.Scanner;

public class Buoi10BaiTap08 {
    static int findFirstDigit(int n) {
        if(n < 10) return n;
        return findFirstDigit(n/10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to find first digit : ");
        int n = scanner.nextInt();
        System.out.print("Result = " + findFirstDigit(n));
    }
}
