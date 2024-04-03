import java.util.Scanner;
public class a9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        double x = Double.parseDouble(input[0]);
        double y = Double.parseDouble(input[1]);
        double n = Math.PI;
        if ((Math.pow(x, 2) + Math.pow(y, 2) <= 1.0) || (y < 1.0 && x < 1.0) && (0 < y && 0 < x)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}