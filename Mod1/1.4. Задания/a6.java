import java.util.Scanner;
public class a6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N == 1) {
            System.out.println(0);
        } else {
            while (N % 2 == 0) {
                N /= 2;
            }
            if (N == 1) {
                System.out.println(0);
            } else {
                System.out.println(N);
            }
        }
    }
}
