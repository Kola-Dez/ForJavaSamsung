import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] result = euclideanAlgorithm(a, b);
        // Вывод результатов
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] euclideanAlgorithm(int a, int b) {
        int steps = 0;
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
            steps++;
        }
        return new int[]{a, steps};
    }
}
