import java.util.Scanner;

public class a6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int tmp = array[0], tmps = 1;
        for (int i : array)
        {
            int popular = 0;
            for (int j : array)
            {
                if(i == j)
                    popular++;
                if (popular > tmps)
                {
                    tmps = popular;
                    tmp = i;
                }
            }
        }
        System.out.print(tmp);
    }
}
