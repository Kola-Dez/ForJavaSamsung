import java.util.Scanner;
public class a8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        double x = Double.parseDouble(input[0]);
        double y = Double.parseDouble(input[1]);
        double n = Math.pow(x,2) + Math.pow(y,2);
        if (  ( (n <= 1) && (x > 0) ) || ( ( y >= x - 1) && (y < 1) && (x > 0) )  ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
