import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int wordCount = countWords(inputString);
        System.out.println(wordCount);
    }

    private static int countWords(String s) {
        String[] words = s.split("\\s+");
        return words.length;
    }
}
