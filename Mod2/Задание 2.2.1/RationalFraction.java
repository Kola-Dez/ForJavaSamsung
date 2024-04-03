public class RationalFraction {
    private int numerator;
    private int denominator;

    public RationalFraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify(); // Сокращаем дробь при создании
    }

    // Метод для нахождения наибольшего общего делителя
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Метод для сокращения дроби
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    // Метод для сложения дробей
    public RationalFraction add(RationalFraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalFraction(newNumerator, newDenominator);
    }

    // Метод для вычитания дробей
    public RationalFraction subtract(RationalFraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalFraction(newNumerator, newDenominator);
    }

    // Метод для умножения дробей
    public RationalFraction multiply(RationalFraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalFraction(newNumerator, newDenominator);
    }

    // Метод для деления дробей
    public RationalFraction divide(RationalFraction other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new RationalFraction(newNumerator, newDenominator);
    }

    // Метод для преобразования дроби в строку для вывода
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        RationalFraction fraction1 = new RationalFraction(1, 2);
        RationalFraction fraction2 = new RationalFraction(1, 3);

        // Тестирование методов
        System.out.println("Сложение: " + fraction1.add(fraction2));
        System.out.println("Вычитание: " + fraction1.subtract(fraction2));
        System.out.println("Умножение: " + fraction1.multiply(fraction2));
        System.out.println("Деление: " + fraction1.divide(fraction2));
    }
}
