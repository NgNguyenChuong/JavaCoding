import java.util.Scanner;

public class Buoi03BaiTap01 {
    public static void main(String[] args) {
        System.out.println("Calculat S = 1 + 2 +... + N");
        System.out.print("Enter N: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long result = 0;
        for(int i = 0; i <= N; i++) {
            result +=i;
        }
        System.out.println("Result = " + result);

    }
}
