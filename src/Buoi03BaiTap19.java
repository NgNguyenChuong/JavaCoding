import java.util.Scanner;

public class Buoi03BaiTap19 {
    public static void main(String[] args) {
        System.out.println("703A Codeforces!");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int check = 0;
        for(int i = 1; i <= n; i++) {
            int a,b;
            a = scanner.nextInt();
            b = scanner.nextInt();
            if(a > b) check++;
            else if(a < b) check--;
        }
        if(check > 0) System.out.println("Mishka");
        else if(check < 0) System.out.println("Chris");
        else System.out.println("Friendship is magic!");
    }
}
