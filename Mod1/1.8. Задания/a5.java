import java.util.Scanner;

public class a5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < N/2; i++)
        {
            int tmp = array[N - i - 1];
            array[N - i - 1] = array[i];
            array[i] = tmp;
        }
        for (int i = 0; i < N; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
