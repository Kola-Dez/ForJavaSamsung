import java.util.Scanner;


public class a4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        findNumber(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

    public static void findNumber(int a, int b, int c, int d) {
        int[] arr = new int[100000];
        int count = 0;

        if (0 <= b && b < a && a <= Math.pow(10, 9) && 0 <= d && d <= c) {
            for (int i = (int)Math.pow(10, 4); i <= 99999; i++) {
                if (i % a == b && i % c == d) {
                    arr[count++] = i;
                }
            }
        }

        if (count == 0) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < count; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
