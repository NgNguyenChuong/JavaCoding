import java.util.Scanner;

public class Buoi03BaiTap08 {
    public static void main(String[] args) {
        System.out.println("Calculate S = 1 + 3 + 5 + ... + (2*n)-1");
        System.out.print("Enter N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = 0;
        // with brain
        long temp = (long)Math.pow(n, 2);
        // with loop
        for(int i = 1; i <= n; i++) {
            result += (2*i) - 1;

        }

        System.out.println("Result: " + result);
        System.out.println("Result= " + temp);
    }
}
