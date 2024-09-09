import java.util.Scanner;

public class Buoi01BaiTap07 {
    public static void main(String[] args) {
        System.out.println("Changing temperature unit from C to F!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature(C unit): ");
        double cUnit = scanner.nextDouble();
        double fUnit = (cUnit * 9 / 5) + 32;
        System.out.printf("Temperature becoming to: %.2f", fUnit);

    }
}
