import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        if (0 <= num && num < 10) {
            System.out.println("DIGIT");
        } else if (10 <= num && num <= 99) {
            System.out.println("NUM");
        } else {
            System.out.println("OTHER");
        }
        scanner.close();
    }
}
