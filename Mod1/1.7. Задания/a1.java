import java.util.Scanner;
import java.lang.Math;

public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        while (true) {
            if(num < 0) {count++;break;}
            num = scanner.nextInt();
            count++;
        }        
        System.out.println(count);
        scanner.close();
    }
}
