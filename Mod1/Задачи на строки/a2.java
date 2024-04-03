import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar = scanner.next().charAt(0);
        char resultChar = ChangeCase(inputChar);
        System.out.println(resultChar);
    }

    private static char ChangeCase(char c) {
        if (Character.isLetter(c)) {
            if (Character.isUpperCase(c)) {
                return Character.toLowerCase(c);
            } else {
                return Character.toUpperCase(c);
            }
        } else {
            return c;
        }
    }
}
