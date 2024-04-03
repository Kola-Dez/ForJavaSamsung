public class NumberDigits {
    public static void binFraction(double x, int n) {
        for (int i = 0; i < n; i++) {

            x *= 2;
            if (x >= 1) {
                System.out.print("1");
                x -= 1;
            } else {
                System.out.print("0");
            }
        }
        return;
    }

}