import java.util.Scanner;

public class Buoi01BaiTap06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculate distance between 2 point in Oxy axis system!");
        System.out.print("Enter point 1(x;y): ");
        short x1 = scanner.nextShort();
        short y1 = scanner.nextShort();
        System.out.print("Enter Point 2(x;y): ");
        short x2 = scanner.nextShort();
        short y2 = scanner.nextShort();

        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.printf("Distance between 2 point is: %.2f ", distance );


    }
}
