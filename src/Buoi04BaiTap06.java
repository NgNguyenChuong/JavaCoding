import java.util.Scanner;

public class Buoi04BaiTap06 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("phan tich thua so nguyen to cua n!");
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        for(int i = 2; i <= Math.sqrt(n) ; i++) {
            while(n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if(n>1) System.out.println(n);



    }
}
