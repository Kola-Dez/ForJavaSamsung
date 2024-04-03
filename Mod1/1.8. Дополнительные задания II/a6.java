import java.util.Scanner;

public class a6
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            maxElement = Math.max(maxElement, num);
        }
        System.out.println(maxElement);
    }
}
