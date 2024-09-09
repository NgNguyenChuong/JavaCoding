import java.util.Scanner;

public class Buoi01BaiTap28 {
    public static void main(String[] args) {
        System.out.println("Count the number of digit between 2 number");
        System.out.print("Enter 2 numbers: ");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        double result = number2 - number1;
        if(result <= 1) result = 0;
        else result = result;
        System.out.println("The number of digit between " + number1 + " and " + number2 + " is " + (int)result);
    }
}
