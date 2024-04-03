import java.util.Scanner;
public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        double x = Double.parseDouble(input[0]);
        double y = Double.parseDouble(input[1]);
        double n = Math.PI;
        if ((x > 0 && y > 0) && (Math.sin(x) > y) && (y < 0.5) && (x <= Math.PI)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}