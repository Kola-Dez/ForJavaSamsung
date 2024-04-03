import java.util.Scanner;
public class a5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[4];

        for (int i = 0; i < 4; i++) {
            numbers[i] = scanner.nextInt();
        }

        boolean foundOppositePair = false;

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (numbers[i] == -numbers[j]) {
                    foundOppositePair = true;
                    break;
                }
            }
            if (foundOppositePair) {
                break;
            }
        }

        if (foundOppositePair) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}