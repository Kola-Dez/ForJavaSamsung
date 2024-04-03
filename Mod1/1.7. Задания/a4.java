import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int quotient = 0;
        int remainder = 0;

        while (A >= B) {
            A -= B;
            quotient++;
        }
        remainder = A;

        System.out.println(quotient + " " + remainder);
    }
}
