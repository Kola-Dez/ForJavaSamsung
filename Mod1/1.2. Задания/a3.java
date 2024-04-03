import java.util.Scanner;
public class a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        System.out.println(A + 2 - (A % 2));
        scanner.close();
    }
}