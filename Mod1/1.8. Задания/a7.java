import java.util.Scanner;

public class a7
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        int[] array2 = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int tmp = 0;
        for (int i = 0; i < N; i++) {
            if(array[i] < 0){
                array2[tmp] = array[i];
                tmp++;
            }
        }
        for (int i = 0; i < N; i++) {
            if( array[i] > 0 ){
                array2[tmp] = array[i];
                tmp++;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
