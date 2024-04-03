import java.util.Scanner;

public class a7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        while (N != 0) {
            N = N / 10;
            count++; 
        }
        System.out.println(count);
        scanner.close();
    }
}
