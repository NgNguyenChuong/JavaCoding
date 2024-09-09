import java.util.Scanner;

public class Buoi01BaiTap24 {
    public static void main(String[] args) {
        System.out.println("Change next alphabet to lower or upper");
        System.out.print("Enter letter: ");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        if(letter >= 'a' && letter < 'z') {
            letter -= 31;
        }
        else if(letter >= 'A' && letter < 'Z') {
            letter += 33;
        }
        else if(letter == 'z') letter = 'A';
        else if(letter == 'Z') letter = 'a';
        else System.out.println("Invalid letter");
        System.out.println(letter);
    }
}
