import java.util.Scanner;

public class Buoi02BaiTap01 {
    public static void main(String[] args) {
        System.out.println("Find sum of lengths of all 12 edges of this parallelepiped when know the areas of its three faces!");
        System.out.print("Enter the areas of its three faces:");
        Scanner scanner = new Scanner(System.in);
        int face1 = scanner.nextInt();
        int face2 = scanner.nextInt();
        int face3 = scanner.nextInt();

        int side1 = (int)Math.sqrt((face1 * face2)/face3);
        int side2 = face1 / side1;
        int side3 = face2 / side1;

        int result = 4 * ( side1 + side2 + side3 );
        System.out.println("Result = " + result);



    }
}
