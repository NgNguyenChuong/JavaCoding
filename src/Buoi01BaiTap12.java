import java.util.Scanner;

public class Buoi01BaiTap12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pos add neg apart from 0 to N!");
        System.out.print("Enter N: ");
        long N = scanner.nextLong();
        long result = 0;
        if(N % 2 == 0) result = N / 2;
        else result = - (N + 1) / 2;
        System.out.println("Result: " + result);
    }
}
