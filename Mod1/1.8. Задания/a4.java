import java.util.Scanner;

public class a4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];

        int currentValue = 4;
        for (int i = 0; i < N; i++) {
            array[i] = currentValue;
            currentValue += 3;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(array[i]);
            if (i < N - 1) {
                System.out.print(" ");
            }
        }
    }
}
