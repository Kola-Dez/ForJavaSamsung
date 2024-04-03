import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(proizv(scanner.nextInt(), scanner.nextInt()));
    }
    public static int proizv (int num, int firstNum)
    {
        int proizv = 0;
        for (int i = 0; i < Math.abs(firstNum); i++)
            proizv += num;
        return firstNum < 0 ? -proizv : proizv;
    }
} 


