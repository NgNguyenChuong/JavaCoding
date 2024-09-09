import java.util.Scanner;

public class Buoi01BaiTap14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find min divisible!");
        System.out.print("Enter 2 number to find: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int result = (((firstNumber - 1) / secondNumber) + 1) * secondNumber;
        System.out.println("Result: " + result);

    }
}
