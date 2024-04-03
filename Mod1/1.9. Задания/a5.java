public class MyArrays {
    public static double avgOf4Digit ( int[] array){
        boolean flag = false;
        int count = 0;
        double avg = 0;
        double s = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 999 && array[i] <= 9999) {
                count++;
                s += array[i];
                avg = s / count;
                flag = true;
            }
        }
        if (flag) {
            return avg;
        }
        else return -1.0;
    }
}