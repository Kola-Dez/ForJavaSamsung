import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String longestWord = findLongestWord(inputString);
        System.out.println(longestWord);
        System.out.println(longestWord.length());
    }

    private static String findLongestWord(String s) {
        String[] words = s.split("\\s+");
        String longestWord = "";

        for (String word : words)
            if (word.length() > longestWord.length())
                longestWord = word;

        return longestWord;
    }
}
