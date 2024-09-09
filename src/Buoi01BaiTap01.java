import java.util.Scanner;

public class Buoi01BaiTap01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();


        int getIntegral = firstNumber / secondNumber;
        int getRemainder = firstNumber - (getIntegral * secondNumber);

        System.out.println("Integral: " + getIntegral);
        System.out.println("Remainder: " + getRemainder);



    }
}
