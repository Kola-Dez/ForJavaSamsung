import java.util.Scanner;

public class a3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); double sum = 0;
        int flag = 0;
        if(1 <= N && N <= Math.pow(10, 4))
        {
            int[] array = new int[N];
            for (int i = 0; i < N; i++)
            {
                array[i] = scanner.nextInt();
            }
            for (int i = 0; i < N; i++)
            {
                if (array[i] % 2 != 0){
                    sum += array[i];
                    flag++;
                }
            }
            if(flag != 0)
            {
                sum /= flag;
            }
        }
        if (sum == 0)
            System.out.print("NO");
        else
            System.out.printf("%.2f", sum);
    }
}
