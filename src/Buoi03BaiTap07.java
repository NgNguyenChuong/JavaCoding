import java.sql.SQLOutput;
import java.util.Scanner;

public class Buoi03BaiTap07 {
    public static void main(String[] args) {
        System.out.println("Calculate S = 2 + 4 + 6 + ... + 2*n");
        System.out.print("Enter N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = 0;
        // with loop
        for(int i = 1; i <= n; i++) {
            result += 2*i;
        }
        // with brain
        long temp = n * (n + 1);
        System.out.println("Result= " + result);
        System.out.println("Result= " + temp);
    }
}
