import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Sum = 0;
        String digits = Integer.toString(N);
        for (int i = 0; i < digits.length(); i++) {
            Sum += Character.getNumericValue(digits.charAt(i));
        }
        System.out.println(Sum);
    }
}