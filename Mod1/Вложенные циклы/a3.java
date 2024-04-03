import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        printPrimeNumbersInRange(a, b);
    }

    public static void printPrimeNumbersInRange(int a, int b) {
        boolean[] isPrime = new boolean[b + 1];
        for (int i = 2; i <= b; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= b; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= b; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        boolean foundPrime = false;
        for (int i = Math.max(2, a); i <= b; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                foundPrime = true;
            }
        }
        if (!foundPrime) {
            System.out.print(0);
        }
    }
}
