import java.util.Scanner;
public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("%d", number % 10);
        scanner.close();
    }
}