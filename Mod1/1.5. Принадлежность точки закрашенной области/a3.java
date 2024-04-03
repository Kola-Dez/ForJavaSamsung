import java.util.Scanner;
public class a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        double x = Double.parseDouble(input[0]);
        double y = Double.parseDouble(input[1]);
        double n = Math.PI;
        if (((y >= 0) && (y <= (2 - Math.pow(x,2)))) || ((y >= x) && (y <= (2 - Math.pow(x,2))))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
