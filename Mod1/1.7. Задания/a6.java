import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        do {
            N = scanner.nextInt();
        } while (N <= 25 || N % 2 == 0);
            int sum = 0;
            for (int i = 26; i <= N; i += 2) {
                sum += i;
            }

            System.out.println(sum);
        scanner.close();
    }
}

