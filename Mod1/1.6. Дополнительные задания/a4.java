import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maxNumber = findMaxOfThree(a, b, c);

        System.out.println(maxNumber);

        scanner.close();
    }

    private static int findMaxOfThree(int a, int b, int c) {
        int maxAB = Math.max(a, b);
        return Math.max(maxAB, c);
    }
}
