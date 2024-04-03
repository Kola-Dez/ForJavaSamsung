import java.util.Scanner;
public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        System.out.println(1 << number);
    }
}