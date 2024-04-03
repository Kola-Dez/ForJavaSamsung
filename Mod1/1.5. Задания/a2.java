import java.util.Scanner;
public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        if ((x >= -3 && x <= 5) || (x >= 9 && x <= 15)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}