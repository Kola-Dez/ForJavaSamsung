import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();

        findCombinations(a, b, c, n);
    }

    public static void findCombinations(int a, int b, int c, int n) {
        int count = 0;

        for (int ka = 0; ka <= n / a; ka++) {
            for (int kb = 0; kb <= n / b; kb++) {
                int kc = (n - ka * a - kb * b) / c;
                if (ka * a + kb * b + kc * c == n && kc >= 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        count = 0;
        for (int ka = 0; ka <= n / a; ka++) {
            for (int kb = 0; kb <= n / b; kb++) {
                int kc = (n - ka * a - kb * b) / c;
                if (ka * a + kb * b + kc * c == n && kc >= 0) {
                    System.out.println(ka + " " + kb + " " + kc);
                    count++;
                }
            }
        }
    }
}
