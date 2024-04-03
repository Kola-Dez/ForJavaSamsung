import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        System.out.println(Integer.toBinaryString(X));
        System.out.println(Integer.toOctalString(X));
        System.out.println(Integer.toHexString(X));
        if (X >= Byte.MIN_VALUE && X <= Byte.MAX_VALUE) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        if (X >= Short.MIN_VALUE && X <= Short.MAX_VALUE) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
