import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char inputChar = scanner.next().charAt(0);

        if (IsDigit(inputChar)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    private static boolean IsDigit(char c) {
        return Character.isDigit(c);
    }
}
