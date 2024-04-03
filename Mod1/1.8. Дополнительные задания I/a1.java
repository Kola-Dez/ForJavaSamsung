import java.util.Scanner;

public class a1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        printBits(N);
    }
    public static void printBits(int num) {
        // Определение количества битов в числе
        int temp = num, count = 0;
        while (temp != 0) {
            temp >>= 1;
            count++;
        }
        // Вывод битов
        for (int i = 0; i < count ; i++) {
            System.out.print((num >> i) & 1);
        }
    }
}
