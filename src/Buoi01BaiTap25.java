import java.util.Scanner;

public class Buoi01BaiTap25 {
    public static void main(String[] args) {
        System.out.println("Check triangle valid!");
        System.out.print("Enter 3 side of a triangle: ");

        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        boolean flag = true;
        if((side1 * side2 * side3) <= 0) flag = false;
        else if(side1 + side2 <= side3) flag = false;
        else if(side2 + side3 <= side1) flag = false;
        else if(side1 + side3 <= side2) flag = false;

        if(flag) System.out.println("Valid triangle");
        else System.out.println("Invalid triangle");
    }
}
