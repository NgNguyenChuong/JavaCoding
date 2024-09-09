import java.util.Scanner;

public class Buoi02BaiTap02 {
    public static void main(String[] args) {
        System.out.println("50A codeforces!");
        System.out.print("Enter 2 side of rectangle: ");
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        System.out.println("Result = " + (side1 * side2) / 2);
    }
}
