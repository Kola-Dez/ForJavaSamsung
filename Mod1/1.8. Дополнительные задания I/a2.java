import java.util.Scanner;

public class a2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int expectedSum = N * (N + 1) / 2;

        for (int i = 1; i < N; i++)
        {
            int cardNumber = scanner.nextInt();
            expectedSum -= cardNumber;
        }
        System.out.println(expectedSum);
    }
}
