import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        generateMatrix2(n);
    }

    public static void printMatrix(int[][] a) {
        for (int[] row : a) {
            StringBuilder s = new StringBuilder();
            for (int item : row) {
                s.append(String.format("%3d", item));
            }
            System.out.println(s);
        }
        System.out.println();
    }

    public static int[][] generateMatrix2(int n) {
        int k = 2 * n + 1;
        int[][] a = new int[k][k];
        a[n][n] = 0;

        int i = n - 1, j = n;

        for (int c = 1; c < k * k; c++) {
            a[i][j] = c;

            if (j > i && j == k - i - 1) {
                i -= 1;
            } else if (j > i && j <= k - i - 1) {
                j -= 1;
            } else if (j >= i && j > k - i - 1) {
                i -= 1;
            } else if (j < i && j >= k - i - 1) {
                j += 1;
            } else if (j <= i && j < k - i - 1) {
                i += 1;
            }
        }

        printMatrix(a);
        return a;
    }
}
