import java.util.Scanner;

public class a2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), sum = 0;
        boolean flag = false;
        if(1 <= N && N <= Math.pow(10, 4))
        {
            int[] array = new int[N];
            for (int i = 0; i < N; i++){
                array[i] = scanner.nextInt();
            }
            for (int i = 0 ; i < N ; i++){
                if (Math.pow(-10, 5) <= array[i] && array[i] <= Math.pow(10, 5) && array[i] % 2 == 0)
                {
                    sum += array[i];
                    flag =  true;
                }
            }
        }
        System.out.println(flag ? sum : "NO");
    }
}
