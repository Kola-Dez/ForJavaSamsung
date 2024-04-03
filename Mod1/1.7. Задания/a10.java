import java.util.Scanner;
import java.lang.Math;

public class a10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[10000];
        int n = 10000;
        for(int i = 2; i*i < n; ++i)
        if(A[i] == 0)
            for(int k = i*i;k < n; k += i)
                A[k] = 1;
        for(int i = 2; i < n; ++i)
        if(A[i] == 0){
            if(N < i){
                System.out.printf("%d ", i);
                break;
            }
        }
        
        scanner.close();
    }
}
