import java.util.Scanner;

public class Buoi01BaiTap20 {
    public static void main(String[] args) {
        System.out.println("Check letter is Alphabet!");
        System.out.print("Enter a letter: ");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        boolean flag = false;
        if(letter >= 'a' && letter <= 'z') flag = true;
        else if(letter >= 'A' && letter <= 'Z') flag = true;

        if(flag) System.out.println("Valid letter");
        else System.out.println("Invalid letter");

    }
}
