import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String resultString = removeRepeatedSpaces(inputString);
        System.out.println(resultString);
    }

    private static String removeRepeatedSpaces(String s) {
        return s.replaceAll("\\s+", " ");
    }
}
