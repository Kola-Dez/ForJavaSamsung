public class NumberDigits {
    public static int sumOfThirteen(int n){
        int count = 0;
        for (int i = 0; i < n; i++){
            int tmp = 0, temp = i;
            for (int j = 0; j < n; j++) {
                tmp += temp % 10;
                temp /= 10;
            }
            if(tmp % 13 == 0){
                count++;
            }
        }
        return count;
    }
}