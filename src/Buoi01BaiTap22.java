import java.util.Scanner;

public class Buoi01BaiTap22 {
    public static void main(String[] args) {
        System.out.println("Changing letter from upper to lower case!");
        System.out.print("Enter letter: ");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);

        if(letter >= 'a' && letter <= 'z') {
            System.out.println(letter);
        }
        else if(letter >= 'A' && letter <= 'Z') {
            letter += 32;
            System.out.println(letter);
        }
        else System.out.println(letter);

    }
}
