import java.util.Scanner;
public class a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        int i = scanner.nextInt();
        int mask = 1 << i;
        long result = A | mask;
        System.out.println(result);
    }
}