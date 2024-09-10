import java.util.Scanner;

public class Buoi03BaiTap17 {
    public static boolean checkEvenNumber(int n) {
        if(n % 2 == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println("Perfect number is the number of even digit equal to odd digit");
        System.out.print("Enter N: ");
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int flag = 1;
        while(n > 0) {
            int temp = (int)n % 10;
            if(checkEvenNumber(temp)) {
                flag++;
            }
            else flag--;
            n /= 10;
        }
        if(flag == 1) {
            System.out.println("It is perfect number!");
        }
        else System.out.println("It is not perfect number!");
    }
}
