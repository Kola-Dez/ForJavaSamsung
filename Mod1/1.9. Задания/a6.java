public class MyArrays {
    public static void minToBegin ( int[] arr ){
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        if (minIndex == 0) {
            return;
        }
        int minValue = arr[minIndex];
        for (int i = minIndex; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = minValue;
    }

}