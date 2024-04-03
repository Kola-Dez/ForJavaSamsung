import java.util.Scanner;

public class a3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] sequence = new int[N];

        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (sequence[i] % 2 == 0) {
                System.out.print(sequence[i] + " ");
            }
        }
    }
}
