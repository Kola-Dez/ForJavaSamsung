import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        if ((x < -2 || x > 3) && (x < 6 || x > 9)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}