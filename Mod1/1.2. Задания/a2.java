import java.util.Scanner;
public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(), tmp = 0;
        while(A > 0) {
            tmp += (A % 10);
            A /= 10;
        }
        System.out.println(tmp);
    }
}