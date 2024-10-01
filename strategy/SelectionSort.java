package strategy;

public class SelectionSort implements APCStrategy{

    @Override
    public String checkAPC(int[] values) {
        long startTime = System.nanoTime();
        selectionSort(values);
        long endTime = System.nanoTime();
        return "Selection Sort: " + (endTime - startTime) + " nanoseconds";
    }

    private void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
}
