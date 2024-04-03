import java.util.Scanner;

public class a3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), c = 0;
        for (int i = 1; c < num; i++)
        {
            if (i % 2 == 0){
                System.out.print(i + " ");
                c++;
            }
        }
    }
}
