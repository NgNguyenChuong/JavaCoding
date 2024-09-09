import java.util.Scanner;

public class Buoi01BaiTap10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate S = 1/(1*2) + 1/(2*3) + ...+ 1/(n*(n+1))");
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        double result = 0;
        for(int i = 1; i <= n; i++) {
            result += 1.0/(i*(i+1));
        }
        System.out.printf("Result: %.2f ", result);

    }
}
