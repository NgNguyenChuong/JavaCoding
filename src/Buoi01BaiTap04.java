
import java.util.Scanner;

public class Buoi01BaiTap04 {
    public static void main(String[] args) {
        System.out.println("Enter 2 number to calculate sum, sub, multi, division!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int numberOne = scanner.nextInt();
        System.out.print("Enter number two: ");
        int numberTwo = scanner.nextInt();
        long sum = numberOne + numberTwo;
        int sub = numberOne - numberTwo;
        long multi = numberOne * numberTwo;
        float div = (float)numberOne / numberTwo;
        System.out.println("The sum is: " + sum);
        System.out.println("The sub is: " + sub);
        System.out.println("The multi is: " + multi);
        System.out.printf("the div is : %.2f", div);
        //aksdfjakdf

    }
}
