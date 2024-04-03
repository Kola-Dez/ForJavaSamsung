import java.util.Scanner;

public class a4
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int countPositive = 0;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num > 0) {
                countPositive++;
            }
        }

        System.out.println(countPositive);
    }
}
