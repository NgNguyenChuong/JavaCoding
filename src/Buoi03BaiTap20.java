
import java.util.Scanner;

public class Buoi03BaiTap20 {
    public static void main(String[] args) {
        System.out.println("Trailing Zero!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        int count = 0;
        for(int i = 5; i <= num; i += 5) {
            int temp = i;
            while(temp >= 5) {
                if(temp % 5 != 0) break;
                count++;
                temp /= 5;
            }
        }
        System.out.println("Result = " + count );
    }
}
