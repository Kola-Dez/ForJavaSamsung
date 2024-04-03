import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int coutn = 0;
        // Считываем элементы матрицы
        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        rotateMatrix(matrix, N, M);


    }

    // Метод для поворота матрицы
    public static void rotateMatrix(int[][] matrix, int N, int M) {
        int[][] transposedMatrix = new int[M][N];

        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                transposedMatrix[i][j] = matrix[j][i];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N/2; j++) {
                int temp = transposedMatrix[i][j];
                transposedMatrix[i][j] = transposedMatrix[i][N - 1 - j];
                transposedMatrix[i][N - 1 - j] = temp;
            }
        }
        System.out.println(M + " " + N);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
