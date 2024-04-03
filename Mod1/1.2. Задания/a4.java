import java.util.Scanner;
public class a4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), n = scanner.nextInt(); 
        a *= n; b *= n;
        if(b > 100) {
            a += b / 100;
            b %= 100;
        }
        System.out.println(a + " " + b);
    }
}