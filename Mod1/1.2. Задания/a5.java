
import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long hours = (n % 86400) / 3600;
        long minutes = (n % 3600) / 60;
        long seconds = n % 60;

        System.out.printf("%d:%02d:%02d", hours, minutes, seconds);
        scanner.close();
    }
}
