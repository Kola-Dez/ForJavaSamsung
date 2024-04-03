import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumGreaterThan10 = 0;

        while (true) {
            int number = scanner.nextInt();

            if (number > 10) {
                sumGreaterThan10 += number;
            }
            if (number % 5 == 0) {
                break;
            }

        }

        System.out.println(sumGreaterThan10 > 0 ? sumGreaterThan10 : 0);
    }
}
