import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }

        String result = checkExcursion(N, heights);
        System.out.println(result);
    }
    static String checkExcursion(int N, int[] heights) {
        int busHeight = 437;

        for (int i = 0; i < N; i++) {
            if (heights[i] <= busHeight) {
                return "Crash " + (i + 1);
            }
        }
        return "No crash";
    }
}
