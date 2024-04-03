import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true) {
            int number = scanner.nextInt();

            if (number > 9 && number < 100) {
                while (number > 0) {
                    sum += number % 10;
                    number /= 10;
                }
            } else {
                break;
            }
        }
        System.out.print(sum);
    }
}