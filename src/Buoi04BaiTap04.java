import java.util.Scanner;

public class Buoi04BaiTap04 {

    public static boolean checkPrime(int n) {
        if(n < 2) return false;
        if(n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static int sumOfDigit(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static boolean binarySearch(int[] arr, int l, int r, int key) {
        if(l > r) return false;
        int mid = (l + r) / 2;
        if(arr[mid] == key) return true;
        if(arr[mid] > key) return binarySearch(arr, l, mid - 1, key);
        return binarySearch(arr, mid + 1, r, key);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Beautiful number!");
        System.out.print("Enter Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = scanner.nextInt();
        int fibo[] = new int[100];
        // init
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i < 90; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        for(int i = num1; i < num2; i++) {
            if(checkPrime(i) && binarySearch(fibo, 0, 90, sumOfDigit(i))) System.out.print(i + " ");
        }

    }
}
