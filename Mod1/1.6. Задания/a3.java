import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        
        String ending = getEnding(number);
        
        System.out.println(number + " " + ending);
        
        scanner.close();
    }
    
    public static String getEnding(int number) {
        int lastDigit = number % 10;
        int lastTwoDigits = number % 100;
        
        if (lastTwoDigits >= 11 && lastTwoDigits <= 19) {
            return "TORTOV";
        } else if (lastDigit == 1) {
            return "TORT";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            return "TORTA";
        } else {
            return "TORTOV";
        }
    }
}
