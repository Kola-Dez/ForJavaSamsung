import java.util.Scanner;

public class a4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), factorial = 1;
        for (int i = N; i > 0; i--)
            factorial *= i;
        System.out.print(factorial);
    }
}
