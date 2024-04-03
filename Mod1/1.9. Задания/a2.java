public class NumberDigits {
    public static int sumOfSeven(int a, int b) {
        int s=0;
        for(int i=a; i<=b; i++){
            if(i>=10 && i<=99 && i%7==0){
                s+=i%10+i/10;
            }
        }
        return s;
    }

}