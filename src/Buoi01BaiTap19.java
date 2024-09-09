import java.util.Scanner;

public class Buoi01BaiTap19 {
    public static void main(String[] args) {
        System.out.println("Check upper case!");
        System.out.print("Enter the letter: ");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);

        if(letter >= 'A' && letter <= 'Z') {
            System.out.println("Valid letter");
        }
        else System.out.println("Invalid letter");
    }
}
