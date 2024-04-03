import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Пожалуйста, введите натуральное число.");
            return;
        }
        int count = 0;
        while (number > 0) {
            number /= 2;
            count++;
        }
        System.out.println(count);
        scanner.close();
    }
}
