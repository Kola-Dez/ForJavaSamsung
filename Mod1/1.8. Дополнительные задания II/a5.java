import java.util.Scanner;

public class a5
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int countGreaterThanPrevious = 0;
        int prev = scanner.nextInt();

        for (int i = 1; i < N; i++) {
            int num = scanner.nextInt();
            if (num > prev) {
                countGreaterThanPrevious++;
            }
            prev = num;
        }
        System.out.println(countGreaterThanPrevious);
    }
}
