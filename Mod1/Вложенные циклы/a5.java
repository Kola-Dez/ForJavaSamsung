import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sequence = readSequence(scanner);
        int count = countMaxElements(sequence);
        System.out.println(count);
    }

    public static int[] readSequence(Scanner scanner) {
        int capacity = 10;
        int size = 0;
        int[] sequence = new int[capacity];

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (size == capacity) {
                capacity *= 2;
                int[] newSequence = new int[capacity];
                System.arraycopy(sequence, 0, newSequence, 0, size);
                sequence = newSequence;
            }

            sequence[size++] = number;
        }
        int[] result = new int[size];
        System.arraycopy(sequence, 0, result, 0, size);

        return result;
    }

    public static int countMaxElements(int[] sequence) {
        if (sequence.length == 0) {
            return 0;
        }

        int max = sequence[0];
        int count = 1;

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] > max) {
                max = sequence[i];
                count = 1;
            } else if (sequence[i] == max) {
                count++;
            }
        }

        return count;
    }
}
