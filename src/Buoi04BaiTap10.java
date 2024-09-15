import java.util.Scanner;

public class Buoi04BaiTap10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        int countOdd = 0;
        int countEven = 0;

        while(number > 0) {
            int temp = number % 10;
            if(temp % 2 == 0) countEven++;
            else countOdd++;
            number /= 10;
        }
        System.out.println(countEven + " " + countOdd);

    }
}
