import java.util.Scanner;

public class Buoi01BaiTap15 {
    public static void main(String[] args) {
        System.out.println("Check divisible both 3 and 5!");
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        if(number % 3 ==0 && number % 5 == 0) {
            System.out.println("Valid!");
        }
        else System.out.println("Invalid!");
    }
}
