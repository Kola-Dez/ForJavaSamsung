import java.util.Scanner;

public class a1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Считываем входные данные
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int[] sequence = new int[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = i + 1;
        }

        reverseSubarray(sequence, A - 1, B - 1);

        reverseSubarray(sequence, C - 1, D - 1);

        for (int num : sequence) {
            System.out.print(num + " ");
        }
    }
    private static void reverseSubarray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
