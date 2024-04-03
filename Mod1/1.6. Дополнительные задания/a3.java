import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = scanner.nextInt();

        if (decimalNumber >= 1 && decimalNumber <= 100) {
            String romanNumber = convertToRoman(decimalNumber);
            System.out.println(romanNumber);
        } else {
            return;
        }

        scanner.close();
    }

    private static String convertToRoman(int number) {
        int[] decimalValues = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumber = new StringBuilder();

        for (int i = 0; i < decimalValues.length; i++) {
            while (number >= decimalValues[i]) {
                romanNumber.append(romanSymbols[i]);
                number -= decimalValues[i];
            }
        }

        return romanNumber.toString();
    }
}
