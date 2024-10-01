package strategy;

public class PancakeSort implements APCStrategy {

    @Override
    public String checkAPC(int[] values) {
        long startTime = System.nanoTime();
        pancakeSort(values);
        long endTime = System.nanoTime();
        return "Pancake Sort: " + (endTime - startTime) + " nanoseconds";
    }

    static void flip(int[] arr, int i) {
        int temp;
        int start = 0;
        while (start < i) {
            temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            start++;
            i--;
        }
    }

    private void pancakeSort(int[] arr) {
        for (int i = arr.length; i > 1; i--) {
            int maxIndex = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            flip(arr, maxIndex);
            flip(arr, i - 1);
        }
    }
    
}
