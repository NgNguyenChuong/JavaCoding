import java.util.Scanner;

public class Buoi01BaiTap03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers to calculate S = a*(b+c) + b*(a+c).");
        System.out.print("Number 1: ");
        int numberOne = scanner.nextInt();
        System.out.print("Number 2: ");
        int numberTwo = scanner.nextInt();
        System.out.print("Number 3: ");
        int numberThree = scanner.nextInt();

        long result = numberOne * (numberTwo + numberThree) + numberTwo * (numberOne + numberThree);
        System.out.println("Result: " + result);
    }
}
