import java.util.Scanner;

public class Buoi01BaiTap26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check type of triangle!");
        System.out.print("Enter 3 side of a triangle: ");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        if(side1 == side2 && side2 == side3 ) {
            System.out.println("Equilateral triangle");
        }
        else if(side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles triangle");
        }
        else if(side1*side1 == side2*side2 + side3*side3
                || side2*side2 == side3*side3 + side1*side1
                || side3*side3 == side1*side1+side2*side2) {
            System.out.println("Right triangle");
        }
        else System.out.println("Normal triangle");


    }
}
