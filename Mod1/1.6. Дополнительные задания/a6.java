import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (isTriangle(a, b, c)) {
            String triangleType = determineTriangleType(a, b, c);
            System.out.println(triangleType);
        } else {
            System.out.println("impossible");
        }

        scanner.close();
    }

    private static boolean isTriangle(int a, int b, int c) {
        // Проверяем неравенство треугольника: сумма двух сторон должна быть больше третьей
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

    private static String determineTriangleType(int a, int b, int c) {
        int[] sides = {a, b, c};
        // Сортируем стороны по возрастанию
        java.util.Arrays.sort(sides);

        // Вычисляем квадраты сторон
        int aSquared = sides[0] * sides[0];
        int bSquared = sides[1] * sides[1];
        int cSquared = sides[2] * sides[2];

        if (aSquared + bSquared == cSquared) {
            return "right"; // прямоугольный
        } else if (aSquared + bSquared > cSquared) {
            return "acute"; // остроугольный
        } else {
            return "obtuse"; // тупоугольный
        }
    }
}
