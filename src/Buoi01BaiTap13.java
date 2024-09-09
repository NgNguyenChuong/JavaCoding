import java.util.Scanner;

public class Buoi01BaiTap13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find max divisible");
        System.out.print("Enter 2 number to find: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int result = firstNumber / secondNumber * secondNumber;
        System.out.println("Result: " + result);
    }
}
