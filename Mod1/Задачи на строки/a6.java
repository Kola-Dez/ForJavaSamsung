import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        char repeatedLetter = findRepeatedLetter(inputString);
        System.out.println(repeatedLetter);
    }

    private static char findRepeatedLetter(String s) {
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (s.indexOf(currentChar, i + 1) != -1) {
                return currentChar;
            }
        }
        return '\0';
    }
}
