import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        if (isValidInput(month, day)) {
            int daysUntilNewYear = calculateDaysUntilNewYear(month, day);
            System.out.println(daysUntilNewYear);
        } else {
            System.out.println(-1);
        }

        scanner.close();
    }

    private static boolean isValidInput(int month, int day) {
        return (month >= 1 && month <= 12) && (day >= 1 && day <= 31);
    }

    private static int calculateDaysUntilNewYear(int month, int day) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (isValidInput(month, day) && day <= daysInMonth[month]) {
            int daysPassed = calculateDaysPassed(month, day);
            return 365 - daysPassed;
        } else {
            return -1;
        }
    }

    private static int calculateDaysPassed(int month, int day) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int daysPassed = 0;
        for (int i = 1; i < month; i++) {
            daysPassed += daysInMonth[i];
        }
        daysPassed += day;
        return daysPassed;
    }
}
