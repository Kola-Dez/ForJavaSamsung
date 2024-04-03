import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int diagonalSquared = A * A + B * B;

        System.out.println(diagonalSquared);

        scanner.close();
    }
}