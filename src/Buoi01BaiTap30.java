import java.util.Scanner;

public class Buoi01BaiTap30 {
    public static void main(String[] args) {
        System.out.println("Find number second smallest");
        System.out.print("Enter the number of numbers: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int smallest = 999999;
        int secondSmallest;
        for(int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if(number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            }
        }
        System.out.println("the smallest number is: " + smallest);
    }
}
