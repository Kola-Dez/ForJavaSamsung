import java.util.Scanner;

public class a1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++)
            array[i] = scanner.nextInt();

        int X = scanner.nextInt();

        for (int i = 0 ; i < N ; i++)
            if(array[i] == X)
            {
                System.out.println(i+1);
                return;
            }

        System.out.println("NO");
    }
}
