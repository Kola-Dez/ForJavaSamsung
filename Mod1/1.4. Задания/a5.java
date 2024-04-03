import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int i = scanner.nextInt();
        
        int mask = (1 << i) - 1;
        
        int result = A & mask;
        
        System.out.println(result);
    }
}
