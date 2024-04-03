import java.util.Scanner;

public class a7
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int prevNumber = scanner.nextInt();
        int uniqueCount = 1;

        for (int i = 1; i < N; i++) {
            int currentNumber = scanner.nextInt();
            if (currentNumber != prevNumber) {
                uniqueCount++;
            }
            prevNumber = currentNumber;
        }
        System.out.println(uniqueCount);
    }
}
