import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Sum = 0;
        String digits = Integer.toString(N);
        for (int i = 0; i < digits.length() - 1; i++) {
            if (Character.getNumericValue(digits.charAt(i)) == Character.getNumericValue(digits.charAt(i + 1))) {
                System.out.println("YES");
                Sum = 1;
                break;
            }
        }
        if (Sum == 0) {
            System.out.println("NO");
        }
    }
}
