import java.util.Scanner;

public class Buoi03BaiTap18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prime Factors!");
        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
        boolean flag = false;
        if(n % 2 == 0) {
            flag = true;
        }

            System.out.println(n / 2);


        for(int i = 1; i < n/2; i++) {
            System.out.print(2 + " ");
        }
        if(flag) {
            System.out.print(2);
        }
        else {
            System.out.print(3);
        }
    }
}
