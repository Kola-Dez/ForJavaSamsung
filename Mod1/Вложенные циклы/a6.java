import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.println("Введите последовательность натуральных чисел, завершающуюся 0:");
        int[] sequence = readSequence(scanner);

        // Нахождение длины наибольшего монотонного фрагмента
        int maxLength = findMaxMonotonicFragmentLength(sequence);

        // Вывод результата
        System.out.println(maxLength);
    }

    public static int[] readSequence(Scanner scanner) {
        int capacity = 10; // начальная вместимость массива
        int size = 0;
        int[] sequence = new int[capacity];

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }

            // Увеличение вместимости массива при необходимости
            if (size == capacity) {
                capacity *= 2;
                int[] newSequence = new int[capacity];
                System.arraycopy(sequence, 0, newSequence, 0, size);
                sequence = newSequence;
            }

            sequence[size++] = number;
        }

        // Уменьшение размера массива до фактического количества элементов
        int[] result = new int[size];
        System.arraycopy(sequence, 0, result, 0, size);

        return result;
    }

    public static int findMaxMonotonicFragmentLength(int[] sequence) {
        if (sequence.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] > sequence[i - 1] || sequence[i] < sequence[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
    }
}
