import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int min = (x < y) ? ((x < z) ? x : z) : ((y < z) ? y : z);
        int max = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
        
        int middle = x + y + z - min - max;

        System.out.println(min + " " + middle + " " + max);
        scanner.close();
    }
}
