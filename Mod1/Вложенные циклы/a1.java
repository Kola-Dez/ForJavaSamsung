import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int tmp = n, size = 0;
        while (tmp > 0){
            tmp /= 10;
            size++;
        }
        int[] array = new int[size];
        tmp = n;
        for (int i = 0; tmp > 0; i++){
            array[i] = tmp % 10;
            tmp /= 10;
            size++;
        }
        tmp = -1;

        for (int i : array) {
            int count = 0;
            for (int j : array) {
                if (i == j){
                    count++;
                }
                if(count >= 2){
                    tmp = i;
                }
            }
        }
        if(tmp > -1){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}
