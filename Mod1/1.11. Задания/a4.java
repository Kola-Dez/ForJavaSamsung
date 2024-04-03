import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        array = new int[n][m];
        for (int i = 0; i < n * m; i++) {
            array[i / m][i % m] = (i / m) * (i % m);
        }
        for (int i = 0; i < n * m; i++) {
            System.out.printf("%d ", (i / m) * (i % m));
        }
    }
}