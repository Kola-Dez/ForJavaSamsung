import java.util.Scanner;
public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int clears = scanner.nextInt();
        long mask = (1L << clears) - 1;
        long A = number & ~mask;
        System.out.println(A);
    }
}