import java.util.Scanner;

public class Buoi01BaiTap21 {
    public static void main(String[] args) {
        System.out.println("Check letter is digit?");
        System.out.print("Enter letter: ");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        if(letter >= '0' && letter <= '9') {
            System.out.println("Valid letter");
        }
        else System.out.println("Invalid letter");
    }
}
