import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        if (x >= 3 && x <= 8) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}