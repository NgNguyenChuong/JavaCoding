import java.util.Scanner;

public class Buoi02BaiTap03 {
    public static void main(String[] args) {
        System.out.println("1A codeforces!");
        System.out.print("Enter 2 side of rectangle and side of square: ");
        int side1, side2, count1, count2, sideOfSquare;
        Scanner scanner = new Scanner(System.in);
        side1 = scanner.nextInt();
        side2 = scanner.nextInt();
        sideOfSquare = scanner.nextInt();

        if(side1 % sideOfSquare == 0) count1 = side1 / sideOfSquare;
        else count1 = side1 / sideOfSquare + 1;

        if(side2 % sideOfSquare == 0) count2 = side2 / sideOfSquare;
        else count2 = side2 / sideOfSquare + 1;

        System.out.printf("Result = %d ", count1 * count2);



    }
}
