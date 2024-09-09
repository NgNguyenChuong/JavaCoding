import java.util.Scanner;

public class Buoi01BaiTap05 {
    public static void main(String[] args) {
        final float Pi = 3.14f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius to calculate circumference and area!");
        System.out.print("Enter Radius: ");
        int radius = scanner.nextInt();
        float circumference =(float)2 * Pi * radius;
        float areaOfCircle = (float)Math.pow(radius,2) * Pi;

        System.out.printf("The circumference is: %.2f\n", circumference);
        System.out.printf("The area of circle is: %.2f", areaOfCircle);
    }
}
