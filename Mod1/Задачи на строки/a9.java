import java.util.Scanner;

public class a9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedText = scanner.nextLine();
        int k = scanner.nextInt();
        String decryptedText = decryptCaesarCipher(encryptedText, k);
        System.out.println(decryptedText);
    }

    private static String decryptCaesarCipher(String encryptedText, int k) {
        StringBuilder decryptedText = new StringBuilder();

        for (char letter : encryptedText.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                char decryptedLetter = (char) ('A' + (letter - 'A' - k + 26) % 26);
                decryptedText.append(decryptedLetter);
            } else {
                decryptedText.append(letter);
            }
        }

        return decryptedText.toString();
    }
}
