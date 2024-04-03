import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String result = isPalindrome(inputString) ? "yes" : "no";
        System.out.println(result);
    }

    private static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s", "").toLowerCase();
        String reversedString = new StringBuilder(s).reverse().toString();
        return s.equals(reversedString);
    }
}
