import java.util.Scanner;

public class a8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        long n = scanner.nextLong();

        double result = fastPower(a, n);
        System.out.println(result);
    }

    public static double fastPower(double a, long n) {
        if (n == 0) {
            return 1;
        }

        double result = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= a;
            }
            a *= a;
            n /= 2;
        }
        return result;

    }
}