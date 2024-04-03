import java.util.Scanner;

public class a9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int tmp = 10;
        while (N > 0) {
            int temp = (N % 10);
            if(temp < tmp && temp != 0) {
                tmp = temp;
                
            }
            N /= 10;
        }
        System.out.println(tmp == 10? "NO": tmp);
        scanner.close();
    }
}
