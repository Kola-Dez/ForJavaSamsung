import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999 && number % 5 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}