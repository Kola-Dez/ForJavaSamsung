import java.util.Scanner;
public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        double x = Double.parseDouble(input[0]);
        double y = Double.parseDouble(input[1]);

        if (((y >= 0) && (y <= x)) && (Math.pow(x,2) + Math.pow(y,2) >= 4) && (x <= 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}