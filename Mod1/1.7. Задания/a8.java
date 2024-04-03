import java.util.Scanner;

public class a8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int tmp = 0;
        while (N > 0) {
            int temp = (N % 10);
            if(temp % 2 != 0 && temp != 1) {
                tmp = temp;
            }
            N /= 10;
        }
        System.out.println(tmp == 0? "NO": tmp);
        scanner.close();
    }
}

