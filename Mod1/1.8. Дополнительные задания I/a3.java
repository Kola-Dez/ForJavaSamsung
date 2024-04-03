import java.util.Scanner;

public class a3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] array = new int[N][N];
        for (int i = 0, full = 1; i < N; i++)
            for (int j = 0; j < N; j++, full++)
                array[i][j] = full;

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if(i == j)
                    System.out.print(array[i][j] + " ");
    }
}
