import java.util.Scanner;

public class Buoi01BaiTap29 {
    public static void main(String[] args) {
        System.out.println("Check academic ability!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 4 type of score you achieved: ");
        double score1 = scanner.nextDouble();
        double score2 = scanner.nextDouble();
        double score3 = scanner.nextDouble();
        double score4 = scanner.nextDouble();

        double rating =(score1 + score2 + score3 * 2 + score4 * 3) / 7;
        if(rating >= 8 ) System.out.println("A");
        else if(rating < 8 && rating >= 6.5) System.out.println("B");
        else if(rating < 6.5 && rating >= 5) System.out.println("C");
        else System.out.println("D");

    }
}
