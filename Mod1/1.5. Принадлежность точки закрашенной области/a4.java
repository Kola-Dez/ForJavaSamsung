import java.util.Scanner;
public class a4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        double x = Double.parseDouble(input[0]);
        double y = Double.parseDouble(input[1]);
        double n = Math.PI;
        if (((y <= x) && (y >= Math.pow(x, 2) - 2 )) || ((y <= -x) && (y >= Math.pow(x, 2) - 2 ))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
