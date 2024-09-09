import java.util.Scanner;

public class Buoi01BaiTap02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number to calculate A(x) = x^3 + 3x^2 + x + 1, Enter: ");
        int number = scanner.nextInt();

        long result = (long)(Math.pow(number,3) + 3*Math.pow(number,2) + number + 1);
        System.out.println("Expression A(x) = " + result);
    }
}
